package net.daniel99j.coolmod.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FreezeStatusEffect extends ModStatusEffect {

    public FreezeStatusEffect(StatusEffectCategory type, int color, boolean isInstant) {
        super(type, color, isInstant);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int level) {
        if (!entity.getEntityWorld().isClient) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();

            entity.teleport(x, y, z);
            entity.setVelocity(0, 0, 0);
            entity.setFrozenTicks(100);
            } else {
                entity.removeStatusEffectInternal(this);
            }
        }
    }