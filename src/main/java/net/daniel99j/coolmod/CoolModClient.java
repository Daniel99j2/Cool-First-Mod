package net.daniel99j.coolmod;

import net.daniel99j.coolmod.block.ModBlocks;
import net.daniel99j.coolmod.entity.ModEntities;
import net.daniel99j.coolmod.entity.client.IceologerModel;
import net.daniel99j.coolmod.entity.client.IceologerRenderer;
import net.daniel99j.coolmod.entity.client.ModModelLayers;
import net.daniel99j.coolmod.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class CoolModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICICLE, RenderLayer.getCutout());
        EntityRendererRegistry.register(ModEntities.ICEOLOGER, IceologerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ICEOLOGER, IceologerModel::getTexturedModelData);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIQUID_NITROGEN, ModFluids.FLOWING_LIQUID_NITROGEN,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/white_wool"),
                        new Identifier("minecraft:block/white_wool"),
                        0xA1E038D0
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_LIQUID_NITROGEN, ModFluids.FLOWING_LIQUID_NITROGEN);
    }

}
