package com.ryankshah.skyrimfood.loot;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.registry.ItemRegistry;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class SkyrimFoodLootTables
{
    protected static LootPool.Builder villageTable = LootPool.lootPool()
            .setRolls(UniformGenerator.between(1.0F, 5.0F))
            .add(LootItem.lootTableItem(ItemRegistry.GRASS_POD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 2.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.SWEET_ROLL.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 2.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.GARLIC_BREAD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.POTATO_BREAD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 2.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.CABBAGE_SOUP.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.CABBAGE_POTATO_SOUP.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.BEEF_STEW.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.ALE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.ALTO_WINE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.ARGONIAN_ALE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.SKOOMA.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.WINE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.FIREBRAND_WINE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.SPICED_WINE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.FLOUR.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.BUTTER.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.MEAD_WITH_JUNIPER_BERRY.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.BLACK_BRIAR_MEAD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.DRAGONS_BREATH_MEAD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.HONNINGBREW_MEAD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.NORD_MEAD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.HORSE_HAUNCH.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.HORSE_MEAT.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.VEGETABLE_SOUP.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.LEG_OF_GOAT_ROAST.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.LEG_OF_GOAT.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.GOURD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.SLICED_EIDAR_CHEESE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.SLICED_GOAT_CHEESE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.CHICKEN_DUMPLING.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.APPLE_DUMPLING.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.SALT_PILE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 3.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.TOMATO_SEEDS.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.GARLIC.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.CABBAGE_SEEDS.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            )
            .add(LootItem.lootTableItem(ItemRegistry.ASH_YAM_SLIPS.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
            );

    public static void addLootTables() {
        LootTableEvents.MODIFY.register((lootTableResourceKey, lootTableBuilder, lootTableSource) -> {
            if (lootTableSource.isBuiltin() && lootTableResourceKey.equals(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "grasspod"))) {
                    lootTableBuilder.withPool(new LootPool.Builder().setRolls(ConstantValue.exactly(1))
                            .add(LootItem.lootTableItem(ItemRegistry.GRASS_POD.get())
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.875F, 1.0F)))
                            ));
            }
        });
        LootTableEvents.MODIFY.register((lootTableResourceKey, lootTableBuilder, lootTableSource) -> {
            if (lootTableSource.isBuiltin() && lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "salmon")))) {
                    lootTableBuilder.withPool(LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1))
                            .add(LootItem.lootTableItem(ItemRegistry.SALMON_ROE.get())
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.45f, 1.0F)))
                            )
                    );
            }
        });
        LootTableEvents.MODIFY.register((lootTableResourceKey, lootTableBuilder, lootTableSource) -> {
            if (lootTableSource.isBuiltin() && lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "bee")))) {
                    lootTableBuilder.withPool(LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1))
                            .add(LootItem.lootTableItem(ItemRegistry.BEE.get())
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.875F, 1.0F)))
                            )
                    );
            }
        });
        LootTableEvents.MODIFY.register((lootTableResourceKey, lootTableBuilder, lootTableSource) -> {
            if (lootTableSource.isBuiltin() && lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "goat")))) {
                    lootTableBuilder.withPool(LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1))
                            .add(LootItem.lootTableItem(ItemRegistry.LEG_OF_GOAT.get())
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.875F, 1.0F)))
                            )
                    );
            }
        });
        LootTableEvents.MODIFY.register((lootTableResourceKey, lootTableBuilder, lootTableSource) -> {
            if (lootTableSource.isBuiltin() && lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "horse")))) {
                    lootTableBuilder.withPool(LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1))
                            .add(LootItem.lootTableItem(ItemRegistry.HORSE_MEAT.get())
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.875F, 1.0F)))
                            ));
            }
        });
        LootTableEvents.MODIFY.register((lootTableResourceKey, lootTableBuilder, lootTableSource) -> {
            if (lootTableSource.isBuiltin() && (
                    lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chests/simple_dungeon"))) ||
                            lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chests/abandoned_mineshaft"))) ||
                            lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chests/buried_treasure"))) ||
                            lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chests/desert_pyramid"))) ||
                            lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chests/shipwreck_supply"))) ||
                            lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chests/stronghold_corridor"))) ||
                            lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "gameplay/piglin_bartering")))
                                    )) {
                    lootTableBuilder.withPool(villageTable);
            }
        });
        LootTableEvents.MODIFY.register((lootTableResourceKey, lootTableBuilder, lootTableSource) -> {
            if (lootTableSource.isBuiltin() && lootTableResourceKey.equals(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "gameplay/sniffer_digging")))) {
                lootTableBuilder.withPool(LootPool.lootPool()
                        .setRolls(UniformGenerator.between(1.0F, 3.0F))
                        .add(LootItem.lootTableItem(ItemRegistry.SALT_PILE.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.5F, 1.0F)))
                        ));
            }
        });
    }
}