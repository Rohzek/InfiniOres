package com.gmail.rohzek.infiniores.blocks.tileentity;

import com.gmail.rohzek.infiniores.blocks.InfiniOresBlocks;
import com.gmail.rohzek.infiniores.lib.Reference;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InfiniOresTileEntities 
{
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Reference.MODID);
	public static RegistryObject<TileEntityType<TileEntityOre>> ORE_TILE_ENTITY = TILE_ENTITIES.register("ore_tile_entity", () -> TileEntityType.Builder.of
			(TileEntityOre::new,
					// Blocks
					InfiniOresBlocks.DEPLETED_STONE.get(),
					
					// Ores
					InfiniOresBlocks.COAL_ORE.get(), 
					InfiniOresBlocks.DIAMOND_ORE.get(), 
					InfiniOresBlocks.EMERALD_ORE.get(), 
					InfiniOresBlocks.IRON_ORE.get(), 
					InfiniOresBlocks.GOLD_ORE.get(), 
					InfiniOresBlocks.LAPIS_ORE.get(), 
					InfiniOresBlocks.REDSTONE_ORE.get()
			).build(null));
	
	public static RegistryObject<TileEntityType<TileEntityLog>> LOG_TILE_ENTITY = TILE_ENTITIES.register("log_tile_entity", () -> TileEntityType.Builder.of
			(TileEntityLog::new,
					// Logs
					InfiniOresBlocks.OAK_LOG.get(),
					InfiniOresBlocks.OAK_WOOD.get()
			).build(null));
	
	public static void register(IEventBus bus) 
	{
		TILE_ENTITIES.register(bus);
	}
}
