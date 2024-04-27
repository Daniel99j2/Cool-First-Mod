package net.daniel99j.coolmod;

import net.daniel99j.coolmod.effect.ModEffectRegistry;
import net.daniel99j.coolmod.entity.ModEntities;
import net.daniel99j.coolmod.entity.client.IceologerModel;
import net.daniel99j.coolmod.entity.client.IceologerRenderer;
import net.daniel99j.coolmod.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class CoolModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ICEOLOGER, IceologerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ICEOLOGER, IceologerModel::getTexturedModelData);
    }
}
