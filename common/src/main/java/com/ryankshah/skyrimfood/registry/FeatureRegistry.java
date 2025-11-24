package com.ryankshah.skyrimfood.registry;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.registration.RegistrationProvider;
import com.ryankshah.skyrimfood.registration.RegistryObject;
import com.ryankshah.skyrimfood.world.feature.NbtFeature;
import com.ryankshah.skyrimfood.world.feature.NbtFeatureConfig;
import com.ryankshah.skyrimfood.world.feature.PineTreeFeature;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class FeatureRegistry
{
    public static void init() {}

    public static final RegistrationProvider<Feature<?>> FEATURES = RegistrationProvider.get(BuiltInRegistries.FEATURE, Constants.MOD_ID);

    public static final RegistryObject<Feature<?>, Feature<NbtFeatureConfig>> NBT_FEATURE = FEATURES.register("nbt_feature", NbtFeature::new);
    public static final RegistryObject<Feature<?>, Feature<NoneFeatureConfiguration>> PINE_TREE = FEATURES.register("pine_tree", PineTreeFeature::new);
}
