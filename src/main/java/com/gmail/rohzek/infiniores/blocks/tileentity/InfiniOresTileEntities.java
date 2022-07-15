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
					InfiniOresBlocks.DEPLETED_ANDESITE.get(),
					InfiniOresBlocks.DEPLETED_DIORITE.get(),
					InfiniOresBlocks.DEPLETED_GRANITE.get(),
					InfiniOresBlocks.DEPLETED_HARDENED_CLAY.get(),
					InfiniOresBlocks.DEPLETED_NETHERRACK.get(),
					InfiniOresBlocks.DEPLETED_MAGMA.get(),
					InfiniOresBlocks.DEPLETED_GLOWSTONE.get(),
					InfiniOresBlocks.DEPLETED_OBSIDIAN.get(),
					InfiniOresBlocks.DEPLETED_CRYING_OBSIDIAN.get(),
					InfiniOresBlocks.DEPLETED_BRICKS.get(),
					InfiniOresBlocks.DEPLETED_NETHER_BRICKS.get(),
					InfiniOresBlocks.DEPLETED_END_STONE.get(),
					InfiniOresBlocks.DEPLETED_ICE.get(),
					InfiniOresBlocks.DEPLETED_PACKED_ICE.get(),
					InfiniOresBlocks.DEPLETED_SANDSTONE.get(),
					InfiniOresBlocks.DEPLETED_SANDSTONE_CHISELED.get(),
					InfiniOresBlocks.DEPLETED_SANDSTONE_SMOOTH.get(),
					InfiniOresBlocks.DEPLETED_SANDSTONE_RED.get(),
					InfiniOresBlocks.DEPLETED_SANDSTONE_RED_CHISELED.get(),
					InfiniOresBlocks.DEPLETED_SANDSTONE_RED_SMOOTH.get(),
					
					// Ores
					InfiniOresBlocks.COAL_ORE.get(), 
					InfiniOresBlocks.DIAMOND_ORE.get(), 
					InfiniOresBlocks.EMERALD_ORE.get(), 
					InfiniOresBlocks.IRON_ORE.get(), 
					InfiniOresBlocks.GOLD_ORE.get(), 
					InfiniOresBlocks.LAPIS_ORE.get(), 
					InfiniOresBlocks.REDSTONE_ORE.get(),
					InfiniOresBlocks.DEPLETED_NETHER_QUARTZ.get()
			).build(null));
	
	public static RegistryObject<TileEntityType<TileEntityLog>> LOG_TILE_ENTITY = TILE_ENTITIES.register("log_tile_entity", () -> TileEntityType.Builder.of
			(TileEntityLog::new,
					// Logs
					// Oak
					InfiniOresBlocks.OAK_LOG.get(),
					InfiniOresBlocks.OAK_LOG_STRIPPED.get(),
					InfiniOresBlocks.OAK_WOOD.get(),
					InfiniOresBlocks.OAK_WOOD_STRIPPED.get(),
					
					// Spruce
					InfiniOresBlocks.SPRUCE_LOG.get(),
					InfiniOresBlocks.SPRUCE_LOG_STRIPPED.get(),
					InfiniOresBlocks.SPRUCE_WOOD.get(),
					InfiniOresBlocks.SPRUCE_WOOD_STRIPPED.get(),
					
					// Birch
					InfiniOresBlocks.BIRCH_LOG.get(),
					InfiniOresBlocks.BIRCH_LOG_STRIPPED.get(),
					InfiniOresBlocks.BIRCH_WOOD.get(),
					InfiniOresBlocks.BIRCH_WOOD_STRIPPED.get(),
					
					// Jungle
					InfiniOresBlocks.JUNGLE_LOG.get(),
					InfiniOresBlocks.JUNGLE_LOG_STRIPPED.get(),
					InfiniOresBlocks.JUNGLE_WOOD.get(),
					InfiniOresBlocks.JUNGLE_WOOD_STRIPPED.get(),
					
					// Acacia
					InfiniOresBlocks.ACACIA_LOG.get(),
					InfiniOresBlocks.ACACIA_LOG_STRIPPED.get(),
					InfiniOresBlocks.ACACIA_WOOD.get(),
					InfiniOresBlocks.ACACIA_WOOD_STRIPPED.get(),
					
					// Dark Oak
					InfiniOresBlocks.DARK_OAK_LOG.get(),
					InfiniOresBlocks.DARK_OAK_LOG_STRIPPED.get(),
					InfiniOresBlocks.DARK_OAK_WOOD.get(),
					InfiniOresBlocks.DARK_OAK_WOOD_STRIPPED.get(),
					
					// Crimson
					InfiniOresBlocks.CRIMSON_LOG.get(),
					InfiniOresBlocks.CRIMSON_LOG_STRIPPED.get(),
					InfiniOresBlocks.CRIMSON_WOOD.get(),
					InfiniOresBlocks.CRIMSON_WOOD_STRIPPED.get(),
					
					// Warped
					InfiniOresBlocks.WARPED_LOG.get(),
					InfiniOresBlocks.WARPED_LOG_STRIPPED.get(),
					InfiniOresBlocks.WARPED_WOOD.get(),
					InfiniOresBlocks.WARPED_WOOD_STRIPPED.get()
			).build(null));
	
	public static void register(IEventBus bus) 
	{
		TILE_ENTITIES.register(bus);
	}
}
