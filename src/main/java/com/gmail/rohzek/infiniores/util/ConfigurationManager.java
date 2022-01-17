package com.gmail.rohzek.infiniores.util;

import java.util.ArrayList;
import java.util.List;

import com.gmail.rohzek.infiniores.blocks.DepletedOre;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigurationManager
{
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);
    public static final ForgeConfigSpec spec = BUILDER.build();
    
    public static class General 
    {
    	public final ForgeConfigSpec.ConfigValue<Boolean> isDebug;
    	
    	// Coal Block
    	public final ForgeConfigSpec.ConfigValue<String> coal_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<String[]> coal_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> coal_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Long> coal_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> coal_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> coal_block_chance;
    	
    	// Diamond Block
    	public final ForgeConfigSpec.ConfigValue<String> diamond_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<String[]> diamond_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> diamond_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Long> diamond_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> diamond_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> diamond_block_chance;
    	
    	// Emerald Block
    	public final ForgeConfigSpec.ConfigValue<String> emerald_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<String[]> emerald_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> emerald_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Long> emerald_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> emerald_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> emerald_block_chance;
    	
    	// Gold Block
    	public final ForgeConfigSpec.ConfigValue<String> gold_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<String[]> gold_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> gold_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Long> gold_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> gold_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> gold_block_chance;
    	
    	// Iron Block
    	public final ForgeConfigSpec.ConfigValue<String> iron_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<String[]> iron_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> iron_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Long> iron_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> iron_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> iron_block_chance;
    	
    	// Lapis Block
    	public final ForgeConfigSpec.ConfigValue<String> lapis_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<String[]> lapis_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> lapis_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Long> lapis_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> lapis_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> lapis_block_chance;
    	
    	// Redstone Block
    	public final ForgeConfigSpec.ConfigValue<String> redstone_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<String[]> redstone_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> redstone_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Long> redstone_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> redstone_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> redstone_block_chance;
    	
    	public static List<DepletedOre> ORES = new ArrayList<DepletedOre>();

        public General(ForgeConfigSpec.Builder builder)
        {
            builder.push("General");
            
            isDebug = builder
                    .comment("Enables/Disables debug mode (SPAMS LOGS! Is for detailed bug reports; You probably don't want this for normal play) [false/true|default:false]")
                    .translation("debugmode.simpledivegear.config")
                    .define("isDebug", false);
            
            builder.pop();
        }
    }
    
	/*
	public static File optionsLoc;
	
	public static boolean isDebug;
	
	// coal ore block
	public static String coal_block_spawn;
	public static String[] coal_block_replacement;
	public static boolean coal_block_randomized_replacement;
	public static long coal_block_life_time;
	public static boolean coal_block_life_time_randomized;
	public static int coal_block_chance;
	
	// diamond ore block
	public static String diamond_block_spawn;
	public static String[] diamond_block_replacement;
	public static boolean diamond_block_randomized_replacement;
	public static long diamond_block_life_time;
	public static boolean diamond_block_life_time_randomized;
	public static int diamond_block_chance;
	
	// emerald ore block
	public static String emerald_block_spawn;
	public static String[] emerald_block_replacement;
	public static boolean emerald_block_randomized_replacement;
	public static long emerald_block_life_time;
	public static boolean emerald_block_life_time_randomized;
	public static int emerald_block_chance;
	
	// gold ore block
	public static String gold_block_spawn;
	public static String[] gold_block_replacement;
	public static boolean gold_block_randomized_replacement;
	public static long gold_block_life_time;
	public static boolean gold_block_life_time_randomized;
	public static int gold_block_chance;
	
	// iron ore block
	public static String iron_block_spawn;
	public static String[] iron_block_replacement;
	public static boolean iron_block_randomized_replacement;
	public static long iron_block_life_time;
	public static boolean iron_block_life_time_randomized;
	public static int iron_block_chance;
	
	// lapis ore block
	public static String lapis_block_spawn;
	public static String[] lapis_block_replacement;
	public static boolean lapis_block_randomized_replacement;
	public static long lapis_block_life_time;
	public static boolean lapis_block_life_time_randomized;
	public static int lapis_block_chance;
	
	// redstone ore block
	public static String redstone_block_spawn;
	public static String[] redstone_block_replacement;
	public static boolean redstone_block_randomized_replacement;
	public static long redstone_block_life_time;
	public static boolean redstone_block_life_time_randomized;
	public static int redstone_block_chance;
	
	public static List<DepletedOre> ORES = new ArrayList<DepletedOre>();
	
	public static String genCategory = "general";
	public static String debugCategory = "debug";
	
	public static String coalCategory = "depleted_coal_block";
	public static String diamondCategory = "depleted_diamond_block";
	public static String emeraldCategory = "depleted_emerald_block";
	public static String goldCategory = "depleted_gold_block";
	public static String ironCategory = "depleted_iron_block";
	public static String lapisCategory = "depleted_lapis_block";
	public static String redstoneCategory = "depleted_redstone_block";
	
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
		
		// coal ore block
		coal_block_spawn = config.getString("coal_block_spawn", coalCategory, "minecraft:coal_ore", "");
		coal_block_replacement = config.getStringList("coal_block_replacement", coalCategory, new String[] {"minecraft:coal_ore"}, "");
		coal_block_randomized_replacement = config.getBoolean("coal_block_randomized_replacement", coalCategory, false, "");
		coal_block_life_time = config.getInt("coal_block_life_time", coalCategory, 12000, 1, (Integer.MAX_VALUE - 1), "");
		coal_block_life_time_randomized = config.getBoolean("coal_block_life_time_randomized", coalCategory, false, "");
		coal_block_chance = config.getInt("coal_block_chance", coalCategory, 100, 0, 100, "");
		
		// diamond ore block
		diamond_block_spawn = config.getString("diamond_block_spawn", diamondCategory, "minecraft:diamond_ore", "");
		diamond_block_replacement = config.getStringList("diamond_block_replacement", diamondCategory, new String[] {"minecraft:diamond_ore"}, "");
		diamond_block_randomized_replacement = config.getBoolean("diamond_block_randomized_replacement", diamondCategory, false, "");
		diamond_block_life_time = config.getInt("diamond_block_life_time", diamondCategory, 48000, 1, (Integer.MAX_VALUE - 1), "");
		diamond_block_life_time_randomized = config.getBoolean("diamond_block_life_time_randomized", diamondCategory, false, "");
		diamond_block_chance = config.getInt("diamond_block_chance", diamondCategory, 100, 0, 100, "");
		
		// emerald ore block
		emerald_block_spawn = config.getString("emerald_block_spawn", emeraldCategory, "minecraft:emerald_ore", "");
		emerald_block_replacement = config.getStringList("emerald_block_replacement", emeraldCategory, new String[] {"minecraft:emerald_ore"}, "");
		emerald_block_randomized_replacement = config.getBoolean("emerald_block_randomized_replacement", emeraldCategory, false, "");
		emerald_block_life_time = config.getInt("emerald_block_life_time", emeraldCategory, 48000, 1, (Integer.MAX_VALUE - 1), "");
		emerald_block_life_time_randomized = config.getBoolean("emerald_block_life_time_randomized", emeraldCategory, false, "");
		emerald_block_chance = config.getInt("emerald_block_chance", emeraldCategory, 100, 0, 100, "");
		
		// gold ore block
		gold_block_spawn = config.getString("gold_block_spawn", goldCategory, "minecraft:gold_ore", "");
		gold_block_replacement = config.getStringList("gold_block_replacement", goldCategory, new String[] {"minecraft:gold_ore"}, "");
		gold_block_randomized_replacement = config.getBoolean("gold_block_randomized_replacement", goldCategory, false, "");
		gold_block_life_time = config.getInt("gold_block_life_time", goldCategory, 24000, 1, (Integer.MAX_VALUE - 1), "");
		gold_block_life_time_randomized = config.getBoolean("gold_block_life_time_randomized", goldCategory, false, "");
		gold_block_chance = config.getInt("gold_block_chance", goldCategory, 100, 0, 100, "");
		
		// iron ore block
		iron_block_spawn = config.getString("iron_block_spawn", ironCategory, "minecraft:iron_ore", "");
		iron_block_replacement = config.getStringList("iron_block_replacement", ironCategory, new String[] {"minecraft:iron_ore"}, "");
		iron_block_randomized_replacement = config.getBoolean("iron_block_randomized_replacement", ironCategory, false, "");
		iron_block_life_time = config.getInt("iron_block_life_time", ironCategory, 24000, 1, (Integer.MAX_VALUE - 1), "");
		iron_block_life_time_randomized = config.getBoolean("iron_block_life_time_randomized", ironCategory, false, "");
		iron_block_chance = config.getInt("iron_block_chance", ironCategory, 100, 0, 100, "");
		
		// lapis ore block
		lapis_block_spawn = config.getString("lapis_block_spawn", lapisCategory, "minecraft:lapis_ore", "");
		lapis_block_replacement = config.getStringList("lapis_block_replacement", lapisCategory, new String[] {"minecraft:lapis_ore"}, "");
		lapis_block_randomized_replacement = config.getBoolean("lapis_block_randomized_replacement", lapisCategory, false, "");
		lapis_block_life_time = config.getInt("lapis_block_life_time", lapisCategory, 12000, 1, (Integer.MAX_VALUE - 1), "");
		lapis_block_life_time_randomized = config.getBoolean("lapis_block_life_time_randomized", lapisCategory, false, "");
		lapis_block_chance = config.getInt("lapis_block_chance", lapisCategory, 100, 0, 100, "");
		
		// redstone ore block
		redstone_block_spawn = config.getString("redstone_block_spawn", redstoneCategory, "minecraft:lit_redstone_ore", "");
		redstone_block_replacement = config.getStringList("redstone_block_replacement", redstoneCategory, new String[] {"minecraft:redstone_ore"}, "");
		redstone_block_randomized_replacement = config.getBoolean("redstone_block_randomized_replacement", redstoneCategory, false, "");
		redstone_block_life_time = config.getInt("redstone_block_life_time", redstoneCategory, 12000, 1, (Integer.MAX_VALUE - 1), "");
		redstone_block_life_time_randomized = config.getBoolean("redstone_block_life_time_randomized", redstoneCategory, false, "");
		redstone_block_chance = config.getInt("redstone_block_chance", redstoneCategory, 100, 0, 100, "");
		
		config.save();
	}
	*/
}
