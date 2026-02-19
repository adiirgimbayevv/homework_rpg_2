package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.ShadowSpell;
import com.narxoz.rpg.loot.ShadowLoot;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;

public class ShadowComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities=new ArrayList<>();
        abilities.add(new ShadowSpell("Shadow Strike", 100));
        abilities.add(new ShadowSpell("Abyssal Grip", 250));
        return abilities;}
    @Override
    public LootTable createLootTable() {
        return new ShadowLoot();}

    @Override
    public String createAIBehavior() {
        return "STEALTHY (SHADOW_AI)";}
}