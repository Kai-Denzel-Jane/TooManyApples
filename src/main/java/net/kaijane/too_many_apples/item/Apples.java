package net.kaijane.too_many_apples.item;

import net.kaijane.too_many_apples.TooManyApples;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
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

    public static final Item ENCHANTED_DIAMOND_APPLE = registerItem("enchanted_diamond_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_DIAMOND_APPLE)));


    // Enchanted apple stages


    // Gold

    public static final Item ENCHANTED_GOLDEN_APPLE_STAGE_1 = registerItem("enchanted_golden_apple_stage_1",
            new GlintItem(new Item.Settings()) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.enchanted_golden_apple_stage_1"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.hold_shift"));
                    }

                }

            });

    public static final Item ENCHANTED_GOLDEN_APPLE_STAGE_2 = registerItem("enchanted_golden_apple_stage_2",
            new GlintItem(new Item.Settings()){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.enchanted_golden_apple_stage_2"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.hold_shift"));
                    }

                }


            });

    // Diamond

    public static final Item ENCHANTED_DIAMOND_APPLE_STAGE_1 = registerItem("enchanted_diamond_apple_stage_1",
            new GlintItem(new Item.Settings()){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.enchanted_diamond_apple_stage_1"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.hold_shift"));
                    }

                }


            });

    public static final Item ENCHANTED_DIAMOND_APPLE_STAGE_2 = registerItem("enchanted_diamond_apple_stage_2",
            new GlintItem(new Item.Settings()){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.enchanted_diamond_apple_stage_2"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.too_many_apples.hold_shift"));
                    }

                }


            });

    static {
        APPLES.put("iron_apple", Apples.IRON_APPLE);
        APPLES.put("copper_apple", Apples.COPPER_APPLE);
        APPLES.put("diamond_apple", Apples.DIAMOND_APPLE);
        APPLES.put("enchanted_diamond_apple", Apples.ENCHANTED_DIAMOND_APPLE);
        APPLES.put("enchanted_golden_apple_stage_1", Apples.ENCHANTED_GOLDEN_APPLE_STAGE_1);
        APPLES.put("enchanted_golden_apple_stage_2", Apples.ENCHANTED_GOLDEN_APPLE_STAGE_2);
        APPLES.put("enchanted_diamond_apple_stage_1", Apples.ENCHANTED_DIAMOND_APPLE_STAGE_1);
        APPLES.put("enchanted_diamond_apple_stage_2", Apples.ENCHANTED_DIAMOND_APPLE_STAGE_2);
    }

    // Item register methods
    public static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(TooManyApples.MOD_ID, name), item);

    }


    public static void registerApples() {

        LOGGER.info("Registering apples");

    }

}
