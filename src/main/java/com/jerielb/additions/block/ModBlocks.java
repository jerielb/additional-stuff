package com.jerielb.additions.block;

import com.jerielb.additions.Additions;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.SlimeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

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
	public static final Block RED_SLIME_BLOCK = registerBlock("red_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block PINK_SLIME_BLOCK = registerBlock("pink_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block MAGENTA_SLIME_BLOCK = registerBlock("magenta_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block PURPLE_SLIME_BLOCK = registerBlock("purple_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block BLUE_SLIME_BLOCK = registerBlock("blue_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block LIGHT_BLUE_SLIME_BLOCK = registerBlock("light_blue_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block CYAN_SLIME_BLOCK = registerBlock("cyan_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block GREEN_SLIME_BLOCK = registerBlock("green_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block YELLOW_SLIME_BLOCK = registerBlock("yellow_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block ORANGE_SLIME_BLOCK = registerBlock("orange_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block BROWN_SLIME_BLOCK = registerBlock("brown_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block BLACK_SLIME_BLOCK = registerBlock("black_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block GRAY_SLIME_BLOCK = registerBlock("gray_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block LIGHT_GRAY_SLIME_BLOCK = registerBlock("light_gray_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	public static final Block WHITE_SLIME_BLOCK = registerBlock("white_slime_block",
			new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));
	
	
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
