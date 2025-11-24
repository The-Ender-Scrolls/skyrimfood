package com.ryankshah.skyrimfood.data;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.registry.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class SkyrimFoodRecipeProvider extends RecipeProvider {

    public SkyrimFoodRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        // Oven recipe
        this.shaped(RecipeCategory.DECORATIONS, BlockRegistry.OVEN.get())
                .pattern("III")
                .pattern("I I")
                .pattern("SSS")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STONE)
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(this.output);
    }

    // Data generation runner class
    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new SkyrimFoodRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return Constants.MOD_ID + "_Recipes";
        }
    }
}