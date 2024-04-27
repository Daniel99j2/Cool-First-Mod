package net.daniel99j.coolmod.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class FreezeStatusEffect extends ModStatusEffect {

    public FreezeStatusEffect(StatusEffectCategory type, int color, boolean isInstant) {
        super(type, color, isInstant);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int level) {
        if (!entity.getEntityWorld().isClient) {
            return; //ewjjreursf
            } else {
                entity.removeStatusEffectInternal(this);
            }
        }
    }