package com.jerielb.additions;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import com.jerielb.additions.datagen.ModItemTagProvider;
import com.jerielb.additions.datagen.ModBlockTagProvider;
import com.jerielb.additions.datagen.ModLootTableProvider;
import com.jerielb.additions.datagen.ModModelProvider;
import com.jerielb.additions.datagen.ModRecipeProvider;

public class AdditionsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
