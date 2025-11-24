package com.ryankshah.skyrimfood.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class EffectCureDisease extends InstantenousMobEffect
{
    public EffectCureDisease(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        entity.getActiveEffects().stream()
                .filter(mobEffectInstance -> mobEffectInstance.getEffect().value().getCategory() == MobEffectCategory.HARMFUL)
                .forEach(
                        mobEffectInstance -> entity.removeEffect(mobEffectInstance.getEffect())
                );
        return super.applyEffectTick(level, entity, amplifier);
    }
}