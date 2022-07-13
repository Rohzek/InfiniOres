package com.gmail.rohzek.infiniores.blocks.tileentity;

import java.util.Random;

import com.gmail.rohzek.infiniores.blocks.DepletedOre;
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

public class TileEntityOre extends TileEntity implements ITickableTileEntity
{
	private static Random random = new Random();
	
	private int timer = 30;
	private int chance = 100;
	
	public TileEntityOre() 
	{
		super(InfiniOresTileEntities.ORE_TILE_ENTITY.get());
	}
	
	public TileEntityOre(TileEntityType<?> tileEntity, DepletedOre ore) 
	{
		super(tileEntity);
		
		// Blocks
		if(ore == InfiniOresBlocks.DEPLETED_STONE.get())
		{
			timer = ConfigurationManager.GENERAL.stone_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.stone_block_life_time.get()) : ConfigurationManager.GENERAL.stone_block_life_time.get();
			ore.regenerate = ConfigurationManager.GENERAL.stone_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.stone_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.stone_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.stone_block_replacement.get().get(0)));
		}
		
		// Ores
		if(ore == InfiniOresBlocks.COAL_ORE.get())
		{
			timer = ConfigurationManager.GENERAL.coal_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.coal_block_life_time.get()) : ConfigurationManager.GENERAL.coal_block_life_time.get();
			ore.regenerate = ConfigurationManager.GENERAL.coal_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.coal_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.coal_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.coal_block_replacement.get().get(0)));
		}
		
		if(ore == InfiniOresBlocks.DIAMOND_ORE.get()) 
		{
			timer = ConfigurationManager.GENERAL.diamond_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.diamond_block_life_time.get()) : ConfigurationManager.GENERAL.diamond_block_life_time.get();		
			ore.regenerate = ConfigurationManager.GENERAL.diamond_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.diamond_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.diamond_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.diamond_block_replacement.get().get(0)));
		}
		
		if(ore == InfiniOresBlocks.EMERALD_ORE.get()) 
		{
			timer = ConfigurationManager.GENERAL.emerald_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.emerald_block_life_time.get()) : ConfigurationManager.GENERAL.emerald_block_life_time.get();
			ore.regenerate = ConfigurationManager.GENERAL.emerald_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.emerald_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.emerald_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.emerald_block_replacement.get().get(0)));
		}
		
		if(ore == InfiniOresBlocks.GOLD_ORE.get()) 
		{
			timer = ConfigurationManager.GENERAL.gold_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.gold_block_life_time.get()) : ConfigurationManager.GENERAL.gold_block_life_time.get();
			ore.regenerate = ConfigurationManager.GENERAL.gold_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.gold_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.gold_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.gold_block_replacement.get().get(0)));	
		}
		
		if(ore == InfiniOresBlocks.IRON_ORE.get()) 
		{
			timer = ConfigurationManager.GENERAL.iron_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.iron_block_life_time.get()) : ConfigurationManager.GENERAL.iron_block_life_time.get();
			ore.regenerate = ConfigurationManager.GENERAL.iron_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.iron_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.iron_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.iron_block_replacement.get().get(0)));
		}
		
		if(ore == InfiniOresBlocks.LAPIS_ORE.get()) 
		{
			timer = ConfigurationManager.GENERAL.lapis_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.lapis_block_life_time.get()) : ConfigurationManager.GENERAL.lapis_block_life_time.get();
			ore.regenerate = ConfigurationManager.GENERAL.lapis_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.lapis_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.lapis_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.lapis_block_replacement.get().get(0)));
		}
		
		if(ore == InfiniOresBlocks.REDSTONE_ORE.get()) 
		{
			timer = ConfigurationManager.GENERAL.redstone_block_life_time_randomized.get() ? random.nextInt((int) ConfigurationManager.GENERAL.redstone_block_life_time.get()) : ConfigurationManager.GENERAL.redstone_block_life_time.get();
			ore.regenerate = ConfigurationManager.GENERAL.redstone_block_randomized_replacement.get() ? ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.redstone_block_replacement.get().get(random.nextInt(ConfigurationManager.GENERAL.redstone_block_replacement.get().size())))) : ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ConfigurationManager.GENERAL.redstone_block_replacement.get().get(0)));
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
