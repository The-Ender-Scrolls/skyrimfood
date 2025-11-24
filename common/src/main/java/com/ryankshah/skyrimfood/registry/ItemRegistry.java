package com.ryankshah.skyrimfood.registry;

import com.ryankshah.skyrimfood.Constants;
import com.ryankshah.skyrimfood.item.SkyrimAlcohol;
import com.ryankshah.skyrimfood.registration.RegistrationProvider;
import com.ryankshah.skyrimfood.registration.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ItemRegistry
{
    public static void init() {}

    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registries.ITEM, Constants.MOD_ID);

    public static final RegistryObject<Item, Item> SWEET_ROLL = ITEMS.register("sweet_roll",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.2f).build(),
                            Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)).build()
                    )
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "sweet_roll")))
            ));
    public static final RegistryObject<Item, Item> GARLIC_BREAD = ITEMS.register("garlic_bread",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.2f).build(),
                            Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(EffectRegistry.CURE_DISEASE.asHolder(), 200, 2), 1f)).build()
                    )
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "garlic_bread")))
            ));
    public static final RegistryObject<Item, Item> POTATO_BREAD = ITEMS.register("potato_bread",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "potato_bread")))
            ));
    public static final RegistryObject<Item, Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "tomato")))
            ));
    public static final RegistryObject<Item, Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "apple_pie")))
            ));
    public static final RegistryObject<Item, Item> MAMMOTH_STEAK = ITEMS.register("mammoth_steak",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "mammoth_steak")))
            ));
    public static final RegistryObject<Item, Item> VENISON = ITEMS.register("venison",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "venison")))
            ));
    public static final RegistryObject<Item, Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "cabbage")))
            ));
    public static final RegistryObject<Item, Item> TOMATO_SOUP = ITEMS.register("tomato_soup",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "tomato_soup")))
            ));
    public static final RegistryObject<Item, Item> APPLE_CABBAGE_STEW = ITEMS.register("apple_cabbage_stew",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "apple_cabbage_stew")))
            ));
    public static final RegistryObject<Item, Item> APPLE_DUMPLING = ITEMS.register("apple_dumpling",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "apple_dumpling")))
            ));
    public static final RegistryObject<Item, Item> BEEF_STEW = ITEMS.register("beef_stew",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "beef_stew")))
            ));
    public static final RegistryObject<Item, Item> CABBAGE_SOUP = ITEMS.register("cabbage_soup",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "cabbage_soup")))
            ));
    public static final RegistryObject<Item, Item> CABBAGE_POTATO_SOUP = ITEMS.register("cabbage_potato_soup",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "cabbage_potato_soup")))
            ));
    public static final RegistryObject<Item, Item> CHICKEN_DUMPLING = ITEMS.register("chicken_dumpling",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chicken_dumpling")))
            ));
    public static final RegistryObject<Item, Item> CLAM_MEAT = ITEMS.register("clam_meat",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "clam_meat")))
            ));
    public static final RegistryObject<Item, Item> SLICED_GOAT_CHEESE = ITEMS.register("sliced_goat_cheese",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "sliced_goat_cheese")))
            ));
    public static final RegistryObject<Item, Item> SLICED_EIDAR_CHEESE = ITEMS.register("sliced_eidar_cheese",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "sliced_eidar_cheese")))
            ));
    public static final RegistryObject<Item, Item> GOURD = ITEMS.register("gourd",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "gourd")))
            ));
    public static final RegistryObject<Item, Item> LEEK = ITEMS.register("leek",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "leek")))
            ));
    public static final RegistryObject<Item, Item> LEG_OF_GOAT = ITEMS.register("leg_of_goat",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.2f).build(),
                            Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HUNGER, 200, 2), 1f)).build()
                    )
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "leg_of_goat")))
            ));
    public static final RegistryObject<Item, Item> LEG_OF_GOAT_ROAST = ITEMS.register("leg_of_goat_roast",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "leg_of_goat_roast")))
            ));
    public static final RegistryObject<Item, Item> HORSE_MEAT = ITEMS.register("horse_meat",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.2f).build(),
                            Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HUNGER, 200, 2), 1f)).build()
                    )
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "horse_meat")))
            ));
    public static final RegistryObject<Item, Item> HORSE_HAUNCH = ITEMS.register("horse_haunch",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "horse_haunch")))
            ));
    public static final RegistryObject<Item, Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "vegetable_soup")))
            ));
    public static final RegistryObject<Item, Item> ASH_YAM = ITEMS.register("ash_yam",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "ash_yam")))
            ));
    public static final RegistryObject<Item, Item> ASH_YAM_SLIPS = ITEMS.register("ash_yam_slips",
            () -> new BlockItem(BlockRegistry.ASH_YAM_CROP.get(), new Item.Properties()
                    .useItemDescriptionPrefix()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "ash_yam_slips")))
            ));
    public static final RegistryObject<Item, Item> BOILED_CREME_TREAT = ITEMS.register("boiled_creme_treat",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "boiled_creme_treat")))
            ));
    public static final RegistryObject<Item, Item> BRAIDED_BREAD = ITEMS.register("braided_bread",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "braided_bread")))
            ));
    public static final RegistryObject<Item, Item> CLAM_CHOWDER = ITEMS.register("clam_chowder",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "clam_chowder")))
            ));
    public static final RegistryObject<Item, Item> GREEN_APPLE = ITEMS.register("green_apple",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "green_apple")))
            ));
    public static final RegistryObject<Item, Item> GRILLED_LEEKS = ITEMS.register("grilled_leeks",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "grilled_leeks")))
            ));
    public static final RegistryObject<Item, Item> HONEY_NUT_TREAT = ITEMS.register("honey_nut_treat",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "honey_nut_treat")))
            ));
    public static final RegistryObject<Item, Item> JAZBAY_GRAPES = ITEMS.register("jazbay_grapes",
            () -> new BlockItem(BlockRegistry.JAZBAY_GRAPE_BUSH.get(), new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .useItemDescriptionPrefix()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "jazbay_grapes")))
            ));
    public static final RegistryObject<Item, Item> JAZBAY_CROSTATA = ITEMS.register("jazbay_crostata",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "jazbay_crostata")))
            ));
    public static final RegistryObject<Item, Item> JUNIPER_BERRIES = ITEMS.register("juniper_berries",
            () -> new BlockItem(BlockRegistry.JUNIPER_BERRY_BUSH.get(), new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .useItemDescriptionPrefix()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "juniper_berries")))
            ));
    public static final RegistryObject<Item, Item> JUNIPER_BERRY_CROSTATA = ITEMS.register("juniper_berry_crostata",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "juniper_berry_crostata")))
            ));
    public static final RegistryObject<Item, Item> LAVENDER_DUMPLING = ITEMS.register("lavender_dumpling",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "lavender_dumpling")))
            ));
    public static final RegistryObject<Item, Item> MAMMOTH_CHEESE_BOWL = ITEMS.register("mammoth_cheese_bowl",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "mammoth_cheese_bowl")))
            ));
    public static final RegistryObject<Item, Item> POTATO_SOUP = ITEMS.register("potato_soup",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "potato_soup")))
            ));
    public static final RegistryObject<Item, Item> SNOWBERRIES = ITEMS.register("snowberries",
            () -> new BlockItem(BlockRegistry.SNOWBERRY_BUSH.get(), new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .useItemDescriptionPrefix()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "snowberries")))
            ));
    public static final RegistryObject<Item, Item> SNOWBERRY_CROSTATA = ITEMS.register("snowberry_crostata",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "snowberry_crostata")))
            ));

    public static final RegistryObject<Item, Item> ALE = ITEMS.register("ale", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "ale")))));
    public static final RegistryObject<Item, Item> ALTO_WINE = ITEMS.register("alto_wine", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "alto_wine")))));
    public static final RegistryObject<Item, Item> ARGONIAN_ALE = ITEMS.register("argonian_ale", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "argonian_ale")))));
    public static final RegistryObject<Item, Item> NORD_MEAD = ITEMS.register("nord_mead", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "nord_mead")))));
    public static final RegistryObject<Item, Item> BLACK_BRIAR_MEAD = ITEMS.register("black_briar_mead", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "black_briar_mead")))));
    public static final RegistryObject<Item, Item> BLACK_BRIAR_RESERVE = ITEMS.register("black_briar_reserve", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "black_briar_reserve")))));
    public static final RegistryObject<Item, Item> DRAGONS_BREATH_MEAD = ITEMS.register("dragons_breath_mead", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "dragons_breath_mead")))));
    public static final RegistryObject<Item, Item> FIREBRAND_WINE = ITEMS.register("firebrand_wine", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "firebrand_wine")))));
    public static final RegistryObject<Item, Item> HONNINGBREW_MEAD = ITEMS.register("honningbrew_mead", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "honningbrew_mead")))));
    public static final RegistryObject<Item, Item> MEAD_WITH_JUNIPER_BERRY = ITEMS.register("mead_with_juniper_berry", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "mead_with_juniper_berry")))));
    public static final RegistryObject<Item, Item> SKOOMA = ITEMS.register("skooma", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "skooma")))));
    public static final RegistryObject<Item, Item> SPICED_WINE = ITEMS.register("spiced_wine", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "spiced_wine")))));
    public static final RegistryObject<Item, Item> WINE = ITEMS.register("wine", () -> new SkyrimAlcohol(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "wine")))));

    public static final RegistryObject<Item, Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "flour")))));
    public static final RegistryObject<Item, Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "butter")))));
    public static final RegistryObject<Item, Item> SALT_PILE = ITEMS.register("salt_pile", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "salt_pile")))));
    public static final RegistryObject<Item, Item> GRASS_POD = ITEMS.register("grass_pod", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "grass_pod")))));
    public static final RegistryObject<Item, Item> SALMON_ROE = ITEMS.register("salmon_roe", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "salmon_roe")))));

    public static final RegistryObject<Item, Item> PEARL = ITEMS.register("pearl", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "pearl")))));
    public static final RegistryObject<Item, Item> BEE = ITEMS.register("bee", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "bee")))));
    public static final RegistryObject<Item, Item> SMALL_PEARL = ITEMS.register("small_pearl", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "small_pearl")))));
    public static final RegistryObject<Item, Item> PINE_THRUSH_EGG = ITEMS.register("pine_thrush_egg", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "pine_thrush_egg")))));
    public static final RegistryObject<Item, Item> ROCK_WARBLER_EGG = ITEMS.register("rock_warbler_egg", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "rock_warbler_egg")))));
    public static final RegistryObject<Item, Item> HAWK_EGG = ITEMS.register("hawk_egg", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "hawk_egg")))));

    public static final RegistryObject<Item, BlockItem> GARLIC = ITEMS.register("garlic", () -> new BlockItem(BlockRegistry.GARLIC_CROP.get(), new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "garlic")))));
    public static final RegistryObject<Item, BlockItem> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new BlockItem(BlockRegistry.TOMATO_CROP.get(), new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "tomato_seeds")))));
    public static final RegistryObject<Item, BlockItem> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds", () -> new BlockItem(BlockRegistry.CABBAGE_CROP.get(), new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "cabbage_seeds")))));
}