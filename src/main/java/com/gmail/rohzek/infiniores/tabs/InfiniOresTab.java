package com.gmail.rohzek.infiniores.tabs;

import com.gmail.rohzek.infiniores.blocks.InfiniOresBlocks;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class InfiniOresTab extends ItemGroup
{

	public InfiniOresTab(String label) 
	{
		super(label);
	}

	@Override
	public ItemStack makeIcon() 
	{
		return new ItemStack(Blocks.COAL_ORE.getBlock());
	}
	
	@Override
	public void fillItemList(NonNullList<ItemStack> itemStacks) 
	{
		// Pickaxe Blocks
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_STONE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_ANDESITE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_DIORITE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_GRANITE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_HARDENED_CLAY.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_NETHERRACK.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_MAGMA.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_GLOWSTONE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_OBSIDIAN.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_CRYING_OBSIDIAN.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_BRICKS.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_NETHER_BRICKS.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_END_STONE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_ICE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_PACKED_ICE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SANDSTONE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SANDSTONE_CHISELED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SANDSTONE_SMOOTH.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SANDSTONE_RED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SANDSTONE_RED_CHISELED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SANDSTONE_RED_SMOOTH.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SEA_LANTERN.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_PRISMARINE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_PRISMARINE_BRICKS.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_DARK_PRISMARINE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_PURPUR.get().asItem()));
		
		// Shovel Blocks
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SAND.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_RED_SAND.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_GRAVEL.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SOUL_SAND.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_GRASS.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_DIRT.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_COARSE_DIRT.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_PODZOL.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_MYCELIUM.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_SNOW.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_CLAY.get().asItem()));
		
		// Ores
		itemStacks.add(new ItemStack(InfiniOresBlocks.COAL_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DIAMOND_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.EMERALD_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.GOLD_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.IRON_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.LAPIS_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.REDSTONE_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_NETHER_QUARTZ.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_NETHER_GOLD_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_ANCIENT_DEBRIS.get().asItem()));
		
		// Logs
		// Oak
		itemStacks.add(new ItemStack(InfiniOresBlocks.OAK_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.OAK_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.OAK_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.OAK_WOOD_STRIPPED.get().asItem()));
		
		// Spruce
		itemStacks.add(new ItemStack(InfiniOresBlocks.SPRUCE_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.SPRUCE_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.SPRUCE_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.SPRUCE_WOOD_STRIPPED.get().asItem()));
				
		// Birch
		itemStacks.add(new ItemStack(InfiniOresBlocks.BIRCH_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.BIRCH_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.BIRCH_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.BIRCH_WOOD_STRIPPED.get().asItem()));
				
		// Jungle
		itemStacks.add(new ItemStack(InfiniOresBlocks.JUNGLE_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.JUNGLE_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.JUNGLE_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.JUNGLE_WOOD_STRIPPED.get().asItem()));
				
		// Acacia
		itemStacks.add(new ItemStack(InfiniOresBlocks.ACACIA_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.ACACIA_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.ACACIA_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.ACACIA_WOOD_STRIPPED.get().asItem()));
				
		// Dark Oak
		itemStacks.add(new ItemStack(InfiniOresBlocks.DARK_OAK_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DARK_OAK_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DARK_OAK_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DARK_OAK_WOOD_STRIPPED.get().asItem()));
				
		// Crimson
		itemStacks.add(new ItemStack(InfiniOresBlocks.CRIMSON_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.CRIMSON_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.CRIMSON_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.CRIMSON_WOOD_STRIPPED.get().asItem()));
				
		// Warped
		itemStacks.add(new ItemStack(InfiniOresBlocks.WARPED_LOG.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.WARPED_LOG_STRIPPED.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.WARPED_WOOD.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.WARPED_WOOD_STRIPPED.get().asItem()));
	};
}
