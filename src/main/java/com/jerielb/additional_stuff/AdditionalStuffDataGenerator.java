package com.jerielb.additional_stuff;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import com.jerielb.additional_stuff.datagen.ModItemTagProvider;
import com.jerielb.additional_stuff.datagen.ModBlockTagProvider;
import com.jerielb.additional_stuff.datagen.ModLootTableProvider;
import com.jerielb.additional_stuff.datagen.ModModelProvider;
import com.jerielb.additional_stuff.datagen.ModRecipeProvider;

public class AdditionalStuffDataGenerator implements DataGeneratorEntrypoint {
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
