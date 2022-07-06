package com.gmail.rohzek.infiniores;

import com.gmail.rohzek.infiniores.blocks.Ores;
import com.gmail.rohzek.infiniores.lib.DeferredRegistration;
import com.gmail.rohzek.infiniores.lib.Reference;
import com.gmail.rohzek.infiniores.util.ConfigurationManager;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
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
	public static final ItemGroup INFINI_ORES_TAB = new ItemGroup(Reference.MODID) 
	{

		@Override
		public ItemStack makeIcon() 
		{
			return ItemStack.EMPTY;
		}
		
		@Override
		public void fillItemList(NonNullList<ItemStack> itemStacks) 
		{
			itemStacks.add(new ItemStack(Ores.DEPLETED_ORE.get()));
		};
	};
	
	public InfiniOres() 
	{
		// Register the mod
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.register(this);
		
		// Set deferred registration
		DeferredRegistration.register(bus);
		Ores.register();
		
		INFINI_ORES_TAB.getBackgroundImage();
		
		// Register configuration file
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
	}
	
	@SubscribeEvent
	public void setup(FMLCommonSetupEvent event) {}
}
