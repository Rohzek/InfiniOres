package com.gmail.rohzek.infiniores.blocks;

import java.util.function.Supplier;

import com.gmail.rohzek.infiniores.InfiniOres;
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
	
	
	public static final RegistryObject<DepletedOre> DEPLETED_ORE = registerBlock("depleted_ore", () -> new DepletedOre(Blocks.COBBLESTONE, 0));
	public static final RegistryObject<DepletedOre> COAL_ORE = registerBlock("depleted_ore_coal", () -> new DepletedOre(Blocks.COAL_ORE, 0));
	public static final RegistryObject<DepletedOre> DIAMOND_ORE = registerBlock("depleted_ore_diamond", () -> new DepletedOre(Blocks.DIAMOND_ORE, 2));
	public static final RegistryObject<DepletedOre> EMERALD_ORE = registerBlock("depleted_ore_emerald", () -> new DepletedOre(Blocks.EMERALD_ORE,  2));
	public static final RegistryObject<DepletedOre> IRON_ORE = registerBlock("depleted_ore_iron", () -> new DepletedOre(Blocks.IRON_ORE, 1));
	public static final RegistryObject<DepletedOre> GOLD_ORE = registerBlock("depleted_ore_gold", () -> new DepletedOre(Blocks.GOLD_ORE, 2));
	public static final RegistryObject<DepletedOre> LAPIS_ORE = registerBlock("depleted_ore_lapis", () -> new DepletedOre(Blocks.LAPIS_ORE, 1));
	public static final RegistryObject<DepletedOre> REDSTONE_ORE = registerBlock("depleted_ore_redstone", () -> new DepletedOre(Blocks.REDSTONE_ORE, 2));

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
