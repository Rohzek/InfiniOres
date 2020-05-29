package com.gmail.rohzek.infiniores.events;

import com.gmail.rohzek.infiniores.blocks.Ores;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
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
	public static void onBlockBreak(BlockEvent.BreakEvent event) 
	{
		World world = event.getWorld();
		
		if(!world.isRemote) 
		{
			if(!event.getPlayer().capabilities.isCreativeMode) 
			{
				
				BlockPos pos = event.getPos();
				IBlockState state = event.getState();
				Block block = event.getState().getBlock();
				ItemStack stack = event.getPlayer().inventory.getCurrentItem();
				int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
				
				NonNullList<ItemStack> drops = NonNullList.create();
				
				if(block == Block.getBlockFromName(ConfigurationManager.coal_block_spawn)) 
				{
					EventBlock(event, block, Ores.COAL_ORE.getDefaultState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.diamond_block_spawn)) 
				{
					EventBlock(event, block, Ores.DIAMOND_ORE.getDefaultState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.emerald_block_spawn)) 
				{
					EventBlock(event, block, Ores.EMERALD_ORE.getDefaultState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.gold_block_spawn)) 
				{
					EventBlock(event, block, Ores.GOLD_ORE.getDefaultState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.iron_block_spawn)) 
				{
					EventBlock(event, block, Ores.IRON_ORE.getDefaultState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.lapis_block_spawn)) 
				{
					EventBlock(event, block, Ores.LAPIS_ORE.getDefaultState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.redstone_block_spawn)) 
				{
					EventBlock(event, block, Ores.REDSTONE_ORE.getDefaultState(), drops, world, pos, state, fortune);
				}
			}
		}
	}

	private static void EventBlock(BreakEvent event, Block block, IBlockState spawn, NonNullList<ItemStack> drops, World world, BlockPos pos, IBlockState state, int fortune) 
	{
		world.setBlockState(pos, spawn);
		drops.clear();
		block.getDrops(drops, world, pos, state, fortune);
		
		int xp = block.getExpDrop(state, world, pos, fortune);
		
		world.spawnEntity(new EntityXPOrb(world, pos.getX(), pos.getY(), pos.getZ(), xp));
		
		for(ItemStack stack : drops) 
		{
			world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY() + 1, pos.getZ(), stack));
		}
		
		event.setCanceled(true);
	}
}
