package net.bin4rym4ge.testytestmod.block;

import net.bin4rym4ge.testytestmod.TestyTestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
	
	//custom blocks
	
	public static final Block TESTYTESTBLOCK = registerBlock("testytest_block", 
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
	
	public static final Block TESTIERTESTBLOCK = registerBlock("testiertest_block", 
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
	
	
	
	//custom ore blocks
	
	public static final Block TESTYTESTOREBLOCK = registerBlock("testytestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
	
	public static final Block TESTIERTESTOREBLOCK = registerBlock("testiertestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));

	
	
	public static final Block DEEPSLATE_TESTYTESTOREBLOCK = registerBlock("deepslate_testytestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
	
	public static final Block DEEPSLATE_TESTIERTESTOREBLOCK = registerBlock("deepslate_testiertestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));


	
	public static final Block NETHER_TESTYTESTOREBLOCK = registerBlock("nether_testytestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.5f).sounds(BlockSoundGroup.NETHERRACK), UniformIntProvider.create(5, 9)));
	
	public static final Block NETHER_TESTIERTESTOREBLOCK = registerBlock("nether_testiertestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.5f).sounds(BlockSoundGroup.NETHERRACK), UniformIntProvider.create(5, 9)));


		
	public static final Block END_TESTYTESTOREBLOCK = registerBlock("end_testytestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(15, 20)));
	
	public static final Block END_TESTIERTESTOREBLOCK = registerBlock("end_testiertestore_block",
			new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(15, 20)));


	
	//register custom blocks and block items
	
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
