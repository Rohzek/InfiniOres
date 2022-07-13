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
		// Blocks
		itemStacks.add(new ItemStack(InfiniOresBlocks.DEPLETED_STONE.get().asItem()));
		
		// Ores
		itemStacks.add(new ItemStack(InfiniOresBlocks.COAL_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.DIAMOND_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.EMERALD_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.GOLD_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.IRON_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.LAPIS_ORE.get().asItem()));
		itemStacks.add(new ItemStack(InfiniOresBlocks.REDSTONE_ORE.get().asItem()));
		
	};
}
