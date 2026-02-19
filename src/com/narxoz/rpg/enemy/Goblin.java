package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
import java.util.ArrayList;

public class Goblin implements Enemy {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private List<Ability> abilities;
    private LootTable lootTable;

    public Goblin(String name) {
        this.name=name;
        this.health=100;
        this.damage=15;
        this.defense=5;
        this.speed=35;
        this.abilities=new ArrayList<>();
    }
    private Goblin(Goblin target) {
        this.name=target.name;
        this.health=target.health;
        this.damage=target.damage;
        this.defense=target.defense;
        this.speed=target.speed;

        this.abilities=new ArrayList<>();
        for (Ability a:target.abilities) {
            this.abilities.add(a.clone());
        }
        if (target.lootTable!=null) {
            this.lootTable=target.lootTable.clone();
        }
    }

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getDamage() { return damage; }
    @Override public int getDefense() { return defense; }
    @Override public int getSpeed() { return speed; }
    @Override public List<Ability> getAbilities() { return abilities; }
    @Override public LootTable getLootTable() { return lootTable; }

    @Override
    public void displayInfo() {
        System.out.println("=== " + name + " (Basic Goblin) ===");
        System.out.println("HP: " + health + " | DMG: " + damage + " | SPD: " + speed);
        System.out.println("Abilities: " + (abilities != null ? abilities.size() : 0));
    }

    @Override
    public Enemy clone() {
        return new Goblin(this);
    }

    public void multiplyStats(double multiplier) {
        this.health*=multiplier;
        this.damage*=multiplier;
        this.name = "Elite "+this.name;}
}