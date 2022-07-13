package com.gmail.rohzek.infiniores.events;

import com.gmail.rohzek.infiniores.blocks.InfiniOresBlocks;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber
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
				
				// Blocks
				String[] stone = ConfigurationManager.GENERAL.stone_block_spawn.get().split(":");
				// Ores
				String[] coal = ConfigurationManager.GENERAL.coal_block_spawn.get().split(":");
				String[] diamond = ConfigurationManager.GENERAL.diamond_block_spawn.get().split(":");
				String[] emerald = ConfigurationManager.GENERAL.emerald_block_spawn.get().split(":");
				String[] gold = ConfigurationManager.GENERAL.gold_block_spawn.get().split(":");
				String[] iron = ConfigurationManager.GENERAL.iron_block_spawn.get().split(":");
				String[] lapis = ConfigurationManager.GENERAL.lapis_block_spawn.get().split(":");
				String[] redstone = ConfigurationManager.GENERAL.redstone_block_spawn.get().split(":");
				
				// Blocks
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(stone[0], stone[1])))
				{
					EventBlock(event, block, InfiniOresBlocks.DEPLETED_STONE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				// Ores
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(coal[0], coal[1])))
				{
					EventBlock(event, block, InfiniOresBlocks.COAL_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(diamond[0], diamond[1]))) 
				{
					EventBlock(event, block, InfiniOresBlocks.DIAMOND_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(emerald[0], emerald[1]))) 
				{
					EventBlock(event, block, InfiniOresBlocks.EMERALD_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(gold[0] ,gold[1]))) 
				{
					EventBlock(event, block, InfiniOresBlocks.GOLD_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(iron[0], iron[1]))) 
				{
					EventBlock(event, block, InfiniOresBlocks.IRON_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(lapis[0], lapis[1]))) 
				{
					EventBlock(event, block, InfiniOresBlocks.LAPIS_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(redstone[0], redstone[1]))) 
				{
					EventBlock(event, block, InfiniOresBlocks.REDSTONE_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
			}
		}
	}

	@SuppressWarnings({ "static-access" })
	private static void EventBlock(BreakEvent event, Block block, BlockState spawn, NonNullList<ItemStack> drops, ServerWorld world, BlockPos pos, BlockState state, int fortune) 
	{
		world.setBlockAndUpdate(pos, spawn);
		drops.clear();
		block.getDrops(state, world, pos, null);
		
		int xp = block.getExpDrop(state, world, pos, fortune, 0);
		
		event.getPlayer().giveExperienceLevels(xp);
		
		for(ItemStack stack : drops) 
		{
			world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), stack));
		}
		
		event.setCanceled(true);
	}
}
