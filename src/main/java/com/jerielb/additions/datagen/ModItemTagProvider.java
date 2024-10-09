package com.jerielb.additions.datagen;

import com.jerielb.additions.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

/** Instead of adding tags to the JSON file use this class instead 
 * <p> 
 *  generates:
 *      /resources/data/<tutorialmod>/tags/item/*.json
 * <p> 
 * */
public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		getOrCreateTagBuilder(ItemTags.SWORDS)
				.add(ModItems.KINGDOM_KEY)
				.add(ModItems.JUNGLE_KING)
				.add(ModItems.THREE_WISHES)
				.add(ModItems.CRAB_CLAW)
				.add(ModItems.PUMPKINHEAD)
				.add(ModItems.FAIRY_HARP)
				.add(ModItems.WISHING_STAR)
				.add(ModItems.SPELLBINDER)
				.add(ModItems.METAL_CHOCOBO)
				.add(ModItems.OLYMPIA);
	}
}
