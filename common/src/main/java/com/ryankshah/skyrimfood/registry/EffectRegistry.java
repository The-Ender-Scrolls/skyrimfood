package com.ryankshah.skyrimfood.registry;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.effect.EffectCureDisease;
import com.ryankshah.skyrimfood.registration.RegistrationProvider;
import com.ryankshah.skyrimfood.registration.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class EffectRegistry
{
    public static void init() {}

    public static final RegistrationProvider<MobEffect> MOB_EFFECTS = RegistrationProvider.get(Registries.MOB_EFFECT, Constants.MOD_ID);

    public static final RegistryObject<MobEffect, MobEffect> CURE_DISEASE = MOB_EFFECTS.register("cure_disease", () -> new EffectCureDisease(
            MobEffectCategory.BENEFICIAL,
            0xA5F2F3
    ));
}