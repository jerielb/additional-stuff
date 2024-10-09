package com.jerielb.additions.item;

import com.jerielb.additions.Additions;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item KINGDOM_KEY = registerItem("kingdom_key", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item JUNGLE_KING = registerItem("jungle_king", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item THREE_WISHES = registerItem("three_wishes", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item CRAB_CLAW = registerItem("crab_claw", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item PUMPKINHEAD = registerItem("pumpkinhead", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item FAIRY_HARP = registerItem("fairy_harp", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item WISHING_STAR = registerItem("wishing_star", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item SPELLBINDER = registerItem("spellbinder", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item METAL_CHOCOBO = registerItem("metal_chocobo", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OLYMPIA = registerItem("olympia", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item LIONHEART = registerItem("lionheart", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OATHKEEPER = registerItem("oathkeeper", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OBLIVION = registerItem("oblivion", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	
	// helper method
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Additions.MOD_ID, name), item);
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModItems() {
		Additions.LOGGER.info("Registering Mod Items for " + Additions.MOD_ID);
	}
}