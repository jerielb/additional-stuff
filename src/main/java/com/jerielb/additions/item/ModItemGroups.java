package com.jerielb.additions.item;

import com.jerielb.additions.Additions;
import com.jerielb.additions.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	// tab group for ITEMS
	public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(Additions.MOD_ID, "additional_items"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(Items.CHARCOAL)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additions.additional_items")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// add items
//						entries.add(ModItems.<ITEM>);
					})
					.build());
	
	// tab group for BLOCKS
	public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(Additions.MOD_ID, "additional_blocks"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModBlocks.CHARCOAL_BLOCK)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additions.additional_blocks")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// add blocks
						entries.add(ModBlocks.CHARCOAL_BLOCK);
					})
					.build());
	
	// gets called by the Main class onInitialize() method
	public static void registerItemGroups() {
		Additions.LOGGER.info("Registering Item Groups for " + Additions.MOD_ID);
	}
}
