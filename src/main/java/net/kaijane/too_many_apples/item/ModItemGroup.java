package net.kaijane.too_many_apples.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kaijane.too_many_apples.TooManyApples;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup APPLES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TooManyApples.MOD_ID, "too_many_apples"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.too_many_apples"))
                    .icon(() -> new ItemStack(Apples.ENCHANTED_DIAMOND_APPLE)).entries((displayContext, entries) -> {

                        for (Item value : Apples.APPLES.values()) {
                            entries.add(value);
                        }

                    }).build());


    public static void registerItemGroups() {
        TooManyApples.LOGGER.info("Registering Item Groups for " + TooManyApples.MOD_ID);
    }
}