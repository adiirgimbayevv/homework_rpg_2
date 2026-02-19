package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.IceSpell;
import com.narxoz.rpg.loot.IceLoot;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;

public class IceComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities=new ArrayList<>();
        abilities.add(new IceSpell("Frost Nova", 120));
        abilities.add(new IceSpell("Blizzard", 250));
        return abilities;}

    @Override
    public LootTable createLootTable() {
        return new IceLoot();}

    @Override
    public String createAIBehavior() {
        return "DEFENSIVE (ICE_AI)";}
}