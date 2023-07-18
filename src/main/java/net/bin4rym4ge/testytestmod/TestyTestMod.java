package net.bin4rym4ge.testytestmod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.bin4rym4ge.testytestmod.block.ModBlocks;
import net.bin4rym4ge.testytestmod.item.ModItemGroups;
import net.bin4rym4ge.testytestmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class TestyTestMod implements ModInitializer {
	
	
	public static final String MOD_ID = "testytestmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		ModItemGroups.registerItemGroups();
		
		ModItems.registerModItems();
		
		ModBlocks.registerModBlocks();
		
		

		LOGGER.info("Testy Test Loaded!");
	}
}