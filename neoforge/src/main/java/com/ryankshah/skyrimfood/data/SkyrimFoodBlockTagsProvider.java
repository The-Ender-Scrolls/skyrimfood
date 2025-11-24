package com.ryankshah.skyrimfood.data;

import com.ryankshah.skyrimfood.registry.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class SkyrimFoodBlockTagsProvider extends BlockTagsProvider {
    
    public SkyrimFoodBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, 
                                     String modId) {
        super(output, lookupProvider, modId);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Blocks that need pickaxe
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(BlockRegistry.OVEN.get())
            .add(BlockRegistry.PEARL_OYSTER_BLOCK.get());
        
        // Blocks that need iron tool
        tag(BlockTags.NEEDS_IRON_TOOL)
            .add(BlockRegistry.OVEN.get());
        
        // Crops
        tag(BlockTags.CROPS)
            .add(BlockRegistry.GARLIC_CROP.get())
            .add(BlockRegistry.TOMATO_CROP.get())
            .add(BlockRegistry.CABBAGE_CROP.get())
            .add(BlockRegistry.ASH_YAM_CROP.get());
        
        // Plant-like blocks
        tag(BlockTags.REPLACEABLE_BY_TREES)
            .add(BlockRegistry.GARLIC_CROP.get())
            .add(BlockRegistry.TOMATO_CROP.get())
            .add(BlockRegistry.CABBAGE_CROP.get())
            .add(BlockRegistry.ASH_YAM_CROP.get())
            .add(BlockRegistry.RED_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.BLUE_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.YELLOW_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.PURPLE_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.LAVENDER.get());
        
        // Small flowers
        tag(BlockTags.SMALL_FLOWERS)
            .add(BlockRegistry.RED_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.BLUE_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.YELLOW_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.PURPLE_MOUNTAIN_FLOWER.get())
            .add(BlockRegistry.LAVENDER.get());
        
        // Bee pollination targets
        tag(BlockTags.BEE_GROWABLES)
            .add(BlockRegistry.GARLIC_CROP.get())
            .add(BlockRegistry.TOMATO_CROP.get())
            .add(BlockRegistry.CABBAGE_CROP.get())
            .add(BlockRegistry.ASH_YAM_CROP.get());

        // Mushrooms
        tag(BlockTags.MUSHROOM_GROW_BLOCK)
            .add(BlockRegistry.BLEEDING_CROWN_BLOCK.get())
            .add(BlockRegistry.WHITE_CAP_BLOCK.get())
            .add(BlockRegistry.BLISTERWORT_BLOCK.get())
            .add(BlockRegistry.FLY_AMANITA_BLOCK.get());
    }
}