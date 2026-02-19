package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireSpell;
import com.narxoz.rpg.loot.FireLoot;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;

public class FireComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new FireSpell("Flame Breath", 150));
        abilities.add(new FireSpell("Meteor Strike", 300));
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new FireLoot();
    }

    @Override
    public String createAIBehavior() {
        return "AGGRESSIVE (FIRE_AI)";
    }
}