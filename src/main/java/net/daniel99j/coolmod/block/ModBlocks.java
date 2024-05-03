package net.daniel99j.coolmod.block;

import net.daniel99j.coolmod.CoolMod;
import net.daniel99j.coolmod.block.custom.IcicleBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
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
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).requiresTool()));

    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));

    public static final Block ICE_BRICKS_STAIRS = registerBlock("ice_bricks_stairs",
            new StairsBlock(ModBlocks.ICE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));

    public static final Block ICE_BRICKS_SLAB = registerBlock("ice_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));

    public static final Block ICE_BRICKS_WALL = registerBlock("ice_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));

    public static final Block ICE_BUTTON = registerBlock("ice_button",
            new ButtonBlock(BlockSetType.IRON, 200, FabricBlockSettings.copyOf(Blocks.PACKED_ICE).collidable(false)));

    public static final Block ICE_PRESSURE_PLATE = registerBlock("ice_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(Blocks.PACKED_ICE).collidable(false)));

    public static final Block ICE_DOOR = registerBlock("ice_door",
            new DoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));

    public static final Block ICE_TRAPDOOR = registerBlock("ice_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));

    public static final Block ICICLE = registerBlock("icicle",
            new IcicleBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).dynamicBounds().offset(AbstractBlock.OffsetType.XZ).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never)));

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
