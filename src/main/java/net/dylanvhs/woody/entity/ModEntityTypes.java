package net.dylanvhs.woody.entity;

import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.entity.custom.OwlEntity;
import net.dylanvhs.woody.entity.custom.SquirrelEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, WoodyMod.MOD_ID);


    public static final RegistryObject<EntityType<SquirrelEntity>> SQUIRREL = ENTITY_TYPES.register("squirrel",
            () -> EntityType.Builder.of(SquirrelEntity::new, MobCategory.CREATURE)
                    .sized(0.9f, 1.5f)
                    .build(new ResourceLocation(WoodyMod.MOD_ID, "squirrel").toString()));

    public static final RegistryObject<EntityType<OwlEntity>> OWL = ENTITY_TYPES.register("owl",
            () -> EntityType.Builder.of(OwlEntity::new, MobCategory.CREATURE)
                    .sized(0.9f, 1.5f)
                    .build(new ResourceLocation(WoodyMod.MOD_ID, "owl").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
