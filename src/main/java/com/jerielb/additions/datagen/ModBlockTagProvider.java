package com.jerielb.additions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/** Instead of adding tags to the JSON file use this class instead 
 * <p> 
 *  generates:
 *      /resources/data/minecraft/tags/block/*.json
 *      /resources/data/minecraft/tags/block/mineable/*.json
 * <p> 
 * */
public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
	}
}
