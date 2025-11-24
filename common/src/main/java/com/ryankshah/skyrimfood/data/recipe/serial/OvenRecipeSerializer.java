package com.ryankshah.skyrimfood.data.recipe.serial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class OvenRecipeSerializer implements RecipeSerializer<OvenRecipe>
{
    public static final MapCodec<OvenRecipe> CODEC = RecordCodecBuilder.mapCodec(
            p_311738_ -> p_311738_.group(
                            Codec.STRING.fieldOf("category").forGetter(OvenRecipe::getCategory),
                            ItemStack.CODEC.fieldOf("result").forGetter(OvenRecipe::getResult),
                            Codec.INT.fieldOf("level").forGetter(OvenRecipe::getRequiredLevel),
                            Codec.INT.fieldOf("xp").forGetter(OvenRecipe::getXpGained),
                            Ingredient.CODEC
                                    .listOf()
                                    .fieldOf("ingredients")
                                    .flatXmap(
                                            p_301021_ -> {
                                                if(p_301021_.isEmpty()) {
                                                    return DataResult.error(() -> "No ingredients for Oven Recipe");
                                                } else {
                                                    // Create NonNullList and add all ingredients directly
                                                    NonNullList<Ingredient> ingredients = NonNullList.create();
                                                    ingredients.addAll(p_301021_);
                                                    return DataResult.success(ingredients);
                                                }
                                            },
                                            DataResult::success
                                    )
                                    .forGetter(OvenRecipe::getIngredients)
                    )
                    .apply(p_311738_, OvenRecipe::new)
    );
    private static final StreamCodec<RegistryFriendlyByteBuf, OvenRecipe> STREAM_CODEC = ByteBufCodecs.fromCodecWithRegistries(CODEC.codec());


    public OvenRecipeSerializer() {
    }

    @Override
    public MapCodec<OvenRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, OvenRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}