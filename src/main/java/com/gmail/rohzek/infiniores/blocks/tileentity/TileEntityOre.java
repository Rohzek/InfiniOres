package com.gmail.rohzek.infiniores.blocks.tileentity;

import java.util.Random;

import com.gmail.rohzek.infiniores.blocks.DepletedOre;
import com.gmail.rohzek.infiniores.blocks.Ores;
import com.gmail.rohzek.infiniores.lib.DeferredRegistration;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;
import com.gmail.rohzek.infiniores.util.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityOre extends TileEntity implements ITickable
{
	private static Random random = new Random();
	
	private int timer = 30;
	private int chance = 100;
	
	public TileEntityOre(TileEntityType<?> tileEntity, DepletedOre ore) 
	{
		super(tileEntity);
		
		if(ore == Ores.COAL_ORE.get())
		{
			if(ConfigurationManager.GENERAL.coal_block_life_time_randomized.get()) 
			{
				timer = random.nextInt((int) ConfigurationManager.GENERAL.coal_block_life_time.get());
			}
			
			else 
			{
				timer = ConfigurationManager.GENERAL.coal_block_life_time.get();
			}
			
			
			if(ConfigurationManager.GENERAL.coal_block_randomized_replacement.get()) 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.coal_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.coal_block_replacement.get().size()))));
			}
			
			else 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.coal_block_replacement.get().get(0)));
			}
		}
		
		if(ore == Ores.DIAMOND_ORE.get()) 
		{
			
			if(ConfigurationManager.GENERAL.diamond_block_life_time_randomized.get()) 
			{
				timer = random.nextInt((int) ConfigurationManager.GENERAL.diamond_block_life_time.get());
			}
			
			else 
			{
				timer = ConfigurationManager.GENERAL.diamond_block_life_time.get();
			}
			
			
			if(ConfigurationManager.GENERAL.diamond_block_randomized_replacement.get()) 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.diamond_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.diamond_block_replacement.get().size()))));
			}
			
			else 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.diamond_block_replacement.get().get(0)));
			}
		}
		
		if(ore == Ores.EMERALD_ORE.get()) 
		{
			if(ConfigurationManager.GENERAL.emerald_block_life_time_randomized.get()) 
			{
				timer = random.nextInt((int) ConfigurationManager.GENERAL.emerald_block_life_time.get());
			}
			
			else 
			{
				timer = ConfigurationManager.GENERAL.emerald_block_life_time.get();
			}
			
			
			if(ConfigurationManager.GENERAL.emerald_block_randomized_replacement.get()) 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.emerald_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.emerald_block_replacement.get().size()))));
			}
			
			else 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.emerald_block_replacement.get().get(0)));
			}
		}
		
		if(ore == Ores.GOLD_ORE.get()) 
		{
			if(ConfigurationManager.GENERAL.gold_block_life_time_randomized.get()) 
			{
				timer = random.nextInt((int) ConfigurationManager.GENERAL.gold_block_life_time.get());
			}
			
			else 
			{
				timer = ConfigurationManager.GENERAL.gold_block_life_time.get();
			}
			
			if(ConfigurationManager.GENERAL.gold_block_randomized_replacement.get()) 
			{
				
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.gold_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.gold_block_replacement.get().size()))));
			}
			
			else 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.gold_block_replacement.get().get(0)));
			}	
		}
		
		if(ore == Ores.IRON_ORE.get()) 
		{
			if(ConfigurationManager.GENERAL.iron_block_life_time_randomized.get()) 
			{
				timer = random.nextInt((int) ConfigurationManager.GENERAL.iron_block_life_time.get());
			}
			
			else 
			{
				timer = ConfigurationManager.GENERAL.iron_block_life_time.get();
			}
			
			if(ConfigurationManager.GENERAL.iron_block_randomized_replacement.get()) 
			{
				
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.iron_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.iron_block_replacement.get().size()))));
			}
			
			else 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.iron_block_replacement.get().get(0)));
			}
		}
		
		if(ore == Ores.LAPIS_ORE.get()) 
		{
			if(ConfigurationManager.GENERAL.lapis_block_life_time_randomized.get()) 
			{
				timer = random.nextInt((int) ConfigurationManager.GENERAL.lapis_block_life_time.get());
			}
			
			else 
			{
				timer = ConfigurationManager.GENERAL.lapis_block_life_time.get();
			}
			
			if(ConfigurationManager.GENERAL.lapis_block_randomized_replacement.get()) 
			{
				
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.lapis_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.lapis_block_replacement.get().size()))));
			}
			
			else 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.lapis_block_replacement.get().get(0)));
			}
		}
		
		if(ore == Ores.REDSTONE_ORE.get()) 
		{
			if(ConfigurationManager.GENERAL.redstone_block_life_time_randomized.get()) 
			{
				timer = random.nextInt((int) ConfigurationManager.GENERAL.redstone_block_life_time.get());
			}
			
			else 
			{
				timer = ConfigurationManager.GENERAL.redstone_block_life_time.get();
			}
			
			if(ConfigurationManager.GENERAL.redstone_block_randomized_replacement.get()) 
			{
				
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.redstone_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.redstone_block_replacement.get().size()))));
			}
			
			else 
			{
				ore.regenerate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.redstone_block_replacement.get().get(0)));
			}
		}
	}
	
	// Was previously known as readFromNBT?
	@Override
	public void load(BlockState state, CompoundNBT compound) 
	{
		super.load(state, compound);
		this.timer = compound.getInt("timer");
		this.chance = compound.getInt("chance");
	}
	
	// Was previously known as writeToNBT?
	@Override
	public CompoundNBT save(CompoundNBT compound) 
	{
		compound.putInt("timer", timer);
		compound.putInt("chance", chance);
		return super.save(compound);
	}
	
	@Override
	public void tick() 
	{
		if (!level.isClientSide)
        {
			if(this.timer > 0) 
			{
				this.timer--;
				LogHelper.log("I should be ticking down " + timer);
			}
			else 
			{
				Block block = level.getBlockState(this.getBlockPos()).getBlock();
				
				if(random.nextInt(100) < chance)
				{
					LogHelper.log("I should be changing");
					//block.updateTick(level, worldPosition, level.getBlockState(worldPosition), new Random());
				}
			}
        }
		
	}
}
