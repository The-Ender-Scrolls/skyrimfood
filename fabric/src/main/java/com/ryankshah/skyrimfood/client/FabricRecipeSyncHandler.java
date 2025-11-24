package com.ryankshah.skyrimfood.client;

import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import com.ryankshah.skyrimfood.network.recipe.SyncOvenRecipesPacket;
import com.ryankshah.skyrimfood.registry.RecipeRegistry;
import commonnetwork.api.Dispatcher;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.Collection;

public class FabricRecipeSyncHandler {

    public static void init() {
        initClient();
    }

    @Environment(EnvType.CLIENT)
    private static void initClient() {
        ClientPlayConnectionEvents.DISCONNECT.register((handler, client) -> {
            ClientRecipeCache.clearCache();
        });
    }
}