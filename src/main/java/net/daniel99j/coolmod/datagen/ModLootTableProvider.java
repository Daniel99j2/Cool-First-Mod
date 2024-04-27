package net.daniel99j.coolmod.datagen;

import net.daniel99j.coolmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.SlabBlock;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COOL_BLOCK);
        addDrop(ModBlocks.BRIGHT_BLOCK);
        addDropWithSilkTouch(ModBlocks.ICE_BRICKS);
        addDropWithSilkTouch(ModBlocks.ICE_BRICKS_STAIRS);
        addDropWithSilkTouch(ModBlocks.ICE_BRICKS_WALL);
        addDrop(ModBlocks.ICE_BUTTON);
        addDropWithSilkTouch(ModBlocks.ICE_TRAPDOOR);
        addDropWithSilkTouch(ModBlocks.ICE_PRESSURE_PLATE);

        addDrop(ModBlocks.ICE_DOOR, doorDrops(ModBlocks.ICE_DOOR));
        addDrop(ModBlocks.ICE_BRICKS_SLAB, slabDrops(ModBlocks.ICE_BRICKS_SLAB));
    }
}
