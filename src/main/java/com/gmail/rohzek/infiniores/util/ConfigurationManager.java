package com.gmail.rohzek.infiniores.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigurationManager
{
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);
    public static final ForgeConfigSpec spec = BUILDER.build();
    
    public static class General 
    {
    	public final ForgeConfigSpec.ConfigValue<Boolean> isDebug;
    	
    	// ORES
    	
    	// Coal Block
    	public final ForgeConfigSpec.ConfigValue<String> coal_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> coal_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> coal_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> coal_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> coal_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> coal_block_chance;
    	
    	// Diamond Block
    	public final ForgeConfigSpec.ConfigValue<String> diamond_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> diamond_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> diamond_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> diamond_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> diamond_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> diamond_block_chance;
    	
    	// Emerald Block
    	public final ForgeConfigSpec.ConfigValue<String> emerald_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> emerald_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> emerald_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> emerald_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> emerald_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> emerald_block_chance;
    	
    	// Gold Block
    	public final ForgeConfigSpec.ConfigValue<String> gold_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> gold_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> gold_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> gold_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> gold_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> gold_block_chance;
    	
    	// Iron Block
    	public final ForgeConfigSpec.ConfigValue<String> iron_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> iron_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> iron_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> iron_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> iron_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> iron_block_chance;
    	
    	// Lapis Block
    	public final ForgeConfigSpec.ConfigValue<String> lapis_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> lapis_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> lapis_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> lapis_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> lapis_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> lapis_block_chance;
    	
    	// Redstone Block
    	public final ForgeConfigSpec.ConfigValue<String> redstone_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> redstone_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> redstone_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> redstone_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> redstone_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> redstone_block_chance;
    	
    	// BLOCKS
    	// Coal Block
    	public final ForgeConfigSpec.ConfigValue<String> stone_block_spawn;
    	public final ForgeConfigSpec.ConfigValue<List<String>> stone_block_replacement;
    	public final ForgeConfigSpec.ConfigValue<Boolean> stone_block_randomized_replacement;
    	public final ForgeConfigSpec.ConfigValue<Integer> stone_block_life_time;
    	public final ForgeConfigSpec.ConfigValue<Boolean> stone_block_life_time_randomized;
    	public final ForgeConfigSpec.ConfigValue<Integer> stone_block_chance;
    	
    	//public static List<DepletedOre> ORES = new ArrayList<DepletedOre>();

        public General(ForgeConfigSpec.Builder builder)
        {
            builder.push("General");
            
            isDebug = builder
                    .comment("Enables/Disables debug mode (SPAMS LOGS! Is for detailed bug reports; You probably don't want this for normal play) [false/true|default:false]")
                    .translation("debugmode.simpledivegear.config")
                    .define("isDebug", false);
            
            builder.pop();
            
            builder.push("Ore Configurations");
	            builder.push("Coal Configurations");
	            
	            coal_block_spawn = builder
	            		.comment("")
	            		.translation("")
	            		.define("coal_block_spawn", "minecraft:coal_ore");
	            
	            coal_block_replacement = builder
	            		.comment("")
	            		.translation("")
	            		.define("coal_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:coal_ore")));
	           
	            coal_block_randomized_replacement = builder
	            		.comment("")
	            		.translation("coal_block_randomized_replacement")
	            		.define("coal_block_randomized_replacement", false);
	            
	            coal_block_life_time = builder
	            		.comment("")
	            		.translation("")
	            		.define("coal_block_life_time", 20);
	            
	            coal_block_life_time_randomized = builder
	            		.comment("")
	            		.translation("")
	            		.define("coal_block_life_time_randomized", false);
	            
	            coal_block_chance = builder
	            		.comment("")
	            		.translation("")
	            		.define("coal_block_chance", 100);
	            
	            builder.pop();
	            
	            builder.push("Diamond Configuration");
	            diamond_block_spawn = builder.comment("").translation("").define("diamond_block_spawn", "minecraft:diamond_ore");
	            diamond_block_replacement = builder.comment("").translation("").define("diamond_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:diamond_ore")));
	            diamond_block_randomized_replacement = builder.comment("").translation("diamond_block_randomized_replacement").define("diamond_block_randomized_replacement", false);
	            diamond_block_life_time = builder.comment("").translation("").define("diamond_block_life_time", 20);
	            diamond_block_life_time_randomized = builder.comment("").translation("").define("diamond_block_life_time_randomized", false);
	            diamond_block_chance = builder.comment("").translation("").define("diamond_block_chance", 100);
	            
	            builder.pop();
	            
	            builder.push("Emerald Configuration");
	            emerald_block_spawn = builder.comment("").translation("").define("emerald_block_spawn", "minecraft:emerald_ore");
	            emerald_block_replacement = builder.comment("").translation("").define("emerald_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:emerald_ore")));
	            emerald_block_randomized_replacement = builder.comment("").translation("emerald_block_randomized_replacement").define("emerald_block_randomized_replacement", false);
	            emerald_block_life_time = builder.comment("").translation("").define("emerald_block_life_time", 20);
	            emerald_block_life_time_randomized = builder.comment("").translation("").define("emerald_block_life_time_randomized", false);
	            emerald_block_chance = builder.comment("").translation("").define("emerald_block_chance", 100);
	            
	            builder.pop();
	            
	            builder.push("Gold Configuration");
	            gold_block_spawn = builder.comment("").translation("").define("gold_block_spawn", "minecraft:gold_ore");
	            gold_block_replacement = builder.comment("").translation("").define("gold_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:gold_ore")));
	            gold_block_randomized_replacement = builder.comment("").translation("gold_block_randomized_replacement").define("gold_block_randomized_replacement", false);
	            gold_block_life_time = builder.comment("").translation("").define("gold_block_life_time", 20);
	            gold_block_life_time_randomized = builder.comment("").translation("").define("gold_block_life_time_randomized", false);
	            gold_block_chance = builder.comment("").translation("").define("gold_block_chance", 100);
	            
	            builder.pop();
	            
	            builder.push("Iron Configuration");
	            iron_block_spawn = builder.comment("").translation("").define("iron_block_spawn", "minecraft:iron_ore");
	            iron_block_replacement = builder.comment("").translation("").define("iron_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:iron_ore")));
	            iron_block_randomized_replacement = builder.comment("").translation("iron_block_randomized_replacement").define("iron_block_randomized_replacement", false);
	            iron_block_life_time = builder.comment("").translation("").define("iron_block_life_time", 20);
	            iron_block_life_time_randomized = builder.comment("").translation("").define("iron_block_life_time_randomized", false);
	            iron_block_chance = builder.comment("").translation("").define("iron_block_chance", 100);
	            
	            builder.pop();
	            
	            builder.push("Lapis Configuration");
	            lapis_block_spawn = builder.comment("").translation("").define("lapis_block_spawn", "minecraft:lapis_ore");
	            lapis_block_replacement = builder.comment("").translation("").define("lapis_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:lapis_ore")));
	            lapis_block_randomized_replacement = builder.comment("").translation("lapis_block_randomized_replacement").define("lapis_block_randomized_replacement", false);
	            lapis_block_life_time = builder.comment("").translation("").define("lapis_block_life_time", 20);
	            lapis_block_life_time_randomized = builder.comment("").translation("").define("lapis_block_life_time_randomized", false);
	            lapis_block_chance = builder.comment("").translation("").define("lapis_block_chance", 100);
	            
	            builder.pop();
	            
	            builder.push("Redstone Configuration");
	            redstone_block_spawn = builder.comment("").translation("").define("redstone_block_spawn", "minecraft:redstone_ore");
	            redstone_block_replacement = builder.comment("").translation("").define("redstone_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:redstone_ore")));
	            redstone_block_randomized_replacement = builder.comment("").translation("redstone_block_randomized_replacement").define("redstone_block_randomized_replacement", false);
	            redstone_block_life_time = builder.comment("").translation("").define("redstone_block_life_time", 20);
	            redstone_block_life_time_randomized = builder.comment("").translation("").define("redstone_block_life_time_randomized", false);
	            redstone_block_chance = builder.comment("").translation("").define("redstone_block_chance", 100);
	            
	            builder.pop();
	        builder.pop();
	        builder.push("Block Configurations");
	        	builder.push("Stone Configurations");
	        	stone_block_spawn = builder
	            		.comment("Parent block to spawn the depleted version from")
	            		.translation("")
	            		.define("stone_block_spawn", "minecraft:stone");
	            
	        	stone_block_replacement = builder
	            		.comment("Block to be spawned from depleted version")
	            		.translation("")
	            		.define("stone_block_replacement", new ArrayList<String>(Arrays.asList("minecraft:stone")));
	           
	        	stone_block_randomized_replacement = builder
	            		.comment("Determines if the block to be spawned should be randomized from list, or always return the first entry")
	            		.translation("stone_block_randomized_replacement")
	            		.define("stone_block_randomized_replacement", false);
	            
	        	stone_block_life_time = builder
	            		.comment("Amount of time it should take to respawn block")
	            		.translation("")
	            		.define("stone_block_life_time", 20);
	            
	        	stone_block_life_time_randomized = builder
	            		.comment("Determines if the amount of time should be randomized between 0 and the max time specified by block_life_time")
	            		.translation("")
	            		.define("stone_block_life_time_randomized", false);
	            
	        	stone_block_chance = builder
	            		.comment("The chance to spawn the item (as a percentage)")
	            		.translation("")
	            		.define("stone_block_chance", 100);
	        builder.pop();
        }
    }
}
