package com.gmail.rohzek.infiniores.events;

import com.gmail.rohzek.infiniores.blocks.Ores;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class LoadModelsEvent 
{
	@SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent event)
	{
		Ores.registerRenders();
		Ores.registerTileEntities();
    }
}
