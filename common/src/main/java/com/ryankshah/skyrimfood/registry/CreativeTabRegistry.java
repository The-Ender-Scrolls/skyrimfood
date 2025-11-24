package com.ryankshah.skyrimfood.registry;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.registration.RegistrationProvider;
import com.ryankshah.skyrimfood.registration.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabRegistry
{
    public static void init() {}

    public static final RegistrationProvider<CreativeModeTab> CREATIVE_MODE_TABS = RegistrationProvider.get(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    // tab title
    public static String SKYRIMCRAFT_FOOD_TAB_TITLE = "creativetab.skyrimfood";

    public static final RegistryObject<CreativeModeTab, CreativeModeTab> SKYRIMCRAFT_ALL_TAB = CREATIVE_MODE_TABS.register("skyrimfood", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0);

        builder.displayItems((itemDisplayParameters, output) -> {

            // === BLOCKS ===
            // Functional Blocks
            output.accept(BlockRegistry.OVEN_ITEM.get());
            output.accept(BlockRegistry.BIRDS_NEST_ITEM.get());
            output.accept(BlockRegistry.PEARL_OYSTER_BLOCK_ITEM.get());

            // === FOOD ITEMS ===
            // Breads & Baked Goods
            output.accept(ItemRegistry.SWEET_ROLL.get());
            output.accept(ItemRegistry.GARLIC_BREAD.get());
            output.accept(ItemRegistry.POTATO_BREAD.get());
            output.accept(ItemRegistry.BRAIDED_BREAD.get());
            output.accept(ItemRegistry.APPLE_PIE.get());

            // Dumplings & Treats
            output.accept(ItemRegistry.APPLE_DUMPLING.get());
            output.accept(ItemRegistry.CHICKEN_DUMPLING.get());
            output.accept(ItemRegistry.LAVENDER_DUMPLING.get());
            output.accept(ItemRegistry.BOILED_CREME_TREAT.get());
            output.accept(ItemRegistry.HONEY_NUT_TREAT.get());

            // Fruits & Berries
            output.accept(ItemRegistry.GREEN_APPLE.get());
            output.accept(ItemRegistry.JAZBAY_GRAPES.get());
            output.accept(ItemRegistry.JUNIPER_BERRIES.get());
            output.accept(ItemRegistry.SNOWBERRIES.get());

            // Vegetables
            output.accept(ItemRegistry.TOMATO.get());
            output.accept(ItemRegistry.CABBAGE.get());
            output.accept(ItemRegistry.LEEK.get());
            output.accept(ItemRegistry.GOURD.get());
            output.accept(ItemRegistry.ASH_YAM.get());

            // Meats
            output.accept(ItemRegistry.MAMMOTH_STEAK.get());
            output.accept(ItemRegistry.VENISON.get());
            output.accept(ItemRegistry.CLAM_MEAT.get());
            output.accept(ItemRegistry.LEG_OF_GOAT.get());
            output.accept(ItemRegistry.LEG_OF_GOAT_ROAST.get());
            output.accept(ItemRegistry.HORSE_MEAT.get());
            output.accept(ItemRegistry.HORSE_HAUNCH.get());

            // Dairy
            output.accept(ItemRegistry.SLICED_GOAT_CHEESE.get());
            output.accept(ItemRegistry.SLICED_EIDAR_CHEESE.get());

            // Soups & Stews
            output.accept(ItemRegistry.TOMATO_SOUP.get());
            output.accept(ItemRegistry.APPLE_CABBAGE_STEW.get());
            output.accept(ItemRegistry.BEEF_STEW.get());
            output.accept(ItemRegistry.CABBAGE_SOUP.get());
            output.accept(ItemRegistry.CABBAGE_POTATO_SOUP.get());
            output.accept(ItemRegistry.CLAM_CHOWDER.get());
            output.accept(ItemRegistry.VEGETABLE_SOUP.get());
            output.accept(ItemRegistry.POTATO_SOUP.get());
            output.accept(ItemRegistry.MAMMOTH_CHEESE_BOWL.get());

            // Prepared Foods
            output.accept(ItemRegistry.GRILLED_LEEKS.get());
            output.accept(ItemRegistry.JAZBAY_CROSTATA.get());
            output.accept(ItemRegistry.JUNIPER_BERRY_CROSTATA.get());
            output.accept(ItemRegistry.SNOWBERRY_CROSTATA.get());

            // === ALCOHOLIC BEVERAGES ===
            output.accept(ItemRegistry.ALE.get());
            output.accept(ItemRegistry.ALTO_WINE.get());
            output.accept(ItemRegistry.ARGONIAN_ALE.get());
            output.accept(ItemRegistry.NORD_MEAD.get());
            output.accept(ItemRegistry.BLACK_BRIAR_MEAD.get());
            output.accept(ItemRegistry.BLACK_BRIAR_RESERVE.get());
            output.accept(ItemRegistry.DRAGONS_BREATH_MEAD.get());
            output.accept(ItemRegistry.FIREBRAND_WINE.get());
            output.accept(ItemRegistry.HONNINGBREW_MEAD.get());
            output.accept(ItemRegistry.MEAD_WITH_JUNIPER_BERRY.get());
            output.accept(ItemRegistry.SKOOMA.get());
            output.accept(ItemRegistry.SPICED_WINE.get());
            output.accept(ItemRegistry.WINE.get());

            // === COOKING INGREDIENTS ===
            output.accept(ItemRegistry.FLOUR.get());
            output.accept(ItemRegistry.BUTTER.get());
            output.accept(ItemRegistry.SALT_PILE.get());
            output.accept(ItemRegistry.GRASS_POD.get());
            output.accept(ItemRegistry.SALMON_ROE.get());

            // === SEEDS & PLANTABLES ===
            output.accept(ItemRegistry.GARLIC.get());
            output.accept(ItemRegistry.TOMATO_SEEDS.get());
            output.accept(ItemRegistry.CABBAGE_SEEDS.get());
            output.accept(ItemRegistry.ASH_YAM_SLIPS.get());

            // === FLOWERS & PLANTS ===
            output.accept(BlockRegistry.RED_MOUNTAIN_FLOWER_ITEM.get());
            output.accept(BlockRegistry.BLUE_MOUNTAIN_FLOWER_ITEM.get());
            output.accept(BlockRegistry.YELLOW_MOUNTAIN_FLOWER_ITEM.get());
            output.accept(BlockRegistry.PURPLE_MOUNTAIN_FLOWER_ITEM.get());
            output.accept(BlockRegistry.LAVENDER_ITEM.get());

            // Plant Materials
            output.accept(BlockRegistry.CANIS_ROOT.get());
            output.accept(BlockRegistry.BLOODGRASS.get());

            // Mushrooms
            output.accept(BlockRegistry.BLEEDING_CROWN.get());
            output.accept(BlockRegistry.WHITE_CAP.get());
            output.accept(BlockRegistry.BLISTERWORT.get());
            output.accept(BlockRegistry.FLY_AMANITA.get());
            output.accept(BlockRegistry.CREEP_CLUSTER.get());

            // === MISC ITEMS ===
            output.accept(ItemRegistry.PEARL.get());
            output.accept(ItemRegistry.BEE.get());
            output.accept(ItemRegistry.SMALL_PEARL.get());
            output.accept(ItemRegistry.PINE_THRUSH_EGG.get());
            output.accept(ItemRegistry.ROCK_WARBLER_EGG.get());
            output.accept(ItemRegistry.HAWK_EGG.get());
        });

        builder.icon(() -> new ItemStack(ItemRegistry.SWEET_ROLL.get()));
        builder.title(Component.translatable(SKYRIMCRAFT_FOOD_TAB_TITLE));

        return builder.build();
    });
}