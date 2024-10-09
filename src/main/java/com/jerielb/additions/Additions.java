package com.jerielb.additions;

import com.jerielb.additions.block.ModBlocks;
import com.jerielb.additions.item.ModItemGroups;
import com.jerielb.additions.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Additions implements ModInitializer {
	public static final String MOD_ID = "additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		
		// fuel
		FuelRegistry.INSTANCE.add(ModBlocks.CHARCOAL_BLOCK, 16000);
	}
}