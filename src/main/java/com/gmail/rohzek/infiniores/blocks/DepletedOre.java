package com.gmail.rohzek.infiniores.blocks;

import java.util.Random;

import com.gmail.rohzek.infiniores.blocks.tileentity.TileEntityOre;
import com.sun.jna.platform.win32.Netapi32Util.Group;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

public class DepletedOre extends Block
{
	public Block regenerate;
	public String name;
	public int level;
	
	public DepletedOre(Block block, int level) 
	{
		super(Properties.of(Material.STONE));

		this.level = level;
		
		//setCreativeTab();
		
		regenerate = block;
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state) 
	{
		return ToolType.PICKAXE;
	}
	
	@Override
	public int getHarvestLevel(BlockState state) 
	{
		return this.level;
	}
	
	@Override
	public void tick(BlockState state, ServerWorld world, BlockPos pos, Random rand) 
	{
		if (!world.isClientSide)
        {
        	if(!(this == Ores.DEPLETED_ORE.get())) 
        	{
        		//world.setBlockState(pos, regenerate.defaultBlockState());
        		world.setBlockAndUpdate(pos, regenerate.defaultBlockState());
        	}
        	
        }
	}
	
	@Override
	public Item asItem() 
	{
		//return Item.getItemFromBlock(Blocks.COBBLESTONE);
		return Blocks.COBBLESTONE.asItem();
	}
	
	@Override
	public void setPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
	{
		super.setPlacedBy(world, pos, state, placer, stack);
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) 
	{
		return new TileEntityOre(null, this);
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) 
	{
		return true;
	}
}
