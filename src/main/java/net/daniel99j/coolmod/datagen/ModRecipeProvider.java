package net.daniel99j.coolmod.datagen;

import net.daniel99j.coolmod.block.ModBlocks;
import net.daniel99j.coolmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
//        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOL_BLOCK, 1)
//                .pattern("SSS")
//                .pattern("SSS")
//                .pattern("SSS")
//                .input('S', ModItems.COOL)
//                .criterion(hasItem(ModItems.COOL), conditionsFromItem(ModItems.COOL));
//        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.COOL, 1)
//                .pattern("SSS")
//                .pattern("SRS")
//                .pattern("SSS")
//                .input('S', Items.STONE)
//                .input('R', ModItems.RUBY)
//                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
//                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
//                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_RUBY)));
    }

}
