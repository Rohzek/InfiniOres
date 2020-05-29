package com.gmail.rohzek.infiniores.blocks;

import java.util.Random;

import com.gmail.rohzek.infiniores.blocks.tileentity.TileEntityOre;
import com.gmail.rohzek.infiniores.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DepletedOre extends Block
{
	Block regenerate;
	
	public DepletedOre(Block block, String name, int level) 
	{
		super(Material.ROCK);
		
		setHardness(3f);
		setHarvestLevel("pickaxe", level);
		
		this.setCreativeTab(CreativeTabs.FOOD);
		regenerate = block;
		setNames(name);
	}
	
	private void setNames(String name) 
	{
		setRegistryName(Reference.MODID, name);
		setUnlocalizedName(name);
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {       
        if (!world.isRemote)
        {
        	world.setBlockState(pos, regenerate.getDefaultState());
        }
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(Blocks.STONE);
	}
	
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 
	{
		super.onBlockPlacedBy(world, pos, state, placer, stack);
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) 
	{
		return new TileEntityOre();
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) 
	{
		return true;
	}
}
