package com.jerielb.additional_stuff.datagen;

import com.jerielb.additional_stuff.block.ModBlocks;
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
		
	}
}
