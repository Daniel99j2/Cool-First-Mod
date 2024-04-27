package net.daniel99j.coolmod.effect;

import java.lang.reflect.Field;

import net.daniel99j.coolmod.CoolMod;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffectRegistry {

    public static ModStatusEffect frozen = (ModStatusEffect) new FreezeStatusEffect(StatusEffectCategory.HARMFUL, 0x03befc, false);


    public static void registerAll() {

        try {
            int registered = 0;
            for (Field field:ModEffectRegistry.class.getDeclaredFields()) {
                if (ModStatusEffect.class.isAssignableFrom(field.getType())) {
                    Identifier id = new Identifier(CoolMod.MOD_ID, field.getName());
                    Registry.register(Registries.STATUS_EFFECT, id, ((ModStatusEffect) field.get(null)).onRegister());
                    registered++;
                }
            }
        } catch (Exception e) {
            return;
        }

    }
}