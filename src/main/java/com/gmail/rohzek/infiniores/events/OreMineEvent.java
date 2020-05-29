package com.gmail.rohzek.infiniores.events;

import com.gmail.rohzek.infiniores.blocks.Ores;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class OreMineEvent 
{
	@SubscribeEvent
	public static void onModelRegistry(BlockEvent.BreakEvent event) 
	{
		if(!event.getPlayer().capabilities.isCreativeMode) 
		{
			World world = event.getWorld();
			BlockPos pos = event.getPos();
			IBlockState state = event.getState();
			Block block = event.getState().getBlock();
			ItemStack stack = event.getPlayer().inventory.getCurrentItem();
			int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
			
			NonNullList<ItemStack> drops = NonNullList.create();
			
			if(block == Blocks.COAL_ORE) 
			{
				EventBlock(event, block, Ores.COAL_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
			
			if(block == Blocks.DIAMOND_ORE) 
			{
				EventBlock(event, block, Ores.DIAMOND_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
			
			if(block == Blocks.EMERALD_ORE) 
			{
				EventBlock(event, block, Ores.EMERALD_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
			
			if(block == Blocks.GOLD_ORE) 
			{
				EventBlock(event, block, Ores.GOLD_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
			
			if(block == Blocks.IRON_ORE) 
			{
				EventBlock(event, block, Ores.IRON_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
			
			if(block == Blocks.LAPIS_ORE) 
			{
				EventBlock(event, block, Ores.LAPIS_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
			
			if(block == Blocks.REDSTONE_ORE) 
			{
				EventBlock(event, block, Ores.REDSTONE_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
			
			if(block == Blocks.LIT_REDSTONE_ORE)
			{
				EventBlock(event, block, Ores.REDSTONE_ORE.getDefaultState(), drops, world, pos, state, fortune);
			}
		}
	}

	private static void EventBlock(BreakEvent event, Block block, IBlockState spawn, NonNullList<ItemStack> drops, World world, BlockPos pos, IBlockState state, int fortune) 
	{
		world.setBlockState(pos, spawn);
		drops.clear();
		block.getDrops(drops, world, pos, state, fortune);
		
		for(ItemStack stack : drops) 
		{
			world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY() + 1, pos.getZ(), stack));
		}
		
		event.setCanceled(true);
	}
}
