package com.gmail.rohzek.infiniores;

import com.gmail.rohzek.infiniores.blocks.InfiniOresBlocks;
import com.gmail.rohzek.infiniores.blocks.tileentity.InfiniOresTileEntities;
import com.gmail.rohzek.infiniores.items.InfiniOresItems;
import com.gmail.rohzek.infiniores.lib.Reference;
import com.gmail.rohzek.infiniores.tabs.InfiniOresTab;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MODID)
public class InfiniOres 
{
	public static final InfiniOresTab INFINI_ORES_TAB = new InfiniOresTab(Reference.MODID);
	
	public InfiniOres() 
	{
		// Register the mod
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.register(this);
		
		// Set deferred registration
		InfiniOresBlocks.register(bus);
		InfiniOresItems.register(bus);
		InfiniOresTileEntities.register(bus);
		
		
		// Register configuration file
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
	}
	
	@SubscribeEvent
	public void setup(FMLCommonSetupEvent event) {}
}
