package com.gmail.rohzek.infiniores.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.gmail.rohzek.infiniores.blocks.DepletedOre;
import com.gmail.rohzek.infiniores.lib.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigurationManager
{
	public static File optionsLoc;
	
	public static boolean isDebug;
	
	public static List<DepletedOre> ORES = new ArrayList<DepletedOre>();
	
	public static String genCategory = "general";
	public static String debugCategory = "debug";
	public static String modCategory = "compatibility";
	public static String ovrCategory = "overrides";
	
	public static void Load(FMLPreInitializationEvent event) 
	{
		optionsLoc = new File(Reference.LOCATION + "/" + Reference.MODID + ".cfg");
		Configuration optionsConfig = new Configuration(optionsLoc);
		Options(optionsConfig);
	}
	
	private static void Options(Configuration config)
	{
		config.load();
		
		isDebug = config.get(debugCategory, "debugMode", false, "Enables more printouts to the chat. WARNING: Will spam the log file. Good for bug reports. Not recommended for regular play.").getBoolean(false);
		
		config.save();
	}
}
