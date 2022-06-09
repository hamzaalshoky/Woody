package net.dylanvhs.woody.entity.client;

import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.entity.ModEntityTypes;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = WoodyMod.MOD_ID)
public class ClientEvents {

    @SubscribeEvent
    public static void registerEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.SQUIRREL.get(), SquirrelRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.OWL.get(), OwlRenderer::new);
    }
}
