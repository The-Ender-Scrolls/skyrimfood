package com.ryankshah.skyrimfood.data;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.block.OvenBlock;
import com.ryankshah.skyrimfood.block.PearlOysterBlock;
import com.ryankshah.skyrimfood.registry.BlockRegistry;
import com.ryankshah.skyrimfood.registry.ItemRegistry;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.Optional;
import java.util.stream.Stream;

public class SkyrimFoodModelProvider extends ModelProvider {

    public SkyrimFoodModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Food Items - Flat Items
        itemModels.generateFlatItem(ItemRegistry.SWEET_ROLL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.GARLIC_BREAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.POTATO_BREAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.TOMATO.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.APPLE_PIE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.MAMMOTH_STEAK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.VENISON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.CABBAGE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.TOMATO_SOUP.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.APPLE_CABBAGE_STEW.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.APPLE_DUMPLING.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.BEEF_STEW.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.CABBAGE_SOUP.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.CABBAGE_POTATO_SOUP.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.CHICKEN_DUMPLING.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.CLAM_MEAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SLICED_GOAT_CHEESE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SLICED_EIDAR_CHEESE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.GOURD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.LEEK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.LEG_OF_GOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.LEG_OF_GOAT_ROAST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.HORSE_MEAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.HORSE_HAUNCH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.VEGETABLE_SOUP.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.ASH_YAM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.BOILED_CREME_TREAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.BRAIDED_BREAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.CLAM_CHOWDER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.GREEN_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.GRILLED_LEEKS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.HONEY_NUT_TREAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.JAZBAY_GRAPES.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.JAZBAY_CROSTATA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.JUNIPER_BERRIES.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.JUNIPER_BERRY_CROSTATA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.LAVENDER_DUMPLING.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.MAMMOTH_CHEESE_BOWL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.POTATO_SOUP.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SNOWBERRIES.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SNOWBERRY_CROSTATA.get(), ModelTemplates.FLAT_ITEM);

        // Alcoholic Beverages
        itemModels.generateFlatItem(ItemRegistry.ALE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.ALTO_WINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.ARGONIAN_ALE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.NORD_MEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.BLACK_BRIAR_MEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.BLACK_BRIAR_RESERVE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.DRAGONS_BREATH_MEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.FIREBRAND_WINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.HONNINGBREW_MEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.MEAD_WITH_JUNIPER_BERRY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SKOOMA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SPICED_WINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.WINE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ItemRegistry.PEARL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.BEE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SMALL_PEARL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.HAWK_EGG.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.PINE_THRUSH_EGG.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.ROCK_WARBLER_EGG.get(), ModelTemplates.FLAT_ITEM);

        // Ingredients
        itemModels.generateFlatItem(ItemRegistry.SALMON_ROE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.GRASS_POD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.FLOUR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.BUTTER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.SALT_PILE.get(), ModelTemplates.FLAT_ITEM);

        // Seeds and Plantables
        itemModels.generateFlatItem(ItemRegistry.GARLIC.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.TOMATO_SEEDS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ItemRegistry.CABBAGE_SEEDS.get(), ModelTemplates.FLAT_ITEM);
//        itemModels.generateFlatItem(ItemRegistry.ASH_YAM_SLIPS.get(), ModelTemplates.FLAT_ITEM);

        // Block Models
//        blockModels.createTrivialCube(BlockRegistry.OVEN.get());

