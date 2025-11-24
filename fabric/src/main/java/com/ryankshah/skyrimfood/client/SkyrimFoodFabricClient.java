package com.ryankshah.skyrimfood.client;

import com.ryankshah.skyrimfood.registry.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class SkyrimFoodFabricClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient() {
        FabricRecipeSyncHandler.init();
        addBlockRenders();
    }

    public void addBlockRenders() {
        BlockRenderLayerMap.putBlock(BlockRegistry.RED_MOUNTAIN_FLOWER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.YELLOW_MOUNTAIN_FLOWER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.BLUE_MOUNTAIN_FLOWER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.PURPLE_MOUNTAIN_FLOWER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.LAVENDER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.CABBAGE_CROP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.TOMATO_CROP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.GARLIC_CROP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.OVEN.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.PEARL_OYSTER_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.ASH_YAM_CROP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.CANIS_ROOT_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.BLOODGRASS_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.BLISTERWORT_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.BLEEDING_CROWN_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.CREEP_CLUSTER_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.FLY_AMANITA_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.WHITE_CAP_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.JAZBAY_GRAPE_BUSH.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.JUNIPER_BERRY_BUSH.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockRegistry.SNOWBERRY_BUSH.get(), ChunkSectionLayer.CUTOUT);
    }
}
