package com.gmail.rohzek.infiniores;

import java.io.File;

import com.gmail.rohzek.infiniores.blocks.Ores;
import com.gmail.rohzek.infiniores.lib.Reference;
import com.gmail.rohzek.infiniores.proxy.CommonProxy;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;
import com.gmail.rohzek.infiniores.util.LogHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class InfiniOres 
{
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
}
