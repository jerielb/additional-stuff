package com.jerielb.additions.datagen;

import com.jerielb.additions.block.ModBlocks;
import com.jerielb.additions.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

/** Instead of adding tags to the JSON file use this class instead 
 * <p> 
 *  generates:
 *      /resources/assets/<tutorialmod>/blockstates/*.json
 *      /resources/assets/<tutorialmod>/models/block/*.json
 *      /resources/assets/<tutorialmod>/models/item/*.json
 * <p> 
 * */
public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}
	
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHARCOAL_BLOCK);
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.KINGDOM_KEY, Models.HANDHELD);
		itemModelGenerator.register(ModItems.JUNGLE_KING, Models.HANDHELD);
		itemModelGenerator.register(ModItems.THREE_WISHES, Models.HANDHELD);
		itemModelGenerator.register(ModItems.CRAB_CLAW, Models.HANDHELD);
		itemModelGenerator.register(ModItems.PUMPKINHEAD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.FAIRY_HARP, Models.HANDHELD);
		itemModelGenerator.register(ModItems.WISHING_STAR, Models.HANDHELD);
		itemModelGenerator.register(ModItems.SPELLBINDER, Models.HANDHELD);
		itemModelGenerator.register(ModItems.METAL_CHOCOBO, Models.HANDHELD);
		itemModelGenerator.register(ModItems.OLYMPIA, Models.HANDHELD);
		itemModelGenerator.register(ModItems.LIONHEART, Models.HANDHELD);
		itemModelGenerator.register(ModItems.OATHKEEPER, Models.HANDHELD);
		itemModelGenerator.register(ModItems.OBLIVION, Models.HANDHELD);
		itemModelGenerator.register(ModItems.LADY_LUCK, Models.HANDHELD);
	}
}
