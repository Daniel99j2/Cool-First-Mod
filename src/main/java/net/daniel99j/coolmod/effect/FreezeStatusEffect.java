package net.daniel99j.coolmod.effect;

import net.daniel99j.coolmod.CoolMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

import java.util.Vector;

public class FreezeStatusEffect extends ModStatusEffect {

    public FreezeStatusEffect(StatusEffectCategory type, int color, boolean isInstant) {
        super(type, color, false);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int level) {
        if (!entity.getEntityWorld().isClient) {
            entity.setFrozenTicks(500);
            entity.setMovementSpeed(-1000);
            } else {
            entity.removeStatusEffectInternal(this);
            }
        }
    }