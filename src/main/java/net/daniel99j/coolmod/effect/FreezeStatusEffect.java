package net.daniel99j.coolmod.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class FreezeStatusEffect extends StatusEffect {
    public FreezeStatusEffect() {
        super(
                StatusEffectCategory.HARMFUL, // whether beneficial or harmful for entities
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
        entity.setFrozenTicks(500);
    }
}



/*package net.daniel99j.coolmod.effect;

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
*/