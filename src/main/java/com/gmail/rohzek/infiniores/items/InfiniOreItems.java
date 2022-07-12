package com.gmail.rohzek.infiniores.items;

import com.gmail.rohzek.infiniores.lib.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InfiniOreItems 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);
	
	public static void register(IEventBus bus) 
	{
		ITEMS.register(bus);
	}
}
