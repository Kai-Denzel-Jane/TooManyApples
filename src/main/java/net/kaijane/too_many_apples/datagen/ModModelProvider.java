package net.kaijane.too_many_apples.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kaijane.too_many_apples.item.Apples;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item value : Apples.APPLES.values()) {

            if (value.equals(Apples.ENCHANTED_DIAMOND_APPLE)) {
                itemModelGenerator.register(value, Apples.DIAMOND_APPLE, Models.HANDHELD);

            }

            else {
                itemModelGenerator.register(value, Models.HANDHELD);
            }
        }
    }
}
