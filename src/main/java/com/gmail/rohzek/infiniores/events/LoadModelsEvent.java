package com.gmail.rohzek.infiniores.events;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class LoadModelsEvent 
{
	@SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent event)
	{
		//Ores.registerRenders();
		//Ores.registerTileEntities();
    }
}
