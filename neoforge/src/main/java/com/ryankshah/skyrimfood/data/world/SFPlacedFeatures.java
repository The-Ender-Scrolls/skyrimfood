package com.ryankshah.skyrimfood.data.world;

import com.ryankshah.skyrimfood.world.WorldGenConstants;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static com.ryankshah.skyrimfood.world.WorldGenConstants.*;

public class SFPlacedFeatures
{
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, PINE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(PINE_TREE_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                )
        );

        register(context, LAVENDER_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.LAVENDER_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, MOUNTAIN_FLOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.MOUNTAIN_FLOWER_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, BUSHES_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.BUSHES_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, MUSHROOMS_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.MUSHROOMS_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(12),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );
        register(context, CREEP_CLUSTER_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.CREEP_CLUSTER_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(12),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, OYSTERS_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.OYSTERS_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(12),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                )
        );

        register(context, DESERT_PLANTS_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.DESERT_PLANTS_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(12),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                )
        );

        register(context, BIRDS_NEST_PLACED_KEY,
                configuredFeatures.getOrThrow(WorldGenConstants.BIRDS_NEST_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(4),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                )
        );
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        PlacedFeature feature = new PlacedFeature(configuration, List.copyOf(modifiers));
        context.register(key, feature);
    }
}