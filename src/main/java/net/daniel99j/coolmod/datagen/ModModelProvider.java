package net.daniel99j.coolmod.datagen;

import net.daniel99j.coolmod.block.ModBlocks;
import net.daniel99j.coolmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COOL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COOL, Models.GENERATED);
    }
}
