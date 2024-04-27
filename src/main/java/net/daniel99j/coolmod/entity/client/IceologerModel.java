// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.daniel99j.coolmod.entity.client;

import net.daniel99j.coolmod.entity.custom.IceologerEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class IceologerModel<T extends IceologerEntity> extends SinglePartEntityModel<T> {
	private final ModelPart iceologer;
	private final ModelPart head;

	public IceologerModel(ModelPart root) {
		this.iceologer = root.getChild("iceologer");
		this.head = root.getChild("iceologer").getChild("head_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData iceologer = modelPartData.addChild("iceologer", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData left_leg = iceologer.addChild("left_leg", ModelPartBuilder.create().uv(0, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -12.0F, 0.0F));

		ModelPartData right_leg = iceologer.addChild("right_leg", ModelPartBuilder.create().uv(0, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));

		ModelPartData arms = iceologer.addChild("arms", ModelPartBuilder.create(), ModelTransform.of(0.0F, -21.05F, -1.05F, -0.7505F, 0.0F, 0.0F));

		ModelPartData right = arms.addChild("right", ModelPartBuilder.create().uv(44, 22).cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 0.0F, 0.0F));

		ModelPartData hand2 = right.addChild("hand2", ModelPartBuilder.create().uv(44, 57).cuboid(6.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F))
				.uv(40, 38).cuboid(3.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 4.0F, 0.0F));

		ModelPartData left = arms.addChild("left", ModelPartBuilder.create().uv(44, 22).mirrored().cuboid(0.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData hand = left.addChild("hand", ModelPartBuilder.create().uv(40, 49).cuboid(-11.0F, -2.05F, -2.05F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F))
				.uv(44, 57).cuboid(-7.0F, -2.05F, -2.05F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 4.05F, 0.05F));

		ModelPartData bodywear = iceologer.addChild("bodywear", ModelPartBuilder.create().uv(0, 38).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData body = iceologer.addChild("body", ModelPartBuilder.create().uv(16, 20).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData head_main = iceologer.addChild("head_main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = head_main.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData nose = head_main.addChild("nose", ModelPartBuilder.create().uv(24, 0).cuboid(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -26.0F, 0.0F));

		ModelPartData headwear = head_main.addChild("headwear", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new Dilation(0.51F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(IceologerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		iceologer.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return iceologer;
	}
}