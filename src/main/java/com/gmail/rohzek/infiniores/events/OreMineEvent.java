package com.gmail.rohzek.infiniores.events;

import com.gmail.rohzek.infiniores.blocks.Ores;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class OreMineEvent 
{
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) 
	{
		ServerWorld world = (ServerWorld) event.getWorld();
		
		if(!world.isClientSide()) 
		{
			if(!event.getPlayer().isCreative()) 
			{
				
				BlockPos pos = event.getPos();
				BlockState state = event.getState();
				Block block = event.getState().getBlock();
				ItemStack stack = event.getPlayer().inventory.getCarried();
				int fortune = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, stack);
				
				NonNullList<ItemStack> drops = NonNullList.create();
				
				if(block == Block.getBlockFromName(ConfigurationManager.coal_block_spawn)) 
				{
					EventBlock(event, block, Ores.COAL_ORE_BLOCK.defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.diamond_block_spawn)) 
				{
					EventBlock(event, block, Ores.DIAMOND_ORE_BLOCK.defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.emerald_block_spawn)) 
				{
					EventBlock(event, block, Ores.EMERALD_ORE_BLOCK.defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.gold_block_spawn)) 
				{
					EventBlock(event, block, Ores.GOLD_ORE_BLOCK.defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.iron_block_spawn)) 
				{
					EventBlock(event, block, Ores.IRON_ORE_BLOCK.defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.lapis_block_spawn)) 
				{
					EventBlock(event, block, Ores.LAPIS_ORE_BLOCK.defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == Block.getBlockFromName(ConfigurationManager.redstone_block_spawn)) 
				{
					EventBlock(event, block, Ores.REDSTONE_ORE_BLOCK.defaultBlockState(), drops, world, pos, state, fortune);
				}
			}
		}
	}

	@SuppressWarnings("static-access")
	private static void EventBlock(BreakEvent event, Block block, BlockState spawn, NonNullList<ItemStack> drops, ServerWorld world, BlockPos pos, BlockState state, int fortune) 
	{
		//world.setBlockState(pos, spawn);
		world.setBlockAndUpdate(pos, spawn);
		drops.clear();
		//block.getDrops(drops, world, pos, state, fortune);
		block.getDrops(state, world, pos, null);
		
		int xp = block.getExpDrop(state, world, pos, fortune, 0);
		
		//world.spawnEntity(new XPOrbEntity(world, pos.getX(), pos.getY(), pos.getZ(), xp));
		event.getPlayer().giveExperienceLevels(xp);
		
		for(ItemStack stack : drops) 
		{
			//world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), stack));
		}
		
		event.setCanceled(true);
	}
}
