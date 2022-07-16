package com.gmail.rohzek.infiniores.blocks.tileentity;

import java.util.Random;

import com.gmail.rohzek.infiniores.blocks.DepletedLog;
import com.gmail.rohzek.infiniores.blocks.InfiniOresBlocks;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;
import com.gmail.rohzek.infiniores.util.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityLog extends TileEntity implements ITickableTileEntity
{
	private static Random random = new Random();
	
	private int timer = 30;
	private int chance = 100;
	
	public TileEntityLog() 
	{
		super(InfiniOresTileEntities.LOG_TILE_ENTITY.get());
	}
	
	public TileEntityLog(TileEntityType<?> tileEntity, DepletedLog log) 
	{
		super(tileEntity);
		
		// Logs
		if(log == InfiniOresBlocks.OAK_LOG.get())
		{
			timer = ConfigurationManager.GENERAL.oak_log_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.oak_log_block_life_time.get()) : ConfigurationManager.GENERAL.oak_log_block_life_time.get();
			log.regenerate = ConfigurationManager.GENERAL.oak_log_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_log_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.oak_log_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_log_block_replacement.get().get(0)));
		}
		
		// Stripped Logs
		if(log == InfiniOresBlocks.OAK_LOG_STRIPPED.get())
		{
			timer = ConfigurationManager.GENERAL.oak_log_stripped_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.oak_log_stripped_block_life_time.get()) : ConfigurationManager.GENERAL.oak_log_stripped_block_life_time.get();
			log.regenerate = ConfigurationManager.GENERAL.oak_log_stripped_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_log_stripped_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.oak_log_stripped_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_log_stripped_block_replacement.get().get(0)));
		}
		
		// Wood
		if(log == InfiniOresBlocks.OAK_WOOD.get())
		{
			timer = ConfigurationManager.GENERAL.oak_wood_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.oak_wood_block_life_time.get()) : ConfigurationManager.GENERAL.oak_wood_block_life_time.get();
			log.regenerate = ConfigurationManager.GENERAL.oak_wood_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_wood_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.oak_wood_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_wood_block_replacement.get().get(0)));
		}
		
		// Stripped Wood
		if(log == InfiniOresBlocks.OAK_WOOD_STRIPPED.get())
		{
			timer = ConfigurationManager.GENERAL.oak_wood_stripped_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.oak_wood_stripped_block_life_time.get()) : ConfigurationManager.GENERAL.oak_wood_stripped_block_life_time.get();
			log.regenerate = ConfigurationManager.GENERAL.oak_wood_stripped_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_wood_stripped_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.oak_wood_stripped_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.oak_wood_stripped_block_replacement.get().get(0)));
		}
	}
	
	// Was previously known as readFromNBT?
	@Override
	public void load(BlockState state, CompoundNBT compound) 
	{
		super.load(state, compound);
		this.timer = compound.getInt("timer");
		this.chance = compound.getInt("chance");
		LogHelper.debug("I should be loading timer as " + timer + " and chance as " + chance);
	}
		
	// Was previously known as writeToNBT?
	@Override
	public CompoundNBT save(CompoundNBT compound) 
	{
		LogHelper.debug("I should be saving timer as " + timer + " and chance as " + chance);
		compound.putInt("timer", timer);
		compound.putInt("chance", chance);
		return super.save(compound);
	}
		
	@SuppressWarnings("deprecation")
	@Override
	public void tick() 
	{
		if (!level.isClientSide)
	       {
				if(this.timer > 0) 
				{
					this.timer--;
					LogHelper.debug("I should be ticking down " + timer);
				}
				else 
				{
					Block block = level.getBlockState(this.getBlockPos()).getBlock();
					
					if(random.nextInt(100) < chance)
					{
						LogHelper.debug("I should be changing");
						block.tick(level.getBlockState(worldPosition), (ServerWorld) level, worldPosition, new Random());
						
					}
				}
	       }
	}
}
