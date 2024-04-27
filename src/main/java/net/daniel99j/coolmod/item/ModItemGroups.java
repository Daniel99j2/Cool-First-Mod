package net.daniel99j.coolmod.item;

import net.daniel99j.coolmod.CoolMod;
import net.daniel99j.coolmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static  final ItemGroup COOL_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CoolMod.MOD_ID, "cool"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cool"))
                    .icon(() -> new ItemStack(ModItems.COOL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COOL);
                        entries.add(Items.TNT);
                        entries.add(ModBlocks.COOL_BLOCK);
                        entries.add(ModBlocks.BRIGHT_BLOCK);
                        entries.add(ModBlocks.ICE_BRICKS);
                        entries.add(ModBlocks.ICE_BUTTON);
                        entries.add(ModBlocks.ICE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ICE_DOOR);
                        entries.add(ModBlocks.ICE_TRAPDOOR);
                        entries.add(ModBlocks.ICE_BRICKS_SLAB);
                        entries.add(ModBlocks.ICE_BRICKS_WALL);
                        entries.add(ModBlocks.ICE_BRICKS_STAIRS);
                    }).build());
    public static void registerItemGroups() {
        CoolMod.LOGGER.info("Item Groups Loading!!!11!1!");
    }
}
