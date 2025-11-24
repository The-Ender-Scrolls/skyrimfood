package com.ryankshah.skyrimfood.registry;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.data.recipe.OvenRecipe;
import com.ryankshah.skyrimfood.data.recipe.serial.OvenRecipeSerializer;
import com.ryankshah.skyrimfood.registration.RegistrationProvider;
import com.ryankshah.skyrimfood.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public class RecipeRegistry
{
    public static void init() {}

    public static final RegistrationProvider<RecipeType<?>> RECIPE_TYPES = RegistrationProvider.get(BuiltInRegistries.RECIPE_TYPE, Constants.MOD_ID);

    public static final RegistryObject<RecipeType<?>, ? extends RecipeType<OvenRecipe>> OVEN = RECIPE_TYPES.register("oven", OvenRecipeType::new);

    static class OvenRecipeType implements RecipeType<OvenRecipe> {
        @Override
        public String toString() { return Constants.MOD_ID + ":oven"; }
    }

    public static final RegistrationProvider<RecipeSerializer<?>> SERIALIZERS = RegistrationProvider.get(Registries.RECIPE_SERIALIZER, Constants.MOD_ID);

    public static final RegistryObject<RecipeSerializer<?>, RecipeSerializer<OvenRecipe>> OVEN_RECIPE_SERIALIZER = SERIALIZERS.register("oven", OvenRecipeSerializer::new);

}