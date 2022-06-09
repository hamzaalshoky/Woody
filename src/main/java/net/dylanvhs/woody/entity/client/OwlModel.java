package net.dylanvhs.woody.entity.client;

import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.entity.custom.OwlEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OwlModel extends AnimatedGeoModel<OwlEntity> {
    @Override
    public ResourceLocation getModelLocation(OwlEntity object) {
        return new ResourceLocation(WoodyMod.MOD_ID, "geo/owl.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OwlEntity object) {
        return new ResourceLocation(WoodyMod.MOD_ID, "textures/entity/owl/owl.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OwlEntity animatable) {
        return new ResourceLocation(WoodyMod.MOD_ID, "animations/owl.animation.json");
    }
}
