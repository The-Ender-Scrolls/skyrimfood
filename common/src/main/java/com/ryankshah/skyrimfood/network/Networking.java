package com.ryankshah.skyrimfood.network;

import com.ryankshah.skyrimfood.network.recipe.FinishOvenRecipe;
import com.ryankshah.skyrimfood.network.recipe.OpenOvenScreen;
import com.ryankshah.skyrimfood.network.recipe.SyncOvenRecipesPacket;
import commonnetwork.api.Network;

public class Networking
{
    public static void load() {
        Network.registerPacket(FinishOvenRecipe.type(), FinishOvenRecipe.class,  FinishOvenRecipe.CODEC, FinishOvenRecipe::handle);
        Network.registerPacket(OpenOvenScreen.type(), OpenOvenScreen.class, OpenOvenScreen.CODEC, OpenOvenScreen::handle);
        Network.registerPacket(SyncOvenRecipesPacket.type(), SyncOvenRecipesPacket.class, SyncOvenRecipesPacket.CODEC, SyncOvenRecipesPacket::handle);
    }
}