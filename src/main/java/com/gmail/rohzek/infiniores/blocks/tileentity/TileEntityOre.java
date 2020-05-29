package com.gmail.rohzek.infiniores.blocks.tileentity;

import java.util.Random;

import com.gmail.rohzek.infiniores.blocks.DepletedOre;
import com.gmail.rohzek.infiniores.blocks.Ores;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;
import com.gmail.rohzek.infiniores.util.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityOre extends TileEntity implements ITickable
{
	private static Random random = new Random();
	
	private long timer = 30;
	private int chance = 100;
	
	public TileEntityOre(DepletedOre ore) 
	{
		if(ore == Ores.COAL_ORE) 
		{
			if(ConfigurationManager.coal_block_life_time_randomized) 
			{
				timer = random.nextInt((int) ConfigurationManager.coal_block_life_time);
			}
			
			else 
			{
				timer = ConfigurationManager.coal_block_life_time;
			}
			
			
			if(ConfigurationManager.coal_block_randomized_replacement) 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.coal_block_replacement[random.nextInt(ConfigurationManager.coal_block_replacement.length)]);
			}
			
			else 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.coal_block_replacement[0]);
			}
		}
		
		if(ore == Ores.DIAMOND_ORE) 
		{
			
			if(ConfigurationManager.diamond_block_life_time_randomized) 
			{
				timer = random.nextInt((int) ConfigurationManager.diamond_block_life_time);
			}
			
			else 
			{
				timer = ConfigurationManager.diamond_block_life_time;
			}
			
			
			if(ConfigurationManager.diamond_block_randomized_replacement) 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.diamond_block_replacement[random.nextInt(ConfigurationManager.diamond_block_replacement.length)]);
			}
			
			else 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.diamond_block_replacement[0]);
			}
		}
		
		if(ore == Ores.EMERALD_ORE) 
		{
			if(ConfigurationManager.emerald_block_life_time_randomized) 
			{
				timer = random.nextInt((int) ConfigurationManager.emerald_block_life_time);
			}
			
			else 
			{
				timer = ConfigurationManager.emerald_block_life_time;
			}
			
			
			if(ConfigurationManager.emerald_block_randomized_replacement) 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.emerald_block_replacement[random.nextInt(ConfigurationManager.emerald_block_replacement.length)]);
			}
			
			else 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.emerald_block_replacement[0]);
			}
		}
		
		if(ore == Ores.GOLD_ORE) 
		{
			if(ConfigurationManager.gold_block_life_time_randomized) 
			{
				timer = random.nextInt((int) ConfigurationManager.gold_block_life_time);
			}
			
			else 
			{
				timer = ConfigurationManager.gold_block_life_time;
			}
			
			if(ConfigurationManager.gold_block_randomized_replacement) 
			{
				
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.gold_block_replacement[random.nextInt(ConfigurationManager.gold_block_replacement.length)]);
			}
			
			else 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.gold_block_replacement[0]);
			}	
		}
		
		if(ore == Ores.IRON_ORE) 
		{
			if(ConfigurationManager.iron_block_life_time_randomized) 
			{
				timer = random.nextInt((int) ConfigurationManager.iron_block_life_time);
			}
			
			else 
			{
				timer = ConfigurationManager.iron_block_life_time;
			}
			
			if(ConfigurationManager.iron_block_randomized_replacement) 
			{
				
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.iron_block_replacement[random.nextInt(ConfigurationManager.iron_block_replacement.length)]);
			}
			
			else 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.iron_block_replacement[0]);
			}
		}
		
		if(ore == Ores.LAPIS_ORE) 
		{
			if(ConfigurationManager.lapis_block_life_time_randomized) 
			{
				timer = random.nextInt((int) ConfigurationManager.lapis_block_life_time);
			}
			
			else 
			{
				timer = ConfigurationManager.lapis_block_life_time;
			}
			
			if(ConfigurationManager.lapis_block_randomized_replacement) 
			{
				
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.lapis_block_replacement[random.nextInt(ConfigurationManager.lapis_block_replacement.length)]);
			}
			
			else 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.lapis_block_replacement[0]);
			}
		}
		
		if(ore == Ores.REDSTONE_ORE) 
		{
			if(ConfigurationManager.redstone_block_life_time_randomized) 
			{
				timer = random.nextInt((int) ConfigurationManager.redstone_block_life_time);
			}
			
			else 
			{
				timer = ConfigurationManager.redstone_block_life_time;
			}
			
			if(ConfigurationManager.redstone_block_randomized_replacement) 
			{
				
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.redstone_block_replacement[random.nextInt(ConfigurationManager.redstone_block_replacement.length)]);
			}
			
			else 
			{
				ore.regenerate = Block.getBlockFromName(ConfigurationManager.redstone_block_replacement[0]);
			}
		}
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		this.timer = compound.getLong("timer");
		this.chance = compound.getInteger("chance");
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) 
	{
		compound.setLong("timer", timer);
		compound.setInteger("chance", chance);
		return super.writeToNBT(compound);
	}

	@Override
	public void update() 
	{
		if (!world.isRemote)
        {
			if(this.timer > 0) 
			{
				this.timer--;
				LogHelper.log("I should be ticking down " + timer);
			}
			else 
			{
				Block block = world.getBlockState(this.getPos()).getBlock();
				
				if(random.nextInt(100) < chance)
				{
					LogHelper.log("I should be changing");
					block.updateTick(world, pos, world.getBlockState(pos), new Random());
				}
			}
        }
	}
}
