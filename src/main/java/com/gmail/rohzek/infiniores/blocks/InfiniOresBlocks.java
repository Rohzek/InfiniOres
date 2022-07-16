package com.gmail.rohzek.infiniores.blocks;

import java.util.function.Supplier;

import com.gmail.rohzek.infiniores.InfiniOres;
import com.gmail.rohzek.infiniores.blocks.DepletedOre.HarvestLevel;
import com.gmail.rohzek.infiniores.items.InfiniOresItems;
import com.gmail.rohzek.infiniores.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InfiniOresBlocks 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);
	
	// Pickaxe Blocks
	public static final RegistryObject<DepletedOre> DEPLETED_STONE = registerBlock("depleted_block_stone", () -> new DepletedOre(Blocks.STONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_ANDESITE = registerBlock("depleted_block_andesite", () -> new DepletedOre(Blocks.ANDESITE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_DIORITE = registerBlock("depleted_block_diorite", () -> new DepletedOre(Blocks.DIORITE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_GRANITE = registerBlock("depleted_block_granite", () -> new DepletedOre(Blocks.GRANITE, HarvestLevel.WOOD));
	
	/**
	 * 
	 * TO DO:
	 * Fix harvest levels everything below
	 */
	public static final RegistryObject<DepletedOre> DEPLETED_HARDENED_CLAY = registerBlock("depleted_block_hardened_clay", () -> new DepletedOre(Blocks.TERRACOTTA, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_NETHERRACK = registerBlock("depleted_block_netherrack", () -> new DepletedOre(Blocks.NETHERRACK, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_MAGMA = registerBlock("depleted_block_magma", () -> new DepletedOre(Blocks.MAGMA_BLOCK, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_GLOWSTONE = registerBlock("depleted_block_glowstone", () -> new DepletedOre(Blocks.GLOWSTONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_OBSIDIAN = registerBlock("depleted_block_obsidian", () -> new DepletedOre(Blocks.OBSIDIAN, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_CRYING_OBSIDIAN = registerBlock("depleted_block_obsidian_crying", () -> new DepletedOre(Blocks.CRYING_OBSIDIAN, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_BRICKS = registerBlock("depleted_block_bricks", () -> new DepletedOre(Blocks.BRICKS, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_NETHER_BRICKS = registerBlock("depleted_block_nether_bricks", () -> new DepletedOre(Blocks.NETHER_BRICKS, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_END_STONE = registerBlock("depleted_block_end_stone", () -> new DepletedOre(Blocks.END_STONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_ICE = registerBlock("depleted_block_ice", () -> new DepletedOre(Blocks.ICE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_PACKED_ICE = registerBlock("depleted_block_packed_ice", () -> new DepletedOre(Blocks.PACKED_ICE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_SANDSTONE = registerBlock("depleted_block_sandstone", () -> new DepletedOre(Blocks.SANDSTONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_SANDSTONE_CHISELED = registerBlock("depleted_block_sandstone_chiseled", () -> new DepletedOre(Blocks.CHISELED_SANDSTONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_SANDSTONE_SMOOTH = registerBlock("depleted_block_sandstone_smooth", () -> new DepletedOre(Blocks.SMOOTH_SANDSTONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_SANDSTONE_RED = registerBlock("depleted_block_red_sandstone", () -> new DepletedOre(Blocks.RED_SANDSTONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_SANDSTONE_RED_CHISELED = registerBlock("depleted_block_red_sandstone_chiseled", () -> new DepletedOre(Blocks.CHISELED_RED_SANDSTONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_SANDSTONE_RED_SMOOTH = registerBlock("depleted_block_red_sandstone_smooth", () -> new DepletedOre(Blocks.SMOOTH_RED_SANDSTONE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_PRISMARINE = registerBlock("depleted_block_prismarine", () -> new DepletedOre(Blocks.PRISMARINE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_SEA_LANTERN = registerBlock("depleted_block_sea_lantern", () -> new DepletedOre(Blocks.SEA_LANTERN, HarvestLevel.NONE));
	public static final RegistryObject<DepletedOre> DEPLETED_PRISMARINE_BRICKS = registerBlock("depleted_block_prismarine_bricks", () -> new DepletedOre(Blocks.PRISMARINE_BRICKS, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_DARK_PRISMARINE = registerBlock("depleted_block_dark_prismarine", () -> new DepletedOre(Blocks.DARK_PRISMARINE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_PURPUR = registerBlock("depleted_block_purpur", () -> new DepletedOre(Blocks.PURPUR_BLOCK, HarvestLevel.WOOD));
	
	
	// Shovel Blocks
	public static final RegistryObject<DepletedSand> DEPLETED_SAND = registerBlock("depleted_block_sand", () -> new DepletedSand(Blocks.SAND));
	public static final RegistryObject<DepletedSand> DEPLETED_RED_SAND = registerBlock("depleted_block_red_sand", () -> new DepletedSand(Blocks.RED_SAND));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_GRAVEL = registerBlock("depleted_block_gravel", () -> new DepletedShovelBlock(Blocks.GRAVEL));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_SOUL_SAND = registerBlock("depleted_block_soul_sand", () -> new DepletedShovelBlock(Blocks.SOUL_SAND));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_GRASS = registerBlock("depleted_block_grass", () -> new DepletedShovelBlock(Blocks.GRASS_BLOCK));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_DIRT = registerBlock("depleted_block_dirt", () -> new DepletedShovelBlock(Blocks.DIRT));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_COARSE_DIRT = registerBlock("depleted_block_coarse_dirt", () -> new DepletedShovelBlock(Blocks.COARSE_DIRT));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_PODZOL = registerBlock("depleted_block_podzol", () -> new DepletedShovelBlock(Blocks.PODZOL));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_MYCELIUM = registerBlock("depleted_block_mycelium", () -> new DepletedShovelBlock(Blocks.MYCELIUM));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_SNOW = registerBlock("depleted_block_snow", () -> new DepletedShovelBlock(Blocks.SNOW_BLOCK));
	public static final RegistryObject<DepletedShovelBlock> DEPLETED_CLAY = registerBlock("depleted_block_clay", () -> new DepletedShovelBlock(Blocks.CLAY));
	
	// Ores
	public static final RegistryObject<DepletedOre> COAL_ORE = registerBlock("depleted_ore_coal", () -> new DepletedOre(Blocks.COAL_ORE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DIAMOND_ORE = registerBlock("depleted_ore_diamond", () -> new DepletedOre(Blocks.DIAMOND_ORE, HarvestLevel.IRON));
	public static final RegistryObject<DepletedOre> EMERALD_ORE = registerBlock("depleted_ore_emerald", () -> new DepletedOre(Blocks.EMERALD_ORE,  HarvestLevel.IRON));
	public static final RegistryObject<DepletedOre> IRON_ORE = registerBlock("depleted_ore_iron", () -> new DepletedOre(Blocks.IRON_ORE, HarvestLevel.STONE));
	public static final RegistryObject<DepletedOre> GOLD_ORE = registerBlock("depleted_ore_gold", () -> new DepletedOre(Blocks.GOLD_ORE, HarvestLevel.IRON));
	public static final RegistryObject<DepletedOre> LAPIS_ORE = registerBlock("depleted_ore_lapis", () -> new DepletedOre(Blocks.LAPIS_ORE, HarvestLevel.STONE));
	public static final RegistryObject<DepletedOre> REDSTONE_ORE = registerBlock("depleted_ore_redstone", () -> new DepletedOre(Blocks.REDSTONE_ORE, HarvestLevel.IRON));
	public static final RegistryObject<DepletedOre> DEPLETED_NETHER_QUARTZ = registerBlock("depleted_block_quartz", () -> new DepletedOre(Blocks.NETHER_QUARTZ_ORE, HarvestLevel.WOOD));

	// Fix these mining levels
	public static final RegistryObject<DepletedOre> DEPLETED_NETHER_GOLD_ORE = registerBlock("depleted_ore_nether_gold", () -> new DepletedOre(Blocks.NETHER_GOLD_ORE, HarvestLevel.WOOD));
	public static final RegistryObject<DepletedOre> DEPLETED_ANCIENT_DEBRIS = registerBlock("depleted_ore_ancient_debris", () -> new DepletedOre(Blocks.ANCIENT_DEBRIS, HarvestLevel.WOOD));
	
	// Logs
	// Oak
	public static final RegistryObject<DepletedLog> OAK_LOG = registerBlock("depleted_log_oak", () -> new DepletedLog(Blocks.OAK_LOG));
	public static final RegistryObject<DepletedLog> OAK_LOG_STRIPPED = registerBlock("depleted_log_oak_stripped", () -> new DepletedLog(Blocks.STRIPPED_OAK_LOG));
	public static final RegistryObject<DepletedLog> OAK_WOOD = registerBlock("depleted_wood_oak", () -> new DepletedLog(Blocks.OAK_WOOD));
	public static final RegistryObject<DepletedLog> OAK_WOOD_STRIPPED = registerBlock("depleted_wood_oak_stripped", () -> new DepletedLog(Blocks.STRIPPED_OAK_WOOD));
	
	// Spruce
	public static final RegistryObject<DepletedLog> SPRUCE_LOG = registerBlock("depleted_log_spruce", () -> new DepletedLog(Blocks.SPRUCE_LOG));
	public static final RegistryObject<DepletedLog> SPRUCE_LOG_STRIPPED = registerBlock("depleted_log_spruce_stripped", () -> new DepletedLog(Blocks.STRIPPED_SPRUCE_LOG));
	public static final RegistryObject<DepletedLog> SPRUCE_WOOD = registerBlock("depleted_wood_spruce", () -> new DepletedLog(Blocks.SPRUCE_WOOD));
	public static final RegistryObject<DepletedLog> SPRUCE_WOOD_STRIPPED = registerBlock("depleted_wood_spruce_stripped", () -> new DepletedLog(Blocks.STRIPPED_SPRUCE_WOOD));
	
	// Birch
	public static final RegistryObject<DepletedLog> BIRCH_LOG = registerBlock("depleted_log_birch", () -> new DepletedLog(Blocks.BIRCH_LOG));
	public static final RegistryObject<DepletedLog> BIRCH_LOG_STRIPPED = registerBlock("depleted_log_birch_stripped", () -> new DepletedLog(Blocks.STRIPPED_BIRCH_LOG));
	public static final RegistryObject<DepletedLog> BIRCH_WOOD = registerBlock("depleted_wood_birch", () -> new DepletedLog(Blocks.BIRCH_WOOD));
	public static final RegistryObject<DepletedLog> BIRCH_WOOD_STRIPPED = registerBlock("depleted_wood_birch_stripped", () -> new DepletedLog(Blocks.STRIPPED_BIRCH_WOOD));
	
	// Jungle
	public static final RegistryObject<DepletedLog> JUNGLE_LOG = registerBlock("depleted_log_jungle", () -> new DepletedLog(Blocks.JUNGLE_LOG));
	public static final RegistryObject<DepletedLog> JUNGLE_LOG_STRIPPED = registerBlock("depleted_log_jungle_stripped", () -> new DepletedLog(Blocks.STRIPPED_JUNGLE_LOG));
	public static final RegistryObject<DepletedLog> JUNGLE_WOOD = registerBlock("depleted_wood_jungle", () -> new DepletedLog(Blocks.JUNGLE_WOOD));
	public static final RegistryObject<DepletedLog> JUNGLE_WOOD_STRIPPED = registerBlock("depleted_wood_jungle_stripped", () -> new DepletedLog(Blocks.STRIPPED_JUNGLE_WOOD));
	
	// Acacia
	public static final RegistryObject<DepletedLog> ACACIA_LOG = registerBlock("depleted_log_acacia", () -> new DepletedLog(Blocks.ACACIA_LOG));
	public static final RegistryObject<DepletedLog> ACACIA_LOG_STRIPPED = registerBlock("depleted_log_acacia_stripped", () -> new DepletedLog(Blocks.STRIPPED_ACACIA_LOG));
	public static final RegistryObject<DepletedLog> ACACIA_WOOD = registerBlock("depleted_wood_acacia", () -> new DepletedLog(Blocks.ACACIA_WOOD));
	public static final RegistryObject<DepletedLog> ACACIA_WOOD_STRIPPED = registerBlock("depleted_wood_acacia_stripped", () -> new DepletedLog(Blocks.STRIPPED_ACACIA_WOOD));
	
	// Dark Oak
	public static final RegistryObject<DepletedLog> DARK_OAK_LOG = registerBlock("depleted_log_dark_oak", () -> new DepletedLog(Blocks.DARK_OAK_LOG));
	public static final RegistryObject<DepletedLog> DARK_OAK_LOG_STRIPPED = registerBlock("depleted_log_dark_oak_stripped", () -> new DepletedLog(Blocks.STRIPPED_DARK_OAK_LOG));
	public static final RegistryObject<DepletedLog> DARK_OAK_WOOD = registerBlock("depleted_wood_dark_oak", () -> new DepletedLog(Blocks.DARK_OAK_WOOD));
	public static final RegistryObject<DepletedLog> DARK_OAK_WOOD_STRIPPED = registerBlock("depleted_wood_dark_oak_stripped", () -> new DepletedLog(Blocks.STRIPPED_DARK_OAK_WOOD));
	
	// Crimson
	public static final RegistryObject<DepletedLog> CRIMSON_LOG = registerBlock("depleted_log_crimson", () -> new DepletedLog(Blocks.CRIMSON_STEM));
	public static final RegistryObject<DepletedLog> CRIMSON_LOG_STRIPPED = registerBlock("depleted_log_crimson_stripped", () -> new DepletedLog(Blocks.STRIPPED_CRIMSON_STEM));
	public static final RegistryObject<DepletedLog> CRIMSON_WOOD = registerBlock("depleted_wood_crimson", () -> new DepletedLog(Blocks.CRIMSON_HYPHAE));
	public static final RegistryObject<DepletedLog> CRIMSON_WOOD_STRIPPED = registerBlock("depleted_wood_crimson_stripped", () -> new DepletedLog(Blocks.STRIPPED_CRIMSON_HYPHAE));
	
	// Warped
	public static final RegistryObject<DepletedLog> WARPED_LOG = registerBlock("depleted_log_warped", () -> new DepletedLog(Blocks.WARPED_STEM));
	public static final RegistryObject<DepletedLog> WARPED_LOG_STRIPPED = registerBlock("depleted_log_warped_stripped", () -> new DepletedLog(Blocks.STRIPPED_WARPED_STEM));
	public static final RegistryObject<DepletedLog> WARPED_WOOD = registerBlock("depleted_wood_warped", () -> new DepletedLog(Blocks.WARPED_HYPHAE));
	public static final RegistryObject<DepletedLog> WARPED_WOOD_STRIPPED = registerBlock("depleted_wood_warped_stripped", () -> new DepletedLog(Blocks.STRIPPED_WARPED_HYPHAE));
	
	public static void register(IEventBus bus) 
	{
		BLOCKS.register(bus);
	}
	
	private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) 
	{
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) 
    {
        InfiniOresItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(InfiniOres.INFINI_ORES_TAB)));
    }
}
