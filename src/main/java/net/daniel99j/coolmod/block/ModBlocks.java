package net.daniel99j.coolmod.block;

import net.daniel99j.coolmod.CoolMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Item RegisterBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CoolMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CoolMod.LOGGER.info("Blocks Loading!!!1!");
    }
}
