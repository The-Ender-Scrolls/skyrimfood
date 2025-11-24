package com.ryankshah.skyrimfood.block;

import com.ryankshah.skyrimfood.registry.ItemRegistry;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class AshYamCrop extends CropBlock
{
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public AshYamCrop(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ItemRegistry.ASH_YAM_SLIPS.get();
    }
}