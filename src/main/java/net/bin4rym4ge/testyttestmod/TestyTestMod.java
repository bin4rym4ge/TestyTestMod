package net.bin4rym4ge.testyttestmod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.bin4rym4ge.testyttestmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class TestyTestMod implements ModInitializer {
	
	
	public static final String MOD_ID = "testyttestmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}