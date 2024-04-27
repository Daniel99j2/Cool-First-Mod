package net.daniel99j.coolmod.effect;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects implements ModInitializer {
    public static final StatusEffect FREEZE = new FreezeEffect();

    @Override
    public void onInitialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("coolmod", "exp"), FREEZE);
    }
}