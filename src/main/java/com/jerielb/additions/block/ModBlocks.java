package com.jerielb.additions.block;

import com.jerielb.additions.Additions;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
	/*  list of added blocks --> TODO:
	 *
	 *  ADD entry to registerModBlocks() method below
	 *  ADD to ModItemGroups.java in the correct tab
	 *
	 *  /assets/additions/lang/en_us.json
	 *      --> to put a proper name to the item
	 *
	 *  /assets/additions/models/blockstates/*.json
	 *      --> "variants" - states of the block ("" means no other states)
	 *      --> "model" - location of the model of the block in /assets/models/block/*
	 *
	 *  /assets/additions/models/block/*.json
	 *      --> "parent" - how the block would be generated
	 *      --> "textures"/"all" - the location of the items texture in /assets/additions/textures/block directory
	 *
	 *  /assets/additions/models/item/*.json
	 *      --> "parent" - redirect to the .../models/block/*.json set above
	 *
	 *  /assets/additions/textures/block/*.png
	 *      --> the texture of the item
	 *
	 *
	 */
	public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
			new Block(AbstractBlock.Settings.create() // following are block settings
					.strength(4f) // duration to break block
					.requiresTool() // cannot break by hand
					.sounds(BlockSoundGroup.STONE) // sound of block
			)
	);
	
	// custom block
	
	
	// helper methods
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Additions.MOD_ID, name), block);
	}
	
	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(Additions.MOD_ID, name), new BlockItem(block, new Item.Settings()));
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModBlocks() {
		Additions.LOGGER.info("Registering Mod Blocks for " + Additions.MOD_ID);
	}
}
