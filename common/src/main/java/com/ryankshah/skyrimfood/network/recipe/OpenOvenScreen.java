package com.ryankshah.skyrimfood.network.recipe;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.client.ClientRecipeCache;
import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import com.ryankshah.skyrimfood.registry.RecipeRegistry;
import com.ryankshah.skyrimfood.screen.OvenScreen;
import commonnetwork.networking.data.PacketContext;
import commonnetwork.networking.data.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public record OpenOvenScreen() {
    public static final ResourceLocation TYPE = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "openovenscreen");

    public OpenOvenScreen(final FriendlyByteBuf buffer) {
        this();
    }

    public static final StreamCodec<RegistryFriendlyByteBuf, OpenOvenScreen> CODEC = StreamCodec.unit(new OpenOvenScreen());

    public static OpenOvenScreen decode(FriendlyByteBuf buf) {
        return new OpenOvenScreen();
    }

    public void encode(FriendlyByteBuf buf) {
    }

    public static void handle(PacketContext<OpenOvenScreen> context) {
        if(context.side().equals(Side.CLIENT))
            handleClient(context);
        else
            handleServer(context);
    }

    public static void handleServer(PacketContext<OpenOvenScreen> context) {
    }

    public static void handleClient(PacketContext<OpenOvenScreen> context) {
        Minecraft minecraft = Minecraft.getInstance();
        minecraft.execute(() -> {
            if(Minecraft.getInstance().player != null) {
                // Use the cached recipes instead of trying to get them from level
                List<OvenRecipe> recipes = ClientRecipeCache.getOvenRecipes(RecipeRegistry.OVEN.get());
                Minecraft.getInstance().setScreen(new OvenScreen(recipes));
            }
        });
    }

    public static CustomPacketPayload.Type<CustomPacketPayload> type() {
        return new CustomPacketPayload.Type<>(TYPE);
    }
}