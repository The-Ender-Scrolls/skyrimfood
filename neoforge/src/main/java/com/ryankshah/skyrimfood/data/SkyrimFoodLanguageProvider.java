package com.ryankshah.skyrimfood.data;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.registry.BlockRegistry;
import com.ryankshah.skyrimfood.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class SkyrimFoodLanguageProvider extends LanguageProvider {

    public SkyrimFoodLanguageProvider(PackOutput output, String locale) {
        super(output, Constants.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        // Food Items
        addItem(ItemRegistry.SWEET_ROLL, "Sweet Roll");
        addItem(ItemRegistry.GARLIC_BREAD, "Garlic Bread");
        addItem(ItemRegistry.POTATO_BREAD, "Potato Bread");
        addItem(ItemRegistry.TOMATO, "Tomato");
        addItem(ItemRegistry.APPLE_PIE, "Apple Pie");
        addItem(ItemRegistry.MAMMOTH_STEAK, "Mammoth Steak");
        addItem(ItemRegistry.VENISON, "Venison");
        addItem(ItemRegistry.CABBAGE, "Cabbage");
        addItem(ItemRegistry.TOMATO_SOUP, "Tomato Soup");
        addItem(ItemRegistry.APPLE_CABBAGE_STEW, "Apple Cabbage Stew");
        addItem(ItemRegistry.APPLE_DUMPLING, "Apple Dumpling");
        addItem(ItemRegistry.BEEF_STEW, "Beef Stew");
        addItem(ItemRegistry.CABBAGE_SOUP, "Cabbage Soup");
        addItem(ItemRegistry.CABBAGE_POTATO_SOUP, "Cabbage Potato Soup");
        addItem(ItemRegistry.CHICKEN_DUMPLING, "Chicken Dumpling");
        addItem(ItemRegistry.CLAM_MEAT, "Clam Meat");
        addItem(ItemRegistry.SLICED_GOAT_CHEESE, "Sliced Goat Cheese");
        addItem(ItemRegistry.SLICED_EIDAR_CHEESE, "Sliced Eidar Cheese");
        addItem(ItemRegistry.GOURD, "Gourd");
        addItem(ItemRegistry.LEEK, "Leek");
        addItem(ItemRegistry.LEG_OF_GOAT, "Leg of Goat");
        addItem(ItemRegistry.LEG_OF_GOAT_ROAST, "Leg of Goat Roast");
        addItem(ItemRegistry.HORSE_MEAT, "Horse Meat");
        addItem(ItemRegistry.HORSE_HAUNCH, "Horse Haunch");
        addItem(ItemRegistry.VEGETABLE_SOUP, "Vegetable Soup");
        addItem(ItemRegistry.ASH_YAM, "Ash Yam");
        addItem(ItemRegistry.BOILED_CREME_TREAT, "Boiled Creme Treat");
        addItem(ItemRegistry.BRAIDED_BREAD, "Braided Bread");
        addItem(ItemRegistry.CLAM_CHOWDER, "Clam Chowder");
        addItem(ItemRegistry.GREEN_APPLE, "Green Apple");
        addItem(ItemRegistry.GRILLED_LEEKS, "Grilled Leeks");
        addItem(ItemRegistry.HONEY_NUT_TREAT, "Honey Nut Treat");
        addItem(ItemRegistry.JAZBAY_GRAPES, "Jazbay Grapes");
        addItem(ItemRegistry.JAZBAY_CROSTATA, "Jazbay Crostata");
        addItem(ItemRegistry.JUNIPER_BERRIES, "Juniper Berries");
        addItem(ItemRegistry.JUNIPER_BERRY_CROSTATA, "Juniper Berry Crostata");
        addItem(ItemRegistry.LAVENDER_DUMPLING, "Lavender Dumpling");
        addItem(ItemRegistry.MAMMOTH_CHEESE_BOWL, "Mammoth Cheese Bowl");
        addItem(ItemRegistry.POTATO_SOUP, "Potato Soup");
        addItem(ItemRegistry.SNOWBERRIES, "Snowberries");
        addItem(ItemRegistry.SNOWBERRY_CROSTATA, "Snowberry Crostata");

        // Alcoholic Beverages
        addItem(ItemRegistry.ALE, "Ale");
        addItem(ItemRegistry.ALTO_WINE, "Alto Wine");
        addItem(ItemRegistry.ARGONIAN_ALE, "Argonian Ale");
        addItem(ItemRegistry.NORD_MEAD, "Nord Mead");
        addItem(ItemRegistry.BLACK_BRIAR_MEAD, "Black-Briar Mead");
        addItem(ItemRegistry.BLACK_BRIAR_RESERVE, "Black-Briar Reserve");
        addItem(ItemRegistry.DRAGONS_BREATH_MEAD, "Dragon's Breath Mead");
        addItem(ItemRegistry.FIREBRAND_WINE, "Firebrand Wine");
        addItem(ItemRegistry.HONNINGBREW_MEAD, "Honningbrew Mead");
        addItem(ItemRegistry.MEAD_WITH_JUNIPER_BERRY, "Mead with Juniper Berry");
        addItem(ItemRegistry.SKOOMA, "Skooma");
        addItem(ItemRegistry.SPICED_WINE, "Spiced Wine");
        addItem(ItemRegistry.WINE, "Wine");

        // Ingredients
        addItem(ItemRegistry.SALMON_ROE, "Salmon Roe");
        addItem(ItemRegistry.GRASS_POD, "Grass Pod");
        addItem(ItemRegistry.FLOUR, "Flour");
        addItem(ItemRegistry.BUTTER, "Butter");
        addItem(ItemRegistry.SALT_PILE, "Salt Pile");

        // Seeds and Plantables
        addItem(ItemRegistry.GARLIC, "Garlic");
        addItem(ItemRegistry.TOMATO_SEEDS, "Tomato Seeds");
        addItem(ItemRegistry.CABBAGE_SEEDS, "Cabbage Seeds");
        addItem(ItemRegistry.ASH_YAM_SLIPS, "Ash Yam Slips");

        addItem(ItemRegistry.PEARL, "Pearl");
        addItem(ItemRegistry.BEE, "Bee");
        addItem(ItemRegistry.SMALL_PEARL, "Small Pearl");
        addBlock(BlockRegistry.BIRDS_NEST, "Birds Nest");
        addItem(BlockRegistry.BIRDS_NEST_ITEM, "Birds Nest");
        addItem(ItemRegistry.PINE_THRUSH_EGG, "Pine Thrush Egg");
        addItem(ItemRegistry.HAWK_EGG, "Hawk Egg");
        addItem(ItemRegistry.ROCK_WARBLER_EGG, "Rock Warbler Egg");

        // Blocks
        addBlock(BlockRegistry.OVEN, "Oven");
        addItem(BlockRegistry.OVEN_ITEM, "Oven");
        addBlock(BlockRegistry.RED_MOUNTAIN_FLOWER, "Red Mountain Flower");
        addItem(BlockRegistry.RED_MOUNTAIN_FLOWER_ITEM, "Red Mountain Flower");
        addBlock(BlockRegistry.BLUE_MOUNTAIN_FLOWER, "Blue Mountain Flower");
        addItem(BlockRegistry.BLUE_MOUNTAIN_FLOWER_ITEM, "Blue Mountain Flower");
        addBlock(BlockRegistry.YELLOW_MOUNTAIN_FLOWER, "Yellow Mountain Flower");
        addItem(BlockRegistry.YELLOW_MOUNTAIN_FLOWER_ITEM, "Yellow Mountain Flower");
        addBlock(BlockRegistry.PURPLE_MOUNTAIN_FLOWER, "Purple Mountain Flower");
        addItem(BlockRegistry.PURPLE_MOUNTAIN_FLOWER_ITEM, "Purple Mountain Flower");
        addBlock(BlockRegistry.LAVENDER, "Lavender");
        addItem(BlockRegistry.LAVENDER_ITEM, "Lavender");
        addBlock(BlockRegistry.CANIS_ROOT_BLOCK, "Canis Root");
        addItem(BlockRegistry.CANIS_ROOT, "Canis Root");
        addBlock(BlockRegistry.BLOODGRASS_BLOCK, "Bloodgrass");
        addItem(BlockRegistry.BLOODGRASS, "Bloodgrass");
        addBlock(BlockRegistry.BLEEDING_CROWN_BLOCK, "Bleeding Crown");
        addItem(BlockRegistry.BLEEDING_CROWN, "Bleeding Crown");
        addBlock(BlockRegistry.WHITE_CAP_BLOCK, "White Cap");
        addItem(BlockRegistry.WHITE_CAP, "White Cap");
        addBlock(BlockRegistry.BLISTERWORT_BLOCK, "Blisterwort");
        addItem(BlockRegistry.BLISTERWORT, "Blisterwort");
        addBlock(BlockRegistry.FLY_AMANITA_BLOCK, "Fly Amanita");
        addItem(BlockRegistry.FLY_AMANITA, "Fly Amanita");
        addBlock(BlockRegistry.CREEP_CLUSTER_BLOCK, "Creep Cluster");
        addItem(BlockRegistry.CREEP_CLUSTER, "Creep Cluster");
        addBlock(BlockRegistry.PEARL_OYSTER_BLOCK, "Pearl Oyster");
        addItem(BlockRegistry.PEARL_OYSTER_BLOCK_ITEM, "Pearl Oyster");
        addBlock(BlockRegistry.TOMATO_CROP, "Tomato Plant");
        addBlock(BlockRegistry.GARLIC_CROP, "Garlic Plant");
        addBlock(BlockRegistry.CABBAGE_CROP, "Cabbage Plant");
        addBlock(BlockRegistry.ASH_YAM_CROP, "Ash Yam Plant");
        addBlock(BlockRegistry.JAZBAY_GRAPE_BUSH, "Jazbay Grape Bush");
        addBlock(BlockRegistry.JUNIPER_BERRY_BUSH, "Juniper Berry Bush");
        addBlock(BlockRegistry.SNOWBERRY_BUSH, "Snowberry Bush");

        // Creative Tab
        add("creativetab.skyrimfood", "Skyrim Harvest and Hearth");

        // Tooltips and descriptions
        add("skyrimfood.tooltip.oven.1", "Cook food faster than a regular furnace");
        add("skyrimfood.tooltip.oven.2", "Right-click to open cooking interface");
        add("skyrimfood.tooltip.sweet_roll.1", "A delicious pastry from Skyrim");
        add("skyrimfood.tooltip.sweet_roll.2", "Provides absorption effect");
        add("skyrimfood.tooltip.garlic_bread.1", "Bread infused with garlic");
        add("skyrimfood.tooltip.garlic_bread.2", "Cures diseases when consumed");
        add("skyrimfood.tooltip.skooma.1", "A powerful narcotic beverage");
        add("skyrimfood.tooltip.skooma.2", "Handle with extreme caution");

        // JEI Categories (if using JEI)
        add("skyrimfood.jei.category.oven", "Oven Cooking");
        add("skyrimfood.jei.category.oven.description", "Cook food in the Skyrim Oven");
    }
}