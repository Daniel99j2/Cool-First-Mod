package net.daniel99j.coolmod;

import net.daniel99j.coolmod.block.ModBlocks;
import net.daniel99j.coolmod.effect.ModEffectRegistry;
import net.daniel99j.coolmod.entity.ModEntities;
import net.daniel99j.coolmod.entity.custom.IceologerEntity;
import net.daniel99j.coolmod.item.ModItemGroups;
import net.daniel99j.coolmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolMod implements ModInitializer {
	public static final String MOD_ID = "coolmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItemGroups.registerItemGroups();
		ModEffectRegistry.registerAll();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FabricDefaultAttributeRegistry.register(ModEntities.ICEOLOGER, IceologerEntity.createIceologerAttributes());
		LOGGER.info("Its loaded I think");
	}
}