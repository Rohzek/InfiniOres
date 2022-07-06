package com.gmail.rohzek.infiniores.events;

import com.gmail.rohzek.infiniores.blocks.Ores;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

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
				
				String[] coal = ConfigurationManager.GENERAL.coal_block_spawn.get().split(":");
				String[] diamond = ConfigurationManager.GENERAL.diamond_block_spawn.get().split(":");
				String[] emerald = ConfigurationManager.GENERAL.emerald_block_spawn.get().split(":");
				String[] gold = ConfigurationManager.GENERAL.gold_block_spawn.get().split(":");
				String[] iron = ConfigurationManager.GENERAL.iron_block_spawn.get().split(":");
				String[] lapis = ConfigurationManager.GENERAL.lapis_block_spawn.get().split(":");
				String[] redstone = ConfigurationManager.GENERAL.redstone_block_spawn.get().split(":");
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(coal[0], coal[1])))
				{
					EventBlock(event, block, Ores.COAL_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(diamond[0], diamond[1]))) 
				{
					EventBlock(event, block, Ores.DIAMOND_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(emerald[0], emerald[1]))) 
				{
					EventBlock(event, block, Ores.EMERALD_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(gold[0] ,gold[1]))) 
				{
					EventBlock(event, block, Ores.GOLD_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(iron[0], iron[1]))) 
				{
					EventBlock(event, block, Ores.IRON_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(lapis[0], lapis[1]))) 
				{
					EventBlock(event, block, Ores.LAPIS_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
				}
				
				if(block == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(redstone[0], redstone[1]))) 
				{
					EventBlock(event, block, Ores.REDSTONE_ORE.get().defaultBlockState(), drops, world, pos, state, fortune);
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
