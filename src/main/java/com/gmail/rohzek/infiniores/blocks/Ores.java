package com.gmail.rohzek.infiniores.blocks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gmail.rohzek.infiniores.blocks.tileentity.TileEntityOre;
import com.gmail.rohzek.infiniores.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class Ores 
{
	public static DepletedOre DEPLETED_ORE = new DepletedOre(Ores.DEPLETED_ORE, "depleted_ore", 0);
	public static DepletedOre COAL_ORE = new DepletedOre(Blocks.COAL_ORE, "depleted_ore_coal", 0);
	public static DepletedOre DIAMOND_ORE = new DepletedOre(Blocks.DIAMOND_ORE, "depleted_ore_diamond", 2);
	public static DepletedOre EMERALD_ORE = new DepletedOre(Blocks.EMERALD_ORE, "depleted_ore_emerald", 2);
	public static DepletedOre IRON_ORE = new DepletedOre(Blocks.IRON_ORE, "depleted_ore_iron", 1);
	public static DepletedOre GOLD_ORE = new DepletedOre(Blocks.GOLD_ORE, "depleted_ore_gold", 2);
	public static DepletedOre LAPIS_ORE = new DepletedOre(Blocks.LAPIS_ORE, "depleted_ore_lapis", 1);
	public static DepletedOre REDSTONE_ORE = new DepletedOre(Blocks.REDSTONE_ORE, "depleted_ore_redstone", 2);
	
	public static List<DepletedOre> DEPLETED_ORES = Arrays.asList(new DepletedOre[] 
	{
			DEPLETED_ORE,
			COAL_ORE,
			DIAMOND_ORE,
			EMERALD_ORE,
			IRON_ORE,
			GOLD_ORE,
			LAPIS_ORE,
			REDSTONE_ORE,
	});
	
	static Block[] blocks;
	
	public static void registerRenders() 
	{	
		for(DepletedOre ore : DEPLETED_ORES)
		{
			registerRender(ore);
		}
	}
	
	private static void registerRender(Block block)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerTileEntities()
	{
		registerTileEntity(TileEntityOre.class);
	}
	
	private static void registerTileEntity(Class<? extends TileEntity> classname) 
	{
		GameRegistry.registerTileEntity(classname, new ResourceLocation(Reference.MODID));
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler 
	{
		public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<ItemBlock>();

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) 
		{
			final IForgeRegistry<Block> registry = event.getRegistry();
			blocks = new Block[DEPLETED_ORES.size()];

			for(int i = 0; i < DEPLETED_ORES.size(); i++)
			{
				blocks[i] = DEPLETED_ORES.get(i);
			}

			registry.registerAll(blocks);
		}
		
		@SubscribeEvent
		public static void registerItemBlocks(RegistryEvent.Register<Item> event) 
		{	
			ItemBlock[] items = new ItemBlock[DEPLETED_ORES.size()];
			
			for(int i = 0; i < items.length; i++)
			{
				items[i] = new ItemBlock(blocks[i]);
			}

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final ItemBlock item : items) 
			{
				registry.register(item.setRegistryName(item.getBlock().getRegistryName()));
				ITEM_BLOCKS.add(item);
			}
		}
	}
}
