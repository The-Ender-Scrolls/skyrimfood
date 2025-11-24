package com.ryankshah.skyrimfood.data;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.registry.BlockRegistry;
import com.ryankshah.skyrimfood.registry.ItemRegistry;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;
import java.util.stream.Collectors;

public class SkyrimFoodBlockLootTables extends BlockLootSubProvider {
    
    public SkyrimFoodBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        // Simple block drops (drop themselves)
        dropSelf(BlockRegistry.OVEN.get());
        dropSelf(BlockRegistry.RED_MOUNTAIN_FLOWER.get());
        dropSelf(BlockRegistry.BLUE_MOUNTAIN_FLOWER.get());
        dropSelf(BlockRegistry.YELLOW_MOUNTAIN_FLOWER.get());
        dropSelf(BlockRegistry.PURPLE_MOUNTAIN_FLOWER.get());
        dropSelf(BlockRegistry.LAVENDER.get());
        dropSelf(BlockRegistry.CANIS_ROOT_BLOCK.get());
        dropSelf(BlockRegistry.BLOODGRASS_BLOCK.get());
        dropSelf(BlockRegistry.BLEEDING_CROWN_BLOCK.get());
        dropSelf(BlockRegistry.WHITE_CAP_BLOCK.get());
        dropSelf(BlockRegistry.BLISTERWORT_BLOCK.get());
        dropSelf(BlockRegistry.FLY_AMANITA_BLOCK.get());
        dropSelf(BlockRegistry.CREEP_CLUSTER_BLOCK.get());
        dropSelf(BlockRegistry.PEARL_OYSTER_BLOCK.get());
        dropPottedContents(BlockRegistry.POTTED_RED_MOUNTAIN_FLOWER.get());
        dropPottedContents(BlockRegistry.POTTED_BLUE_MOUNTAIN_FLOWER.get());
        dropPottedContents(BlockRegistry.POTTED_YELLOW_MOUNTAIN_FLOWER.get());
        dropPottedContents(BlockRegistry.POTTED_PURPLE_MOUNTAIN_FLOWER.get());
        dropPottedContents(BlockRegistry.POTTED_LAVENDER.get());

        LootTable.Builder birdsNestDrops = LootTable.lootTable().withPool(LootPool.lootPool()
                .name("birdsNestPool")
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(ItemRegistry.HAWK_EGG.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.25F, 1.0F)))
                )
                .add(LootItem.lootTableItem(ItemRegistry.PINE_THRUSH_EGG.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.25F, 1.0F)))
                )
                .add(LootItem.lootTableItem(ItemRegistry.ROCK_WARBLER_EGG.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.25F, 1.0F)))
                )
                .add(LootItem.lootTableItem(Items.EGG))
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.25F, 1.0F)))
        );
        add(BlockRegistry.BIRDS_NEST.get(), birdsNestDrops);

        // Garlic crop - custom drop behavior
        LootItemCondition.Builder garlicMatureCondition = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(BlockRegistry.GARLIC_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7)); // Max age for crop

        this.add(BlockRegistry.GARLIC_CROP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.GARLIC.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(garlicMatureCondition))
                        .add(LootItem.lootTableItem(ItemRegistry.GARLIC.get())
                                .when(garlicMatureCondition.invert())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.GARLIC.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(garlicMatureCondition))));

        // Tomato crop
        LootItemCondition.Builder tomatoMatureCondition = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(BlockRegistry.TOMATO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));

        this.add(BlockRegistry.TOMATO_CROP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.TOMATO.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(tomatoMatureCondition))
                        .add(LootItem.lootTableItem(ItemRegistry.TOMATO_SEEDS.get())
                                .when(tomatoMatureCondition.invert())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.TOMATO_SEEDS.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(tomatoMatureCondition))));

        // Cabbage crop
        LootItemCondition.Builder cabbageMatureCondition = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(BlockRegistry.CABBAGE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));

        this.add(BlockRegistry.CABBAGE_CROP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.CABBAGE.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(cabbageMatureCondition))
                        .add(LootItem.lootTableItem(ItemRegistry.CABBAGE_SEEDS.get())
                                .when(cabbageMatureCondition.invert())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.CABBAGE_SEEDS.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(cabbageMatureCondition))));

        // Ash Yam crop
        LootItemCondition.Builder ashYamMatureCondition = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(BlockRegistry.ASH_YAM_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));

        this.add(BlockRegistry.ASH_YAM_CROP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.ASH_YAM.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(ashYamMatureCondition))
                        .add(LootItem.lootTableItem(ItemRegistry.ASH_YAM_SLIPS.get())
                                .when(ashYamMatureCondition.invert())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.ASH_YAM_SLIPS.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                                .when(ashYamMatureCondition))));

        // Berry bushes - drop berries when mature
        this.add(BlockRegistry.JAZBAY_GRAPE_BUSH.get(), createBerryBushTable(ItemRegistry.JAZBAY_GRAPES.get()));
        this.add(BlockRegistry.JUNIPER_BERRY_BUSH.get(), createBerryBushTable(ItemRegistry.JUNIPER_BERRIES.get()));
        this.add(BlockRegistry.SNOWBERRY_BUSH.get(), createBerryBushTable(ItemRegistry.SNOWBERRIES.get()));
    }

    private LootTable.Builder createBerryBushTable(net.minecraft.world.item.Item berry) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(berry)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
            .filter(block -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(Constants.MOD_ID))
            .collect(Collectors.toSet());
    }
}
