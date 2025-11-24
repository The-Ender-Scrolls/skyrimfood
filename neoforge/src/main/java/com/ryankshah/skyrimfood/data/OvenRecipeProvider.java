package com.ryankshah.skyrimfood.data;

import com.google.common.collect.Sets;
import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import com.ryankshah.skyrimfood.registry.BlockRegistry;
import com.ryankshah.skyrimfood.registry.ItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public abstract class OvenRecipeProvider {
    protected final HolderLookup.Provider registries;
    protected final RecipeOutput output;

    protected OvenRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        this.registries = registries;
        this.output = output;
    }

    protected abstract void buildRecipes();

    protected void addOvenRecipe(Item result, OvenRecipe recipe) {
        ResourceKey<Recipe<?>> recipeKey = ResourceKey.create(Registries.RECIPE,
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "oven/" + BuiltInRegistries.ITEM.getKey(result).getPath()));

        this.output.accept(recipeKey, recipe, null);
    }

    // Static inner class that implements the DataProvider.Runner pattern
    public static abstract class Runner implements DataProvider {
        private final PackOutput packOutput;
        private final CompletableFuture<HolderLookup.Provider> registries;

        protected Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            this.packOutput = packOutput;
            this.registries = registries;
        }

        public final CompletableFuture<?> run(CachedOutput cachedOutput) {
            return this.registries.thenCompose((holderLookup) -> {
                final PackOutput.PathProvider recipePathProvider = this.packOutput.createRegistryElementsPathProvider(Registries.RECIPE);
                final Set<ResourceKey<Recipe<?>>> recipeKeys = Sets.newHashSet();
                final List<CompletableFuture<?>> futures = new ArrayList<>();

                RecipeOutput recipeOutput = new RecipeOutput() {
                    @Override
                    public void accept(ResourceKey<Recipe<?>> recipeKey, Recipe<?> recipe, @Nullable net.minecraft.advancements.AdvancementHolder advancement, ICondition... conditions) {
                        if (!recipeKeys.add(recipeKey)) {
                            throw new IllegalStateException("Duplicate recipe " + recipeKey.location());
                        }

                        // Save the recipe
                        futures.add(DataProvider.saveStable(cachedOutput, holderLookup, Recipe.CONDITIONAL_CODEC,
                                Optional.of(new net.neoforged.neoforge.common.conditions.WithConditions<>(recipe, conditions)),
                                recipePathProvider.json(recipeKey.location())));
                    }

                    @Override
                    public net.minecraft.advancements.Advancement.Builder advancement() {
                        // For custom recipes without advancements, return a basic builder
                        return net.minecraft.advancements.Advancement.Builder.recipeAdvancement();
                    }

                    @Override
                    public void includeRootAdvancement() {
                        // Custom recipes typically don't need root advancement
                    }
                };

                // Create the recipe provider and build recipes
                this.createOvenRecipeProvider(holderLookup, recipeOutput).buildRecipes();

                return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
            });
        }

        protected abstract OvenRecipeProvider createOvenRecipeProvider(HolderLookup.Provider registries, RecipeOutput output);

        @Override
        public String getName() {
            return Constants.MOD_ID + " Oven Recipes";
        }
    }

    public static class SkyrimOvenRecipeProvider extends OvenRecipeProvider {

        public SkyrimOvenRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            super(registries, output);
        }

        @Override
        protected void buildRecipes() {
            addOvenRecipe(
                    ItemRegistry.SWEET_ROLL.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.SWEET_ROLL.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(Items.EGG),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get()),
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(Items.MILK_BUCKET)
                            ))
            );

            addOvenRecipe(
                    ItemRegistry.GARLIC_BREAD.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.GARLIC_BREAD.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(ItemRegistry.GARLIC.get()),
                                    Ingredient.of(ItemRegistry.FLOUR.get())
                            ))
            );

            addOvenRecipe(
                    ItemRegistry.APPLE_PIE.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.APPLE_PIE.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(Items.EGG),
                                    Ingredient.of(Items.APPLE)
                            ))
            );

            addOvenRecipe(
                    ItemRegistry.POTATO_BREAD.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.POTATO_BREAD.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get()),
                                    Ingredient.of(Items.MILK_BUCKET),
                                    Ingredient.of(Items.EGG),
                                    Ingredient.of(Items.POTATO)
                            ))
            );

            addOvenRecipe(
                    ItemRegistry.HORSE_HAUNCH.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.HORSE_HAUNCH.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.HORSE_MEAT.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get())
                            ))
            );

            addOvenRecipe(
                    ItemRegistry.LEG_OF_GOAT_ROAST.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.LEG_OF_GOAT_ROAST.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.LEG_OF_GOAT.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get())
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.APPLE_DUMPLING.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.APPLE_DUMPLING.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(Items.APPLE)
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.BRAIDED_BREAD.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.BRAIDED_BREAD.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get()),
                                    Ingredient.of(Items.MILK_BUCKET)
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.BOILED_CREME_TREAT.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.BOILED_CREME_TREAT.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(Items.EGG),
                                    Ingredient.of(Items.MILK_BUCKET)
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.CHICKEN_DUMPLING.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.CHICKEN_DUMPLING.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get()),
                                    Ingredient.of(Items.CHICKEN)
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.HONEY_NUT_TREAT.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.HONEY_NUT_TREAT.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(Items.HONEY_BOTTLE), // or use a honey item if you have one
                                    Ingredient.of(ItemRegistry.SALT_PILE.get())
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.JAZBAY_CROSTATA.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.JAZBAY_CROSTATA.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(ItemRegistry.JAZBAY_GRAPES.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get())
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.JUNIPER_BERRY_CROSTATA.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.JUNIPER_BERRY_CROSTATA.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(ItemRegistry.JUNIPER_BERRIES.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get())
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.LAVENDER_DUMPLING.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.LAVENDER_DUMPLING.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(BlockRegistry.LAVENDER_ITEM.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get())
                            ))
            );
            addOvenRecipe(
                    ItemRegistry.SNOWBERRY_CROSTATA.get(),
                    new OvenRecipe("food", new ItemStack(ItemRegistry.SNOWBERRY_CROSTATA.get(), 1), 1, 5,
                            NonNullList.of(
                                    Ingredient.of(ItemRegistry.FLOUR.get()),
                                    Ingredient.of(ItemRegistry.BUTTER.get()),
                                    Ingredient.of(ItemRegistry.SNOWBERRIES.get()),
                                    Ingredient.of(ItemRegistry.SALT_PILE.get())
                            ))
            );
        }
    }
}