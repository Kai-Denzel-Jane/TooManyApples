package net.kaijane.too_many_apples.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kaijane.too_many_apples.item.Apples;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Define the recipes for each apple type
        createAppleRecipe(exporter, Apples.IRON_APPLE, Items.IRON_INGOT, Items.APPLE);
        createAppleRecipe(exporter, Apples.COPPER_APPLE, Items.COPPER_BLOCK, Items.APPLE);
        createAppleRecipe(exporter, Apples.DIAMOND_APPLE, Items.DIAMOND, Items.APPLE);
        createAppleRecipe(exporter, Apples.ENCHANTED_GOLDEN_APPLE_STAGE_1, Items.GOLD_BLOCK, Items.GOLDEN_APPLE);
        createAppleRecipe(exporter, Apples.ENCHANTED_GOLDEN_APPLE_STAGE_2, Items.GOLD_BLOCK, Apples.ENCHANTED_GOLDEN_APPLE_STAGE_1);
        createAppleRecipe(exporter, Items.ENCHANTED_GOLDEN_APPLE, Items.GOLD_BLOCK, Apples.ENCHANTED_GOLDEN_APPLE_STAGE_2);
        createAppleRecipe(exporter, Apples.ENCHANTED_DIAMOND_APPLE_STAGE_1, Items.DIAMOND_BLOCK, Apples.DIAMOND_APPLE);
        createAppleRecipe(exporter, Apples.ENCHANTED_DIAMOND_APPLE_STAGE_2, Items.DIAMOND_BLOCK, Apples.ENCHANTED_DIAMOND_APPLE_STAGE_1);
        createAppleRecipe(exporter, Apples.ENCHANTED_DIAMOND_APPLE, Items.DIAMOND_BLOCK, Apples.ENCHANTED_DIAMOND_APPLE_STAGE_2);
    }

    // Helper method to create a recipe for an apple type
    private void createAppleRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item ingredient1, Item ingredient2) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ingredient1)
                .input('B', ingredient2)
                .criterion(FabricRecipeProvider.hasItem(ingredient1), FabricRecipeProvider.conditionsFromItem(ingredient1))
                .criterion(FabricRecipeProvider.hasItem(ingredient2), FabricRecipeProvider.conditionsFromItem(ingredient2))
                .offerTo(exporter);
    }
}