// SyncOvenRecipesPacket.java
package com.ryankshah.skyrimfood.network.recipe;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.client.ClientRecipeCache;
import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import com.ryankshah.skyrimfood.registry.RecipeRegistry;
import commonnetwork.networking.data.PacketContext;
import commonnetwork.networking.data.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;

import java.util.ArrayList;
import java.util.List;

public record SyncOvenRecipesPacket(List<RecipeHolder<OvenRecipe>> recipes) {
    public static final ResourceLocation TYPE = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "sync_oven_recipes");

    public SyncOvenRecipesPacket(final RegistryFriendlyByteBuf buffer) {
        this(readRecipes(buffer));
    }

    private static List<RecipeHolder<OvenRecipe>> readRecipes(RegistryFriendlyByteBuf buffer) {
        int count = buffer.readVarInt();
        List<RecipeHolder<OvenRecipe>> recipes = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            ResourceLocation recipeId = buffer.readResourceLocation();
            OvenRecipe recipe = (OvenRecipe) OvenRecipe.STREAM_CODEC.decode(buffer);
            recipes.add(new RecipeHolder<>(ResourceKey.create(Registries.RECIPE, recipeId), recipe));
        }

        return recipes;
    }

    public static final StreamCodec<RegistryFriendlyByteBuf, SyncOvenRecipesPacket> CODEC = StreamCodec.of(
        SyncOvenRecipesPacket::encode,
        SyncOvenRecipesPacket::decode
    );

    public static SyncOvenRecipesPacket decode(RegistryFriendlyByteBuf buf) {
        return new SyncOvenRecipesPacket(buf);
    }

    public static void encode(RegistryFriendlyByteBuf buf, SyncOvenRecipesPacket packet) {
        buf.writeVarInt(packet.recipes.size());

        for (RecipeHolder<OvenRecipe> holder : packet.recipes) {
            buf.writeResourceLocation(holder.id().location());
            OvenRecipe.STREAM_CODEC.encode(buf, holder.value());
        }
    }

    public static void handle(PacketContext<SyncOvenRecipesPacket> context) {
        if (context.side().equals(Side.CLIENT)) {
            handleClient(context);
        }
        // No server handling needed for this packet
    }

    public static void handleClient(PacketContext<SyncOvenRecipesPacket> context) {
        Minecraft minecraft = Minecraft.getInstance();
        minecraft.execute(() -> {
            if (Minecraft.getInstance().player != null) {
                ClientRecipeCache.cacheRecipes(RecipeRegistry.OVEN.get(), context.message().recipes);
            }
        });
    }

    public static CustomPacketPayload.Type<CustomPacketPayload> type() {
        return new CustomPacketPayload.Type<>(TYPE);
    }
}