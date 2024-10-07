package com.jerielb.additions.item;

import com.jerielb.additions.Additions;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	/* list of added items --> TODO:
	 *
	 *   /assets/tutorialmod/lang/en_us.json
	 *       --> put a proper name to the item
	 *
	 *   /assets/tutorialmod/models/item/*.json
	 *       --> "parent" - how the item would be generated
	 *       --> "textures"/"layer*" - the location of the items texture in /assets/tutorialmod/textures
	 *
	 *   /assets/tutorialmod/textures/item/*.png
	 *       --> the texture of the item
	 */
	public static final Item KINGDOM_KEY = registerItem("kingdom_key", new Item(new Item.Settings()));
	
	// helper method
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Additions.MOD_ID, name), item);
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModItems() {
		Additions.LOGGER.info("Registering Mod Items for " + Additions.MOD_ID);
	}
}
