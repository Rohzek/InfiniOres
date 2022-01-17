package com.gmail.rohzek.infiniores;

import com.gmail.rohzek.infiniores.lib.Reference;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MODID)
public class InfiniOres 
{
	/*
	@Instance(Reference.MODID)
	public static InfiniOres INSTANCE;
	
	@SidedProxy(clientSide = Reference.CLIENTSIDEPROXY, serverSide = Reference.SERVERSIDEPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent preEvent) 
	{
		LogHelper.logger = preEvent.getModLog();
		Reference.LOCATION = new File(preEvent.getModConfigurationDirectory().getAbsolutePath() + "/" + Reference.MODID);
		ConfigurationManager.Load(preEvent);
		
		Ores.registerTileEntities();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent postEvent) {}
	*/
	
	public InfiniOres() 
	{
		// Register the mod
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
		
		// Register configuration file
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
	}
	
	@SubscribeEvent
	public void setup(FMLCommonSetupEvent event) {}
}
