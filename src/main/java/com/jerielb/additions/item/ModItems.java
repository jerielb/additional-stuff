package com.jerielb.additions.item;

import com.jerielb.additions.Additions;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	
	// helper method
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Additions.MOD_ID, name), item);
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModItems() {
		Additions.LOGGER.info("Registering Mod Items for " + Additions.MOD_ID);
	}
}