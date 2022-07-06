package com.gmail.rohzek.infiniores.blocks;

import com.gmail.rohzek.infiniores.lib.DeferredRegistration;

import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;

public class Ores 
{
	
	
	public static final RegistryObject<DepletedOre> DEPLETED_ORE = DeferredRegistration.BLOCKS.register("depleted_ore", () -> new DepletedOre(Ores.DEPLETED_ORE.get(), 0));
	public static final RegistryObject<DepletedOre> COAL_ORE = DeferredRegistration.BLOCKS.register("depleted_ore_coal", () -> new DepletedOre(Blocks.COAL_ORE, 0));
	public static final RegistryObject<DepletedOre> DIAMOND_ORE = DeferredRegistration.BLOCKS.register("depleted_ore_diamond", () -> new DepletedOre(Blocks.DIAMOND_ORE, 2));
	public static final RegistryObject<DepletedOre> EMERALD_ORE = DeferredRegistration.BLOCKS.register("depleted_ore_emerald", () -> new DepletedOre(Blocks.EMERALD_ORE,  2));
	public static final RegistryObject<DepletedOre> IRON_ORE = DeferredRegistration.BLOCKS.register("depleted_ore_iron", () -> new DepletedOre(Blocks.IRON_ORE, 1));
	public static final RegistryObject<DepletedOre> GOLD_ORE = DeferredRegistration.BLOCKS.register("depleted_ore_gold", () -> new DepletedOre(Blocks.GOLD_ORE, 2));
	public static final RegistryObject<DepletedOre> LAPIS_ORE = DeferredRegistration.BLOCKS.register("depleted_ore_lapis", () -> new DepletedOre(Blocks.LAPIS_ORE, 1));
	public static final RegistryObject<DepletedOre> REDSTONE_ORE = DeferredRegistration.BLOCKS.register("depleted_ore_redstone", () -> new DepletedOre(Blocks.REDSTONE_ORE, 2));

	public static void register() {}
}
