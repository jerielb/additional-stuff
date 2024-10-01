package com.jerielb.additions;

import com.jerielb.additions.block.ModBlocks;
import com.jerielb.additions.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Additions implements ModInitializer {
	public static final String MOD_ID = "additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		
		ModBlocks.registerModBlocks();
		// slime blocks
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_SLIME_BLOCK, RenderLayer.getTranslucent());
		
		// fuel
		FuelRegistry.INSTANCE.add(ModBlocks.CHARCOAL_BLOCK, 16000);
	}
}