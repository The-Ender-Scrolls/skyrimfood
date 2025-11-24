package com.ryankshah.skyrimfood.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CreepClusterBlock extends BushBlock
{
    private VoxelShape shape = Shapes.or(
            Block.box(0, 0, 0, 16, 1.5, 16)
    );

    public CreepClusterBlock(Properties p_58162_) {
        super(p_58162_);
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier effectApplier, boolean p_451772_) {
        super.entityInside(state, level, pos, entity, effectApplier, p_451772_);
        if (level instanceof ServerLevel && (entity instanceof Boat || entity instanceof AbstractMinecart)) {
            level.destroyBlock(new BlockPos(pos), true, entity);
        }
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        return shape;
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(BlockTags.DIRT) || pState.is(BlockTags.BASE_STONE_OVERWORLD);
    }

//    @Override
//    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
//        BlockState blockstate = pLevel.getBlockState(pPos.below());
//        if (blockstate.is(this)) {
//            return true;
//        } else if(blockstate.canSustainPlant(pLevel, pPos.below(), Direction.UP, pState).isTrue()) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    @Override
//    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
//        return PlantType.CAVE;
//    }
//
//    @Override
//    public BlockState getPlant(BlockGetter level, BlockPos pos) {
//        return defaultBlockState();
//    }
}