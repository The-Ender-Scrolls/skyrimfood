package com.ryankshah.skyrimfood;

import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import com.ryankshah.skyrimfood.loot.SkyrimFoodLootTables;
import com.ryankshah.skyrimfood.network.recipe.SyncOvenRecipesPacket;
import com.ryankshah.skyrimfood.registry.RecipeRegistry;
import com.ryankshah.skyrimfood.world.WorldGenConstants;
import commonnetwork.api.Dispatcher;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

import java.util.Collection;

public class SkyrimFoodFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Initializing Skyrim Food");

        CommonClass.init();

        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            ServerPlayer player = handler.getPlayer();
            sendRecipesToClient(player);
        });

        SkyrimFoodLootTables.addLootTables();
        addFeatures();

        Constants.LOG.info("Finished Initializing Skyrim Food");
    }

    public static void sendRecipesToClient(ServerPlayer player) {
        RecipeManager recipeManager = player.level().recipeAccess();
        Collection<RecipeHolder<OvenRecipe>> ovenRecipes = recipeManager.getAllOfType(RecipeRegistry.OVEN.get());

        if (!ovenRecipes.isEmpty()) {
            SyncOvenRecipesPacket packet = new SyncOvenRecipesPacket(ovenRecipes.stream().toList());
            Dispatcher.sendToClient(packet, player);
        }
    }

    protected void addFeatures() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.MOUNTAIN_FLOWER_PLACED_KEY);

        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.BUSHES_PLACED_KEY);

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.MUSHROOMS_PLACED_KEY);

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(Biomes.DESERT, Biomes.SAVANNA_PLATEAU, Biomes.BADLANDS, Biomes.WOODED_BADLANDS, Biomes.ERODED_BADLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.DESERT_PLANTS_PLACED_KEY);

        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_BEACH),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.OYSTERS_PLACED_KEY);

        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.BIRDS_NEST_PLACED_KEY);

        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.LAVENDER_PLACED_KEY);

        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_HILL),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                WorldGenConstants.CREEP_CLUSTER_PLACED_KEY);
    }
}
