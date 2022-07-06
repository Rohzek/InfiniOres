package com.gmail.rohzek.infiniores.lib;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DeferredRegistration 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Reference.MODID);
	
	//public static final DeferredRegister<TileEntityType<TileEntityOre>> ORE_TILE_ENTITIES = TILE_ENTITIES.register("tile_entity_ore", () -> TileEntityType.Builder.build(TileEntityOre::new, Ores.DEPLETED_ORE.get());
	
	public static void register(IEventBus bus) 
	{	
		BLOCKS.register(bus);
		TILE_ENTITIES.register(bus);
	}
}
