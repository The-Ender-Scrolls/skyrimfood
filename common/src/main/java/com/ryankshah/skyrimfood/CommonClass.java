package com.ryankshah.skyrimfood;

import com.ryankshah.skyrimfood.network.Networking;
import com.ryankshah.skyrimfood.registry.*;
import com.ryankshah.skyrimfood.world.WorldGenConstants;

public class CommonClass
{
    public static void init() {
        EffectRegistry.init();
        ItemRegistry.init();
        BlockRegistry.init();
        RecipeRegistry.init();
        CreativeTabRegistry.init();
        FeatureRegistry.init();
        WorldGenConstants.init();

        Networking.load();
    }
}