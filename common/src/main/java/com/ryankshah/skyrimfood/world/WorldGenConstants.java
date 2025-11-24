package com.ryankshah.skyrimfood.world;

import com.ryankshah.skyrimfood.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class WorldGenConstants
{
    public static void init() {}

    public static final ResourceKey<PlacedFeature> MOUNTAIN_FLOWER_PLACED_KEY = registerPlacedFeature("mountain_flower_placed");
    public static final ResourceKey<PlacedFeature> LAVENDER_PLACED_KEY = registerPlacedFeature("lavender_placed");
    public static final ResourceKey<PlacedFeature> MUSHROOMS_PLACED_KEY = registerPlacedFeature("mushrooms_placed");
    public static final ResourceKey<PlacedFeature> CREEP_CLUSTER_PLACED_KEY = registerPlacedFeature("creep_cluster_placed");
    public static final ResourceKey<PlacedFeature> DESERT_PLANTS_PLACED_KEY = registerPlacedFeature("desert_plants_placed");
    public static final ResourceKey<PlacedFeature> OYSTERS_PLACED_KEY = registerPlacedFeature("oysters_placed");
    public static final ResourceKey<PlacedFeature> BIRDS_NEST_PLACED_KEY = registerPlacedFeature("birds_nest_placed");
    public static final ResourceKey<PlacedFeature> BUSHES_PLACED_KEY = registerPlacedFeature("bushes_placed");
    public static final ResourceKey<PlacedFeature> TREES_PLACED_KEY = registerPlacedFeature("trees_placed");
    public static final ResourceKey<PlacedFeature> PINE_TREE_PLACED_KEY = registerPlacedFeature("pine_tree_placed");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOUNTAIN_FLOWER_KEY = registerConfiguredFeature("mountain_flower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAVENDER_KEY = registerConfiguredFeature("lavender");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MUSHROOMS_KEY = registerConfiguredFeature("mushrooms");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CREEP_CLUSTER_KEY = registerConfiguredFeature("creep_clusters");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_PLANTS_KEY = registerConfiguredFeature("desert_plants");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OYSTERS_KEY = registerConfiguredFeature("oysters");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRDS_NEST_KEY = registerConfiguredFeature("birds_nest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BUSHES_KEY = registerConfiguredFeature("bushes");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_KEY = registerConfiguredFeature("trees");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE_KEY = registerConfiguredFeature("pine_tree");

    private static ResourceKey<PlacedFeature> registerPlacedFeature(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerConfiguredFeature(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}