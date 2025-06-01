package com.jerielb.additional_stuff.item;

import com.jerielb.additional_stuff.AdditionalStuff;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	
	// helper method
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(AdditionalStuff.MOD_ID, name), item);
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModItems() {
		AdditionalStuff.LOGGER.info("Registering Mod Items for " + AdditionalStuff.MOD_ID);
	}
}