        createPlantWithDefaultItem(blockModels, BlockRegistry.RED_MOUNTAIN_FLOWER.get(), BlockRegistry.POTTED_RED_MOUNTAIN_FLOWER.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        createPlantWithDefaultItem(blockModels, BlockRegistry.BLUE_MOUNTAIN_FLOWER.get(), BlockRegistry.POTTED_BLUE_MOUNTAIN_FLOWER.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        createPlantWithDefaultItem(blockModels, BlockRegistry.YELLOW_MOUNTAIN_FLOWER.get(), BlockRegistry.POTTED_YELLOW_MOUNTAIN_FLOWER.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        createPlantWithDefaultItem(blockModels, BlockRegistry.PURPLE_MOUNTAIN_FLOWER.get(), BlockRegistry.POTTED_PURPLE_MOUNTAIN_FLOWER.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        createPlantWithDefaultItem(blockModels, BlockRegistry.LAVENDER.get(), BlockRegistry.POTTED_LAVENDER.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        createCrossBlock(blockModels, BlockRegistry.CANIS_ROOT_BLOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        createCrossBlock(blockModels, BlockRegistry.BLOODGRASS_BLOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        createGenericTripleMushroom(blockModels, BlockRegistry.BLEEDING_CROWN_BLOCK.get());
        createGenericTripleMushroom(blockModels, BlockRegistry.WHITE_CAP_BLOCK.get());
        createGenericTripleMushroom(blockModels, BlockRegistry.BLISTERWORT_BLOCK.get());
        createGenericTripleMushroom(blockModels, BlockRegistry.FLY_AMANITA_BLOCK.get());
        createPearlOysterBlock(blockModels, BlockRegistry.PEARL_OYSTER_BLOCK.get());
        createCreepCluster(blockModels);
        createBirdsNest(blockModels);
        createBush(blockModels, BlockRegistry.JAZBAY_GRAPE_BUSH.get());
        createBush(blockModels, BlockRegistry.JUNIPER_BERRY_BUSH.get());
        createBush(blockModels, BlockRegistry.SNOWBERRY_BUSH.get());

        createCropBlock(blockModels, BlockRegistry.ASH_YAM_CROP.get(),
                BlockStateProperties.AGE_7, 0, 0, 1, 1, 2, 2, 3, 3);
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return super.getKnownBlocks().filter(blockHolder -> !(
                blockHolder.value() instanceof CropBlock ||
                        blockHolder.value() instanceof OvenBlock
        ));
    }

    public void createCropBlock(BlockModelGenerators generators, Block cropBlock, Property<Integer> ageProperty, int... ageToVisualStageMapping) {
        generators.registerSimpleFlatItemModel(cropBlock.asItem());
        if (ageProperty.getPossibleValues().size() != ageToVisualStageMapping.length) {
            throw new IllegalArgumentException();
        } else {
            Int2ObjectMap<ResourceLocation> int2objectmap = new Int2ObjectOpenHashMap();
            generators.blockStateOutput.accept(MultiVariantGenerator.dispatch(cropBlock).with(PropertyDispatch.initial(ageProperty).generate((p_408977_) -> {
                int i = ageToVisualStageMapping[p_408977_];
                return BlockModelGenerators.plainVariant((ResourceLocation)int2objectmap.computeIfAbsent(i, (p_387308_) -> {
                    return generators.createSuffixedVariant(cropBlock, "_stage" + p_387308_, ModelTemplates.CROP.extend().renderType("cutout").build(), TextureMapping::crop);
                }));
            })));
        }
    }

//    public static void createCreepCluster(BlockModelGenerators generators) {
//        ResourceLocation resourcelocation = ModelTemplates.FLAT_ITEM.create(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/creep_cluster"), TextureMapping.layer0(BlockRegistry.CREEP_CLUSTER.get()), generators.modelOutput); //generators.createFlatItemModelWithBlockTexture(BlockRegistry.CREEP_CLUSTER.get(), BlockRegistry.CREEP_CLUSTER_BLOCK.get());
//        generators.registerSimpleItemModel(BlockRegistry.CREEP_CLUSTER_BLOCK.get(), resourcelocation);
//        Variant variant = BlockModelGenerators.plainModel(ModelLocationUtils.getModelLocation(BlockRegistry.CREEP_CLUSTER_BLOCK.get()));
//        generators.blockStateOutput.accept(MultiVariantGenerator.dispatch(BlockRegistry.CREEP_CLUSTER_BLOCK.get(), BlockModelGenerators.createRotatedVariants(variant)));
//    }
public static void createCreepCluster(BlockModelGenerators provider) {
    ModelTemplate creepCluster = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/lily_pad")), Optional.empty(),
            TextureSlot.TEXTURE,
            TextureSlot.PARTICLE
    ).extend().renderType("cutout").build();

    TextureMapping textureMapping = new TextureMapping()
            .put(TextureSlot.TEXTURE, TextureMapping.getBlockTexture(BlockRegistry.CREEP_CLUSTER_BLOCK.get()))
            .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(BlockRegistry.CREEP_CLUSTER_BLOCK.get()));

    MultiVariant multiVariant = BlockModelGenerators.plainVariant(
            creepCluster.create(BlockRegistry.CREEP_CLUSTER_BLOCK.get(), textureMapping, provider.modelOutput)
    );

    provider.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(BlockRegistry.CREEP_CLUSTER_BLOCK.get(), multiVariant));
    provider.registerSimpleFlatItemModel(BlockRegistry.CREEP_CLUSTER_BLOCK.get());
}

    public static void createPearlOysterBlock(BlockModelGenerators provider, Block block) {
        // Since we're using existing models, we can reference them directly
        MultiVariant closed = BlockModelGenerators.plainVariant(
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/pearl_oyster")
        );
        MultiVariant open = BlockModelGenerators.plainVariant(
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/pearl_oyster_open")
        );
        MultiVariant empty = BlockModelGenerators.plainVariant(
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/pearl_oyster_empty")
        );

        provider.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(block)
                        .with(PropertyDispatch.initial(PearlOysterBlock.IS_OPEN, PearlOysterBlock.IS_EMPTY)
                                .select(false, false, closed)
                                .select(true, false, open)
                                .select(false, true, empty)
                                .select(true, true, empty))
                        .with(PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING)
                                .select(Direction.NORTH, BlockModelGenerators.NOP)
                                .select(Direction.EAST, BlockModelGenerators.Y_ROT_90)
                                .select(Direction.SOUTH, BlockModelGenerators.Y_ROT_180)
                                .select(Direction.WEST, BlockModelGenerators.Y_ROT_270))
        );

        provider.registerSimpleItemModel(block.asItem(),
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/pearl_oyster"));
    }

    public static void createGenericTripleMushroom(BlockModelGenerators provider, Block block) {
        ModelTemplate tripleMushroom = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/triple_mushroom_generic")), Optional.empty(),
                TextureSlot.ALL,
                TextureSlot.PARTICLE
        ).extend().renderType("cutout").build();

        TextureMapping textureMapping = new TextureMapping()
                .put(TextureSlot.ALL, TextureMapping.getBlockTexture(block))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(block));

        MultiVariant multiVariant = BlockModelGenerators.plainVariant(
                tripleMushroom.create(block, textureMapping, provider.modelOutput)
        );

        provider.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, multiVariant));
        provider.registerSimpleFlatItemModel(block.asItem());
    }

    public static void createBirdsNest(BlockModelGenerators provider) {
        ModelTemplate birdsNest = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/birds_nest_base")), Optional.empty(),
                TextureSlot.ALL,
                TextureSlot.PARTICLE
        ).extend().renderType("cutout").build();

        TextureMapping textureMapping = new TextureMapping()
                .put(TextureSlot.ALL, TextureMapping.getBlockTexture(BlockRegistry.BIRDS_NEST.get()))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(BlockRegistry.BIRDS_NEST.get()));

        MultiVariant multiVariant = BlockModelGenerators.plainVariant(
                birdsNest.create(BlockRegistry.BIRDS_NEST.get(), textureMapping, provider.modelOutput)
        );

        provider.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(BlockRegistry.BIRDS_NEST.get(), multiVariant));
        provider.registerSimpleFlatItemModel(BlockRegistry.BIRDS_NEST.get().asItem());
    }

    public void createBush(BlockModelGenerators blockModels, Block block) {
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.AGE_3).generate((p_408965_) -> {
            return BlockModelGenerators.plainVariant(blockModels.createSuffixedVariant(block, "_stage" + p_408965_, ModelTemplates.CROSS.extend().renderType("cutout").build(), TextureMapping::cross));
        })));
    }

    public void createPlantWithDefaultItem(BlockModelGenerators generators, Block block, Block pottedBlock, BlockModelGenerators.PlantType plantType) {
        generators.registerSimpleItemModel(block.asItem(), plantType.createItemModel(generators, block));
        createPlant(generators, block, pottedBlock, plantType);
    }

    public void createPlant(BlockModelGenerators generators, Block block, Block pottedBlock, BlockModelGenerators.PlantType plantType) {
        createCrossBlock(generators, block, plantType);
        TextureMapping texturemapping = plantType.getPlantTextureMapping(block);
        MultiVariant multivariant = BlockModelGenerators.plainVariant(plantType.getCrossPot().extend().renderType("cutout").build().create(pottedBlock, texturemapping, generators.modelOutput));
        generators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(pottedBlock, multivariant));
    }

    public void createCrossBlock(BlockModelGenerators generators, Block block, BlockModelGenerators.PlantType plantType) {
        TextureMapping texturemapping = plantType.getTextureMapping(block);
        createCrossBlock(generators, block, plantType, texturemapping);
    }

    public void createCrossBlock(BlockModelGenerators generators, Block block, BlockModelGenerators.PlantType plantType, TextureMapping textureMapping) {
        MultiVariant multivariant = BlockModelGenerators.plainVariant(plantType.getCross().extend().renderType("cutout").build().create(block, textureMapping, generators.modelOutput));
        generators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, multivariant));
    }

    public void createCrossBlock(BlockModelGenerators generators, Block block, BlockModelGenerators.PlantType plantType, Property<Integer> ageProperty, int... possibleValues) {
        if (ageProperty.getPossibleValues().size() != possibleValues.length) {
            throw new IllegalArgumentException("missing values for property: " + String.valueOf(ageProperty));
        } else {
            generators.registerSimpleFlatItemModel(block.asItem());
            generators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(ageProperty).generate((p_408973_) -> {
                int var10000 = possibleValues[p_408973_];
                String s = "_stage" + var10000;
                TextureMapping texturemapping = TextureMapping.cross(TextureMapping.getBlockTexture(block, s));
                return BlockModelGenerators.plainVariant(plantType.getCross().extend().renderType("cutout").build().createWithSuffix(block, s, texturemapping, generators.modelOutput));
            })));
        }
    }
}