package com.gmail.rohzek.infiniores.blocks;

import com.gmail.rohzek.infiniores.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Ores 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);
	
	public static DepletedOre DEPLETED_ORE_BLOCK = new DepletedOre(Ores.DEPLETED_ORE_BLOCK, 0);
	public static DepletedOre COAL_ORE_BLOCK = new DepletedOre(Blocks.COAL_ORE, 0);
	public static DepletedOre DIAMOND_ORE_BLOCK = new DepletedOre(Blocks.DIAMOND_ORE, 2);
	public static DepletedOre EMERALD_ORE_BLOCK = new DepletedOre(Blocks.EMERALD_ORE,  2);
	public static DepletedOre IRON_ORE_BLOCK = new DepletedOre(Blocks.IRON_ORE, 1);
	public static DepletedOre GOLD_ORE_BLOCK = new DepletedOre(Blocks.GOLD_ORE, 2);
	public static DepletedOre LAPIS_ORE_BLOCK = new DepletedOre(Blocks.LAPIS_ORE, 1);
	public static DepletedOre REDSTONE_ORE_BLOCK = new DepletedOre(Blocks.REDSTONE_ORE, 2);
	
	public static final RegistryObject<Block> DEPLETED_ORE = BLOCKS.register("depleted_ore", () -> DEPLETED_ORE_BLOCK);
	public static final RegistryObject<Block> COAL_ORE = BLOCKS.register("depleted_ore_coal", () -> COAL_ORE_BLOCK);
	public static final RegistryObject<Block> DIAMOND_ORE = BLOCKS.register("depleted_ore_diamond", () -> DIAMOND_ORE_BLOCK);
	public static final RegistryObject<Block> EMERALD_ORE = BLOCKS.register("depleted_ore_emerald", () -> EMERALD_ORE_BLOCK);
	public static final RegistryObject<Block> IRON_ORE = BLOCKS.register("depleted_ore_iron", () -> IRON_ORE_BLOCK);
	public static final RegistryObject<Block> GOLD_ORE = BLOCKS.register("depleted_ore_gold", () -> GOLD_ORE_BLOCK);
	public static final RegistryObject<Block> LAPIS_ORE = BLOCKS.register("depleted_ore_lapis", () -> LAPIS_ORE_BLOCK);
	public static final RegistryObject<Block> REDSTONE_ORE = BLOCKS.register("depleted_ore_redstone", () -> REDSTONE_ORE_BLOCK);

	public static void register(IEventBus eventBus) 
	{
		BLOCKS.register(eventBus);
	}
	
	/*
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
		public static final Set<BlockItem> ITEM_BLOCKS = new HashSet<BlockItem>();

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
			BlockItem[] items = new BlockItem[DEPLETED_ORES.size()];
			
			for(int i = 0; i < items.length; i++)
			{
				items[i] = new BlockItem(blocks[i]);
			}

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final BlockItem item : items) 
			{
				registry.register(item.setRegistryName(item.getBlock().getRegistryName()));
				ITEM_BLOCKS.add(item);
			}
		}
	}
	*/
}
