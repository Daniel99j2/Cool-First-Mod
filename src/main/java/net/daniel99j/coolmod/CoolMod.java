package net.daniel99j.coolmod;

import net.daniel99j.coolmod.block.ModBlocks;
import net.daniel99j.coolmod.effect.ModEffects;
import net.daniel99j.coolmod.item.ModItemGroups;
import net.daniel99j.coolmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolMod implements ModInitializer {
	public static final String MOD_ID = "coolmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItemGroups.registerItemGroups();
		ModEffects.registerModEffects();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Its loaded I think");
	}
}