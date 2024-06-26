package net.daniel99j.coolmod.datagen;

import net.daniel99j.coolmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BRIGHT_BLOCK)
                .add(ModBlocks.COOL_BLOCK)
                .add(ModBlocks.ICE_BRICKS);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ICE_BRICKS_WALL);
    }
}
