package com.ryankshah.skyrimfood.data.world;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.world.WorldGenConstants;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class SFBiomeModifiers
{
    public static final ResourceKey<BiomeModifier> ADD_CORUNDUM_ORE = registerKey("add_corundum_ore");
    public static final ResourceKey<BiomeModifier> ADD_EBONY_ORE = registerKey("add_ebony_ore");
    public static final ResourceKey<BiomeModifier> ADD_MALACHITE_ORE = registerKey("add_malachite_ore");
    public static final ResourceKey<BiomeModifier> ADD_MOONSTONE_ORE = registerKey("add_moonstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_ORICHALCUM_ORE = registerKey("add_orichalcum_ore");
    public static final ResourceKey<BiomeModifier> ADD_QUICKSILVER_ORE = registerKey("add_quicksilver_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");

    public static final ResourceKey<BiomeModifier> ADD_MOUNTAIN_FLOWERS = registerKey("add_mountain_flowers");
    public static final ResourceKey<BiomeModifier> ADD_LAVENDER = registerKey("add_lavender");
    public static final ResourceKey<BiomeModifier> ADD_MUSHROOMS = registerKey("add_mushrooms");
    public static final ResourceKey<BiomeModifier> ADD_CREEP_CLUSTER = registerKey("add_creep_cluster");
    public static final ResourceKey<BiomeModifier> ADD_DESERT_PLANTS = registerKey("add_desert_plants");
    public static final ResourceKey<BiomeModifier> ADD_OYSTERS = registerKey("add_oysters");
    public static final ResourceKey<BiomeModifier> ADD_NESTS = registerKey("add_nests");
    public static final ResourceKey<BiomeModifier> ADD_BUSHES = registerKey("add_bushes");

    public static final ResourceKey<BiomeModifier> ADD_PLAINS_FLYING_MOBS = registerKey("add_plains_flying_mobs");
    public static final ResourceKey<BiomeModifier> ADD_DRIPSTONE_MOBS = registerKey("add_dripstone_mobs");
    public static final ResourceKey<BiomeModifier> ADD_SNOW_MOBS = registerKey("add_snow_mobs");
    public static final ResourceKey<BiomeModifier> ADD_PLAINS_MOBS = registerKey("add_plains_mobs");
    public static final ResourceKey<BiomeModifier> ADD_CAVE_MOBS = registerKey("add_cave_mobs");
    public static final ResourceKey<BiomeModifier> ADD_WATER_MOBS = registerKey("add_water_mobs");
    public static final ResourceKey<BiomeModifier> ADD_NPCS = registerKey("add_npcs");
    public static final ResourceKey<BiomeModifier> ADD_END_MOBS = registerKey("add_end_mobs");

    private static final ResourceKey<BiomeModifier> OVERWORLD = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "overworld_skyrimfood_spawns"));

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        var structures = context.lookup(Registries.STRUCTURE);

        context.register(ADD_MOUNTAIN_FLOWERS, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.MOUNTAIN_FLOWER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BUSHES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.BUSHES_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_MUSHROOMS, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.MUSHROOMS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DESERT_PLANTS, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.DESERT_PLANTS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_OYSTERS, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.OYSTERS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_NESTS, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.BIRDS_NEST_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_LAVENDER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.LAVENDER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CREEP_CLUSTER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_HILL),
                HolderSet.direct(placedFeatures.getOrThrow(WorldGenConstants.CREEP_CLUSTER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}