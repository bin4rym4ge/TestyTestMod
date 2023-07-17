package net.bin4rym4ge.testyttestmod.item;

import net.bin4rym4ge.testyttestmod.TestyTestMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	
	private static Item registerItem(String name, Item item) {
		
		return Registry.register(Registries.ITEM, new Identifier(TestyTestMod.MOD_ID, name), item)
		
	}
	
	public static void registerModItems() {
		
		TestyTestMod.LOGGER.info("Registering mod items for" + TestyTestMod.MOD_ID);
		
		
		
	}

}
