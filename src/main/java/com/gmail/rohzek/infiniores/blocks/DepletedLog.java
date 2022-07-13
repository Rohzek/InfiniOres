package com.gmail.rohzek.infiniores.blocks;

import java.util.Random;

import com.gmail.rohzek.infiniores.blocks.tileentity.TileEntityOre;
import com.gmail.rohzek.infiniores.util.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

public class DepletedLog extends Block
{
	public Block regenerate;
	
	public DepletedLog(Block block) 
	{
		super(Properties.of(Material.WOOD).harvestTool(ToolType.PICKAXE).strength(2f, 2f));
	}
	
	@Override
	public void tick(BlockState state, ServerWorld world, BlockPos pos, Random rand) 
	{
		if (!world.isClientSide)
        {
			LogHelper.debug("I should be ticking!");
			
			world.setBlockAndUpdate(pos, regenerate.defaultBlockState());
			
    		LogHelper.debug("I sholuld be setting " + this.getBlock().getName() + " to " + regenerate.getName());
        }
	}
	
	@Override
	public void setPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
	{
		super.setPlacedBy(world, pos, state, placer, stack);
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) 
	{
		return new TileEntityOre();
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) 
	{
		return true;
	}
}
