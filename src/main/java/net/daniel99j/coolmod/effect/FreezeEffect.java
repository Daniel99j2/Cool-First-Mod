package net.daniel99j.coolmod.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

//public class FreezeEffect extends StatusEffect {
//    public FreezeEffect(StatusEffectCategory statusEffectCategory, int color) {
//        super(statusEffectCategory, color);
//    }
//
//    @Override
//    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
//        if (!pLivingEntity.getWorld().isClient()) {
//            double x = pLivingEntity.getX();
//            double y = pLivingEntity.getY();
//            double z = pLivingEntity.getZ();
//
//            pLivingEntity.teleport(x, y, z);
//            pLivingEntity.setVelocity(0, 0, 0);
//            pLivingEntity.setFrozenTicks(100);
//        }
//
//        super.applyUpdateEffect(pLivingEntity, pAmplifier);
//    }
//
//    @Override
//    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
//        return true;
//    }
//}

public class FreezeEffect extends StatusEffect {
    public FreezeEffect() {
        super(
                StatusEffectCategory.BENEFICIAL, // whether beneficial or harmful for entities
                0x98D982); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).addExperience(1 << amplifier); // Higher amplifier gives you EXP faster
        }
    }
}