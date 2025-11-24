package com.ryankshah.skyrimfood.data;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.data.loot.SkyrimcraftLootTableProvider;
import com.ryankshah.skyrimfood.data.world.SFWorldGenProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class SkyrimFoodDataGen {
    
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Client event) {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();
        
        // Block Tags
        SkyrimFoodBlockTagsProvider blockTagsProvider = generator.addProvider(
            true,
            new SkyrimFoodBlockTagsProvider(packOutput, lookupProvider, Constants.MOD_ID)
        );
        
        // Item Tags (depends on block tags)
        generator.addProvider(
                true,
            new SkyrimFoodItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter())
        );
        
        // Loot Tables
        generator.addProvider(
                true,
            new LootTableProvider(packOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(SkyrimFoodBlockLootTables::new, LootContextParamSets.BLOCK),
                    new LootTableProvider.SubProviderEntry(SkyrimcraftLootTableProvider::new, LootContextParamSets.CHEST)
            ), lookupProvider)
        );
        
        // Recipes
        generator.addProvider(
                true,
                new SkyrimFoodRecipeProvider.Runner(packOutput, lookupProvider)
        );
        
        // Language
        generator.addProvider(
                true,
            new SkyrimFoodLanguageProvider(packOutput, "en_us")
        );

        // Models
        generator.addProvider(
                true,
                new SkyrimFoodModelProvider(packOutput)
        );

        generator.addProvider(
                true,
                new OvenRecipeProvider.Runner(packOutput, lookupProvider) {
                    @Override
                    protected OvenRecipeProvider createOvenRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
                        return new OvenRecipeProvider.SkyrimOvenRecipeProvider(registries, output);
                    }
                }
        );

        generator.addProvider(
                true,
                new SFWorldGenProvider(packOutput, lookupProvider)
        );
    }
}