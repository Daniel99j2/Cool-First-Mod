package net.daniel99j.coolmod.item;

import net.daniel99j.coolmod.CoolMod;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COOL = RegisterItem("cool", new Item(new FabricItemSettings()));
    public static final Item COOLBERRY_ICECREAM = RegisterItem("cool", new Item(new FabricItemSettings().maxCount(16).food(ModFoodComponents.COOLBERRY_ICECREAM)));
    public static final Item COOL_SUNGLASSES = RegisterItem("cool_sunglasses", new Item(new FabricItemSettings().equipmentSlot(stack -> EquipmentSlot.HEAD).maxCount(1)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COOL);
    }

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CoolMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoolMod.LOGGER.info("Registering Items for " + CoolMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
