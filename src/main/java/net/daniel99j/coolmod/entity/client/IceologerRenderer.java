package net.daniel99j.coolmod.entity.client;

import net.daniel99j.coolmod.CoolMod;
import net.daniel99j.coolmod.entity.custom.IceologerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class IceologerRenderer extends MobEntityRenderer<IceologerEntity, IceologerModel<IceologerEntity>> {
    private static final Identifier TEXTURE = new Identifier(CoolMod.MOD_ID, "textures/entity/iceologer.png");

    public IceologerRenderer(EntityRendererFactory.Context context) {

        super(context, new IceologerModel<>(context.getPart(ModModelLayers.ICEOLOGER)), 0.6f);
    }

    @Override
    public Identifier getTexture(IceologerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(IceologerEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
            matrixStack.scale(1f, 1f, 1f);

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
