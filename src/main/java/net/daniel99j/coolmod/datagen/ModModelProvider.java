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
        BlockStateModelGenerator.BlockTexturePool icePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ICE_BRICKS);

        icePool.button(ModBlocks.ICE_BUTTON);
        icePool.pressurePlate(ModBlocks.ICE_PRESSURE_PLATE);
        icePool.slab(ModBlocks.ICE_BRICKS_SLAB);
        icePool.stairs(ModBlocks.ICE_BRICKS_STAIRS);
        icePool.wall(ModBlocks.ICE_BRICKS_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.ICE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ICE_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COOL, Models.GENERATED);
    }
}
