package net.dylanvhs.woody.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.entity.custom.SquirrelEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SquirrelRenderer extends GeoEntityRenderer<SquirrelEntity> {
    
    public SquirrelRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SquirrelModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SquirrelEntity instance) {
        return new ResourceLocation(WoodyMod.MOD_ID, "textures/entity/squirrel/squirrel.png");
    }


    @Override
    public RenderType getRenderType(SquirrelEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
