package com.jerielb.additional_stuff;

import com.jerielb.additional_stuff.block.ModBlocks;
import com.jerielb.additional_stuff.item.ModItemGroups;
import com.jerielb.additional_stuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalStuff implements ModInitializer {
	public static final String MOD_ID = "additional_stuff";
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