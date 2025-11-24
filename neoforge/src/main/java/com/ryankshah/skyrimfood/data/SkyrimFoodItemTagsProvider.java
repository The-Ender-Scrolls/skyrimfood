package com.ryankshah.skyrimfood.data;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.registry.ItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class SkyrimFoodItemTagsProvider extends ItemTagsProvider {
    
    public SkyrimFoodItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                    CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Seeds
        tag(ItemTags.VILLAGER_PLANTABLE_SEEDS)
            .add(ItemRegistry.GARLIC.get())
            .add(ItemRegistry.TOMATO_SEEDS.get())
            .add(ItemRegistry.CABBAGE_SEEDS.get())
            .add(ItemRegistry.ASH_YAM_SLIPS.get());
        
        // Chicken food (seeds)
        tag(ItemTags.CHICKEN_FOOD)
            .add(ItemRegistry.TOMATO_SEEDS.get())
            .add(ItemRegistry.CABBAGE_SEEDS.get());
        
        // Parrot food (seeds)
        tag(ItemTags.PARROT_FOOD)
            .add(ItemRegistry.TOMATO_SEEDS.get())
            .add(ItemRegistry.CABBAGE_SEEDS.get());

        // Food items
        tag(ItemTags.MEAT)
            .add(ItemRegistry.MAMMOTH_STEAK.get())
            .add(ItemRegistry.VENISON.get())
            .add(ItemRegistry.LEG_OF_GOAT.get())
            .add(ItemRegistry.HORSE_MEAT.get())
            .add(ItemRegistry.CLAM_MEAT.get());

        // Bread
        tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "bread")))
            .add(ItemRegistry.GARLIC_BREAD.get())
            .add(ItemRegistry.POTATO_BREAD.get())
            .add(ItemRegistry.BRAIDED_BREAD.get());
    }
}