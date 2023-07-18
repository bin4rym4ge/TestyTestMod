package net.bin4rym4ge.testytestmod.item;

import net.bin4rym4ge.testytestmod.TestyTestMod;
import net.bin4rym4ge.testytestmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	
	public static final ItemGroup TESTYTEST_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(TestyTestMod.MOD_ID, "testytestgroup"), 
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.testytest"))
			.icon(() -> new ItemStack(ModItems.TESTYTESTITEM)).entries((DisplayContext, entries) -> {
				
				entries.add(ModItems.TESTYTESTITEM);
				entries.add(ModItems.TESTIERTESTITEM);
				
				entries.add(Items.NETHERITE_PICKAXE);
				
				entries.add(ModBlocks.TESTYTESTBLOCK);
				entries.add(ModBlocks.TESTIERTESTBLOCK);
				
				
				
				entries.add(ModBlocks.TESTYTESTOREBLOCK);
				entries.add(ModBlocks.TESTIERTESTOREBLOCK);
				
				entries.add(ModBlocks.DEEPSLATE_TESTYTESTOREBLOCK);
				entries.add(ModBlocks.DEEPSLATE_TESTIERTESTOREBLOCK);
				
				entries.add(ModBlocks.NETHER_TESTYTESTOREBLOCK);
				entries.add(ModBlocks.NETHER_TESTIERTESTOREBLOCK);
				
				entries.add(ModBlocks.END_TESTYTESTOREBLOCK);
				entries.add(ModBlocks.END_TESTIERTESTOREBLOCK);

				
			}).build());
	
	public static void registerItemGroups() {
		TestyTestMod.LOGGER.info("Registering Item Groups for " + TestyTestMod.MOD_ID);
	}

}
