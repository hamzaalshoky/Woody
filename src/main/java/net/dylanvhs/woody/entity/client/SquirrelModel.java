package net.dylanvhs.woody.entity.client;

import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.entity.custom.SquirrelEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SquirrelModel extends AnimatedGeoModel<SquirrelEntity> {
    @Override
    public ResourceLocation getModelLocation(SquirrelEntity object) {
        return new ResourceLocation(WoodyMod.MOD_ID, "geo/squirrel.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SquirrelEntity object) {
        return new ResourceLocation(WoodyMod.MOD_ID, "textures/entity/squirrel/squirrel.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SquirrelEntity animatable) {
        return new ResourceLocation(WoodyMod.MOD_ID, "animations/squirrel.animation.json");
    }
}
