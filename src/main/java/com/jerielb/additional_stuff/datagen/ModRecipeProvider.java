package com.jerielb.additional_stuff.datagen;

import com.jerielb.additional_stuff.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/** Instead of adding tags to the JSON file use this class instead 
 * <p> 
 *  generates:
 *      /resources/data/<tutorialmod>/recipe/*.json
 * <p> 
 * */
public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}
	
	@Override
	public void generate(RecipeExporter exporter) {
		
		// compactible recipes
		offerReversibleCompactingRecipes(exporter,
				RecipeCategory.BUILDING_BLOCKS,
				Items.CHARCOAL,               // BASE_ITEM = x9
				RecipeCategory.DECORATIONS,
				ModBlocks.CHARCOAL_BLOCK         // COMPACT_ITEM = x1
		);
	}
}
