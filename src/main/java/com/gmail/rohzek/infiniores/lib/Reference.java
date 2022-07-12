package com.gmail.rohzek.infiniores.lib;

import java.io.File;

public class Reference 
{
	// Our Unique Mod ID
	public static final String MODID = "infiniores";
	
	// Just like MODID but with : attached to save time while assigning resource locations
	public static final String RESOURCEID = MODID + ":";
	
	// Human readable title
	public static final String NAME = "InfiniOres";
		
	// Mods to load after
	public static final String DEPENDENCIES = "after:;";
	
	// Folder holding config data
	public static File LOCATION; 
	
	// We only have to change it here... MCMOD.info is gone and the ModData is hardcoded to check here
	public static final String VERSION = "0.0.1";
}
