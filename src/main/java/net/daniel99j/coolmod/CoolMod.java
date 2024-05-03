package net.daniel99j.coolmod;

import net.daniel99j.coolmod.block.ModBlocks;
import net.daniel99j.coolmod.effect.FreezeStatusEffect;
import net.daniel99j.coolmod.entity.ModEntities;
import net.daniel99j.coolmod.entity.custom.IceologerEntity;
import net.daniel99j.coolmod.item.ModItemGroups;
import net.daniel99j.coolmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Uuids;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolMod implements ModInitializer {
	public static final String MOD_ID = "coolmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final StatusEffect FREEZE = new FreezeStatusEffect().addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "32c6faf4-63be-455d-b7bd-58ee1f458621", -1024, EntityAttributeModifier.Operation.ADDITION);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "freeze"), FREEZE);
		FabricDefaultAttributeRegistry.register(ModEntities.ICEOLOGER, IceologerEntity.createIceologerAttributes());
		LOGGER.info("Its loaded I think");
	}
}