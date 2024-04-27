package net.daniel99j.coolmod.entity;

import net.daniel99j.coolmod.CoolMod;
import net.daniel99j.coolmod.entity.custom.IceologerEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<IceologerEntity> ICEOLOGER = Registry.register(Registries.ENTITY_TYPE, new Identifier(CoolMod.MOD_ID, "iceologer"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, IceologerEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build());
}
