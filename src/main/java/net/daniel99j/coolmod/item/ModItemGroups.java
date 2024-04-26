package net.daniel99j.coolmod.item;

import net.daniel99j.coolmod.CoolMod;
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
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(Items.TNT);
                    }).build());
    public static void registerItemGroups() {
        CoolMod.LOGGER.info("Item Groups Loading!!!11!1!");
    }
}
