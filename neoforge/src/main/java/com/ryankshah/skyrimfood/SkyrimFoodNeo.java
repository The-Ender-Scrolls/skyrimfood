package com.ryankshah.skyrimfood;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class SkyrimFoodNeo
{
    public SkyrimFoodNeo(ModContainer container, IEventBus eventBus) {
        Constants.LOG.info("Initializing Skyrim Food");
        CommonClass.init();
        Constants.LOG.info("Finished Initializing Skyrim Food");
    }
}