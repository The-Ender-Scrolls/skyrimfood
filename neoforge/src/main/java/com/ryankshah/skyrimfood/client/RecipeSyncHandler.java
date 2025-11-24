package com.ryankshah.skyrimfood.client;

import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import com.ryankshah.skyrimfood.registry.RecipeRegistry;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeMap;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.event.RecipesReceivedEvent;
import net.neoforged.neoforge.event.OnDatapackSyncEvent;

import java.util.Collection;

public class RecipeSyncHandler
{
    @SubscribeEvent
    public static void onDatapackSync(OnDatapackSyncEvent event) {
        // Request that the server sends our custom recipe type to clients
        event.sendRecipes(RecipeRegistry.OVEN.get());
    }

    @SubscribeEvent
    public static void onRecipesReceived(RecipesReceivedEvent event) {
        // Cache the received recipes on the client
        for (RecipeType<?> recipeType : event.getRecipeTypes()) {
            if (recipeType == RecipeRegistry.OVEN.get()) {
                RecipeType<OvenRecipe> recipeT = (RecipeType<OvenRecipe>)recipeType;
                RecipeMap rawRecipeMap = event.getRecipeMap();
                Collection<RecipeHolder<OvenRecipe>> recipes = rawRecipeMap.byType(recipeT);
                ClientRecipeCache.cacheRecipes(recipeType, recipes);
            }
        }
    }

    @SubscribeEvent
    public static void onClientLogout(ClientPlayerNetworkEvent.LoggingOut event) {
        // Clear the client-side cache when leaving a world/server
        ClientRecipeCache.clearCache();
    }
}
