package net.kaijane.too_many_apples.item;

import net.kaijane.too_many_apples.TooManyApples;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

import static net.kaijane.too_many_apples.TooManyApples.LOGGER;

public class Apples {

    // The apples themselves



    public static final Map<String, Item> APPLES = new HashMap<>();

    public static final Item IRON_APPLE = registerItem("iron_apple",
            new Item(new Item.Settings().food(ModFoodComponents.IRON_APPLE)));


    public static final Item COPPER_APPLE = registerItem("copper_apple",
            new Item(new Item.Settings().food(ModFoodComponents.COPPER_APPLE)));

    public static final Item DIAMOND_APPLE = registerItem("diamond_apple",
            new Item(new Item.Settings().food(ModFoodComponents.DIAMOND_APPLE)));


    // Enchanted golden apple stages

    public static final Item ENCHANTED_GOLDEN_APPLE_STAGE_1 = registerItem("enchanted_golden_apple_stage_1",
            new Item(new Item.Settings()));

    public static final Item ENCHANTED_GOLDEN_APPLE_STAGE_2 = registerItem("enchanted_golden_apple_stage_2",
            new Item(new Item.Settings()));

    static {
        APPLES.put("iron_apple", Apples.IRON_APPLE);
        APPLES.put("copper_apple", Apples.COPPER_APPLE);
        APPLES.put("diamond_apple", Apples.DIAMOND_APPLE);
    }

    // Item register methods
    public static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(TooManyApples.MOD_ID, name), item);

    }


    public static void registerApples() {

        LOGGER.info("Registering apples");

    }

}
