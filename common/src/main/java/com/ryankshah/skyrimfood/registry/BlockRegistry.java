package com.ryankshah.skyrimfood.registry;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.block.*;
import com.ryankshah.skyrimfood.registration.RegistrationProvider;
import com.ryankshah.skyrimfood.registration.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockRegistry
{
    public static void init() {}

    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registries.BLOCK, Constants.MOD_ID);

    public static final RegistryObject<Block, Block> OVEN = registerBlock("oven",
            () -> new OvenBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(2.0f).requiresCorrectToolForDrops().noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "oven")))));
    public static final RegistryObject<Item, BlockItem> OVEN_ITEM = ItemRegistry.ITEMS.register("oven", () -> new BlockItem(OVEN.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "oven")))));

    public static final RegistryObject<Block, BirdsNestBlock> BIRDS_NEST = registerBlock("birds_nest",
            BirdsNestBlock::new);
    public static final RegistryObject<Item, BlockItem> BIRDS_NEST_ITEM = ItemRegistry.ITEMS.register("birds_nest", () -> new BlockItem(BIRDS_NEST.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "birds_nest")))));

    public static final RegistryObject<Block, Block> RED_MOUNTAIN_FLOWER = registerBlock("red_mountain_flower",
            () -> new SkyrimFlower(
                    MobEffects.SATURATION,
                    7,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollision()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "red_mountain_flower")))
            ));
    public static final RegistryObject<Block, Block> POTTED_RED_MOUNTAIN_FLOWER = registerBlock("potted_red_mountain_flower",
            () -> new FlowerPotBlock(RED_MOUNTAIN_FLOWER.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "potted_red_mountain_flower")))
            ));
    public static final RegistryObject<Item, BlockItem> RED_MOUNTAIN_FLOWER_ITEM = ItemRegistry.ITEMS.register("red_mountain_flower", () ->
            new BlockItem(RED_MOUNTAIN_FLOWER.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "red_mountain_flower")))));
    public static final RegistryObject<Block, Block> BLUE_MOUNTAIN_FLOWER = registerBlock("blue_mountain_flower",
            () -> new SkyrimFlower(
                    MobEffects.SATURATION,
                    7,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollision()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "blue_mountain_flower")))
            ));
    public static final RegistryObject<Block, Block> POTTED_BLUE_MOUNTAIN_FLOWER = registerBlock("potted_blue_mountain_flower",
            () -> new FlowerPotBlock(BLUE_MOUNTAIN_FLOWER.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "potted_blue_mountain_flower")))));
    public static final RegistryObject<Item, BlockItem> BLUE_MOUNTAIN_FLOWER_ITEM = ItemRegistry.ITEMS.register("blue_mountain_flower", () ->
            new BlockItem(BLUE_MOUNTAIN_FLOWER.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "blue_mountain_flower")))));
    public static final RegistryObject<Block, Block> YELLOW_MOUNTAIN_FLOWER = registerBlock("yellow_mountain_flower",
            () -> new SkyrimFlower(
                    MobEffects.SATURATION,
                    7,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollision()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "yellow_mountain_flower")))
            ));
    public static final RegistryObject<Block, Block> POTTED_YELLOW_MOUNTAIN_FLOWER = registerBlock("potted_yellow_mountain_flower",
            () -> new FlowerPotBlock(YELLOW_MOUNTAIN_FLOWER.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "potted_yellow_mountain_flower")))));
    public static final RegistryObject<Item, BlockItem> YELLOW_MOUNTAIN_FLOWER_ITEM = ItemRegistry.ITEMS.register("yellow_mountain_flower", () ->
            new BlockItem(YELLOW_MOUNTAIN_FLOWER.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "yellow_mountain_flower")))));
    public static final RegistryObject<Block, Block> PURPLE_MOUNTAIN_FLOWER = registerBlock("purple_mountain_flower",
            () -> new SkyrimFlower(
                    MobEffects.SATURATION,
                    7,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollision()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "purple_mountain_flower")))
            ));
    public static final RegistryObject<Block, Block> POTTED_PURPLE_MOUNTAIN_FLOWER = registerBlock("potted_purple_mountain_flower",
            () -> new FlowerPotBlock(PURPLE_MOUNTAIN_FLOWER.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "potted_purple_mountain_flower")))));
    public static final RegistryObject<Item, BlockItem> PURPLE_MOUNTAIN_FLOWER_ITEM = ItemRegistry.ITEMS.register("purple_mountain_flower", () ->
            new BlockItem(PURPLE_MOUNTAIN_FLOWER.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "purple_mountain_flower")))));
    public static final RegistryObject<Block, Block> LAVENDER = registerBlock("lavender",
            () -> new SkyrimFlower(
                    MobEffects.SATURATION,
                    7,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollision()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "lavender")))
            ));
    public static final RegistryObject<Item, BlockItem> LAVENDER_ITEM = ItemRegistry.ITEMS.register("lavender", () ->
            new BlockItem(LAVENDER.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "lavender")))));
    public static final RegistryObject<Block, Block> POTTED_LAVENDER = registerBlock("potted_lavender",
            () -> new FlowerPotBlock(LAVENDER.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "potted_lavender")))));

    public static final RegistryObject<Block, Block> CANIS_ROOT_BLOCK = registerBlock("canis_root",
            () -> new CanisRoot(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollision()
                            .instabreak()
                            .sound(SoundType.SWEET_BERRY_BUSH)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "canis_root")))
            ));
    public static final RegistryObject<Item, BlockItem> CANIS_ROOT = ItemRegistry.ITEMS.register("canis_root",
            () -> new BlockItem(CANIS_ROOT_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "canis_root")))));

    public static final RegistryObject<Block, Block> BLOODGRASS_BLOCK = registerBlock("bloodgrass",
            () -> new Bloodgrass(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollision()
                            .instabreak()
                            .sound(SoundType.SWEET_BERRY_BUSH)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "bloodgrass")))
            ));
    public static final RegistryObject<Item, BlockItem> BLOODGRASS = ItemRegistry.ITEMS.register("bloodgrass",
            () -> new BlockItem(BLOODGRASS_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "bloodgrass")))));

    public static final RegistryObject<Block, Block> BLEEDING_CROWN_BLOCK = registerBlock("bleeding_crown",
            () -> new GenericTripleMushroom(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .instabreak()
                    .sound(SoundType.STEM)
                    .pushReaction(PushReaction.DESTROY)
                    .noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "bleeding_crown")))));
    public static final RegistryObject<Item, BlockItem> BLEEDING_CROWN = ItemRegistry.ITEMS.register("bleeding_crown",
            () -> new BlockItem(BLEEDING_CROWN_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "bleeding_crown")))));

    public static final RegistryObject<Block, Block> WHITE_CAP_BLOCK = registerBlock("white_cap",
            () -> new GenericTripleMushroom(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .instabreak()
                    .sound(SoundType.STEM)
                    .pushReaction(PushReaction.DESTROY)
                    .noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "white_cap")))));
    public static final RegistryObject<Item, BlockItem> WHITE_CAP = ItemRegistry.ITEMS.register("white_cap",
            () -> new BlockItem(WHITE_CAP_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "white_cap")))));


    public static final RegistryObject<Block, Block> BLISTERWORT_BLOCK = registerBlock("blisterwort",
            () -> new GenericTripleMushroom(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .instabreak()
                    .sound(SoundType.STEM)
                    .pushReaction(PushReaction.DESTROY)
                    .noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "blisterwort")))));
    public static final RegistryObject<Item, BlockItem> BLISTERWORT = ItemRegistry.ITEMS.register("blisterwort",
            () -> new BlockItem(BLISTERWORT_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "blisterwort")))));

    public static final RegistryObject<Block, Block> FLY_AMANITA_BLOCK = registerBlock("fly_amanita",
            () -> new GenericTripleMushroom(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .instabreak()
                    .sound(SoundType.STEM)
                    .pushReaction(PushReaction.DESTROY)
                    .noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "fly_amanita")))));
    public static final RegistryObject<Item, BlockItem> FLY_AMANITA = ItemRegistry.ITEMS.register("fly_amanita",
            () -> new BlockItem(FLY_AMANITA_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "fly_amanita")))));

    public static final RegistryObject<Block, Block> CREEP_CLUSTER_BLOCK = registerBlock("creep_cluster",
            () -> new CreepClusterBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT).instabreak().sound(SoundType.LILY_PAD).noOcclusion().pushReaction(PushReaction.DESTROY)
                            .randomTicks()
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "creep_cluster")))
            ));
    public static final RegistryObject<Item, BlockItem> CREEP_CLUSTER = ItemRegistry.ITEMS.register("creep_cluster",
            () -> new BlockItem(CREEP_CLUSTER_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "creep_cluster")))));


    public static final RegistryObject<Block, Block> PEARL_OYSTER_BLOCK = registerBlock("pearl_oyster",
            () -> new PearlOysterBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LILY_PAD).noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "pearl_oyster")))));
    public static final RegistryObject<Item, BlockItem> PEARL_OYSTER_BLOCK_ITEM = ItemRegistry.ITEMS.register("pearl_oyster",
            () -> new BlockItem(PEARL_OYSTER_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "pearl_oyster")))));

    public static final RegistryObject<Block, Block> TOMATO_CROP = registerBlock("tomatoes", () -> new TomatoCrop(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "tomatoes")))
    ));
    public static final RegistryObject<Block, Block> GARLIC_CROP = registerBlock("garlic", () -> new GarlicCrop(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "garlic")))
    ));
    public static final RegistryObject<Block, Block> CABBAGE_CROP = registerBlock("cabbage", () -> new CabbageCrop(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "cabbage")))
    ));
    public static final RegistryObject<Block, Block> ASH_YAM_CROP = registerBlock("ash_yam", () -> new AshYamCrop(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "ash_yam")))
    ));

    public static final RegistryObject<Block, Block> JAZBAY_GRAPE_BUSH = registerBlock("jazbay_grape_bush", () -> new JazbayGrapeBushBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "jazbay_grape_bush")))
    ));
    public static final RegistryObject<Block, Block> JUNIPER_BERRY_BUSH = registerBlock("juniper_berry_bush", () -> new JuniperBerryBushBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "juniper_berry_bush")))
    ));
    public static final RegistryObject<Block, Block> SNOWBERRY_BUSH = registerBlock("snowberry_bush", () -> new SnowberryBushBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "snowberry_bush")))
    ));

    private static <T extends Block> RegistryObject<Block, T> registerBlock(String id, Supplier<T> block) {
        return BLOCKS.register(id, block);
    }

//    public static <T extends Block> RegistryObject<T> registerBlockWithItem(String name, Supplier<T> block) {
//        return registerBlock(name, () -> new BlockItem(block.get(), new Item.Properties()));
//    }

    protected static <T extends Block> RegistryObject<Block, T> registerBlock(String name, Supplier<T> block, Function<RegistryObject<Block, T>, Supplier<? extends BlockItem>> item) {
        var reg = registerBlock(name, block);
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(reg.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name)))));
        return reg;
    }

    private static Function<Item.Properties, Item> createBlockItemWithCustomItemName(Block block) {
        return (p_371097_) -> {
            return new BlockItem(block, p_371097_.useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, block.getDescriptionId()))));
        };
    }

}