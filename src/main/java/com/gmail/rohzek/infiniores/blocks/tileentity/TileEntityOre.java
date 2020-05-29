package com.gmail.rohzek.infiniores.blocks.tileentity;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityOre extends TileEntity implements ITickable
{
	public int timer;
	
	public TileEntityOre() 
	{
		timer = 60;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		this.timer = compound.getInteger("timer");
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) 
	{
		compound.setInteger("timer", timer);
		return super.writeToNBT(compound);
	}

	@Override
	public void update() 
	{
		if(this.timer > 0) 
		{
			this.timer--;
		}
		else 
		{
			Block block = world.getBlockState(this.getPos()).getBlock();
			block.updateTick(world, pos, world.getBlockState(pos), new Random());
		}
	}
}
