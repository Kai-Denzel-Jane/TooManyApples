package net.kaijane.too_many_apples.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kaijane.too_many_apples.item.Apples;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Apples.IRON_APPLE)
                .pattern("III")
                .pattern("IAI")
                .pattern("III")
                .input('I', Items.IRON_INGOT)
                .input('A', Items.APPLE)
                .criterion(FabricRecipeProvider.hasItem(Items.APPLE),
                        FabricRecipeProvider.conditionsFromItem(Items.APPLE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Apples.COPPER_APPLE)
                .pattern("CCC")
                .pattern("CAC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .input('A', Items.APPLE)
                .criterion(FabricRecipeProvider.hasItem(Items.APPLE),
                        FabricRecipeProvider.conditionsFromItem(Items.APPLE))
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Apples.DIAMOND_APPLE)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .input('A', Items.APPLE)
                .criterion(FabricRecipeProvider.hasItem(Items.APPLE),
                        FabricRecipeProvider.conditionsFromItem(Items.APPLE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Apples.ENCHANTED_GOLDEN_APPLE_STAGE_1)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', Items.GOLD_BLOCK)
                .input('A', Items.GOLDEN_APPLE)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_APPLE),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLDEN_APPLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Apples.ENCHANTED_GOLDEN_APPLE_STAGE_2)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', Items.GOLD_BLOCK)
                .input('A', Apples.ENCHANTED_GOLDEN_APPLE_STAGE_1)
                .criterion(FabricRecipeProvider.hasItem(Apples.ENCHANTED_GOLDEN_APPLE_STAGE_1),
                        FabricRecipeProvider.conditionsFromItem(Apples.ENCHANTED_GOLDEN_APPLE_STAGE_1))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .input('G', Items.GOLD_BLOCK)
                .input('A', Apples.ENCHANTED_GOLDEN_APPLE_STAGE_2)
                .criterion(FabricRecipeProvider.hasItem(Apples.ENCHANTED_GOLDEN_APPLE_STAGE_2),
                        FabricRecipeProvider.conditionsFromItem(Apples.ENCHANTED_GOLDEN_APPLE_STAGE_2))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter);

    }
}
