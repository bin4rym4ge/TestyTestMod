package net.bin4rym4ge.testytestmod.block;

import net.bin4rym4ge.testytestmod.TestyTestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
	
	public static final Block TESTYTESTBLOCK = registerBlock("testytest_block", 
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
	
	
	
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		
		return Registry.register(Registries.BLOCK, new Identifier(TestyTestMod.MOD_ID, name), block);
		
	}
	
	public static Item registerBlockItem(String name, Block block) {
		
		return Registry.register(Registries.ITEM, new Identifier(TestyTestMod.MOD_ID, name), 
				new BlockItem(block, new FabricItemSettings()));
		
	}
	
	public static void registerModBlocks() {
		TestyTestMod.LOGGER.info("Registering ModBlocks for " + TestyTestMod.MOD_ID);
	}

}
