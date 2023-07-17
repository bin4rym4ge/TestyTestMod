package net.bin4rym4ge.testyttestmod.item;

import net.bin4rym4ge.testyttestmod.TestyTestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	
	public static final Item TESTYTESTITEM = registerItem("testytestitem", new Item(new FabricItemSettings()));
	
	private static void addItemsToIngerdientTabItemGoup(FabricItemGroupEntries entries) {
		entries.add(TESTYTESTITEM);
	}
	
	private static Item registerItem(String name, Item item) {
		
		return Registry.register(Registries.ITEM, new Identifier(TestyTestMod.MOD_ID, name), item);
		
	}
	
	public static void registerModItems() {
		
		TestyTestMod.LOGGER.info("Registering mod items for" + TestyTestMod.MOD_ID);
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngerdientTabItemGoup);
		
	}

}