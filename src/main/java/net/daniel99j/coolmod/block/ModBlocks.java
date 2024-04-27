package net.daniel99j.coolmod.block;

import net.daniel99j.coolmod.CoolMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Add blocks
    public static final Block COOL_BLOCK = registerBlock("cool_block",
            //To copy, new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK));
            //and, you can add copyOf(...).sounds(BlockSoundGroup.AMETHYST_BLOCK) for example
            new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).instrument(Instrument.BELL).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block BRIGHT_BLOCK = registerBlock("bright_block",
            //To copy,( new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
            //and, you can add copyOf(...).sounds(BlockSoundGroup.AMETHYST_BLOCK) for example
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).requiresTool()));


    //Block Utils
    private static Block registerBlock(String name, Block block) {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CoolMod.MOD_ID, name), block);
    }

    private static Item RegisterBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CoolMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CoolMod.LOGGER.info("Blocks Loading!!!1!");
    }
}
