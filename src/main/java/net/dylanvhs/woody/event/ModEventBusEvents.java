package net.dylanvhs.woody.event;

import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.entity.ModEntityTypes;
import net.dylanvhs.woody.entity.custom.OwlEntity;
import net.dylanvhs.woody.entity.custom.SquirrelEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WoodyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SQUIRREL.get(), SquirrelEntity.setAttributes());
        event.put(ModEntityTypes.OWL.get(), OwlEntity.setAttributes());
    }

}
