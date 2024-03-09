package net.kaijane.too_many_apples.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(Blocks.OAK_LEAVES, (Block block) -> this.oakLeavesDrops(block, Blocks.OAK_SAPLING, SAPLING_DROP_CHANCE));


    }

    @Override
    public LootTable.Builder oakLeavesDrops(Block leaves, Block drop, float ... chance) {
        return this.leavesDrops(leaves, drop, chance).
                pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.
                                create(1.0f))
                        .conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS)
                        .with(((LeafEntry.Builder<?>)this
                                .addSurvivesExplosionCondition(leaves, ItemEntry
                                        .builder(Items.APPLE)))
                                .conditionally(TableBonusLootCondition
                                        .builder(Enchantments.FORTUNE, 0.01f, 0.0111111114f, 0.0125f, 0.016666668f, 0.05f))));
    }
}


