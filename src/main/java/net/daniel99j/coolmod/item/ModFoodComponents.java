package net.daniel99j.coolmod.item;

import net.daniel99j.coolmod.effect.FreezeStatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    private static StatusEffectInstance FreezeStatusEffect;
    public static final FoodComponent COOLBERRY_ICECREAM = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(FreezeStatusEffect.getEffectType(), 100, 1), 0.10f).build();

}
