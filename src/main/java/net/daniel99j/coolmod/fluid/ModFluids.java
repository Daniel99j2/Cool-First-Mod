package net.daniel99j.coolmod.fluid;

import net.daniel99j.coolmod.CoolMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid STILL_LIQUID_NITROGEN;
    public static FlowableFluid FLOWING_LIQUID_NITROGEN;
    public static Block LIQUID_NITROGEN_BLOCK;
    public static Item LIQUID_NITROGEN_BUCKET;

    public static void register() {
        STILL_LIQUID_NITROGEN = Registry.register(Registries.FLUID,
                new Identifier(CoolMod.MOD_ID, "liquid_nitrogen"), new LiquidNitrogenFluid.Still());
        FLOWING_LIQUID_NITROGEN = Registry.register(Registries.FLUID,
                new Identifier(CoolMod.MOD_ID, "flowing_liquid_nitrogen"), new LiquidNitrogenFluid.Flowing());

        LIQUID_NITROGEN_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CoolMod.MOD_ID, "liquid_nitrogen_block"),
                new FluidBlock(ModFluids.STILL_LIQUID_NITROGEN, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        LIQUID_NITROGEN_BUCKET = Registry.register(Registries.ITEM, new Identifier(CoolMod.MOD_ID, "liquid_nitrogen_bucket"),
                new BucketItem(ModFluids.STILL_LIQUID_NITROGEN, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }

}
