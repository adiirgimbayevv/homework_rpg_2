package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;

public class DragonBoss implements Enemy {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<Ability> abilities;
    private Map<Integer, Integer> phases;
    private LootTable lootTable;
    private String aiBehavior;
    private boolean canFly;
    private boolean hasBreathAttack;
    private int wingspan;

    DragonBoss(String name, int health, int damage, int defense,
               int speed, String element, List<Ability> abilities,
               int phase1, int phase2, int phase3,
               LootTable lootTable, String aiBehavior,
               boolean canFly, boolean hasBreathAttack, int wingspan) {
        this.name=name;
        this.health=health;
        this.damage=damage;
        this.defense=defense;
        this.speed=speed;
        this.element=element;
        this.abilities=abilities!=null?abilities:new ArrayList<>();
        this.phases=new HashMap<>();
        this.phases.put(1,phase1);
        this.phases.put(2,phase2);
        this.phases.put(3,phase3);
        this.lootTable=lootTable;
        this.aiBehavior=aiBehavior;
        this.canFly=canFly;
        this.hasBreathAttack=hasBreathAttack;
        this.wingspan=wingspan;}

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getDamage() { return damage; }
    @Override public int getDefense() { return defense; }
    @Override public int getSpeed() { return speed; }
    @Override public List<Ability> getAbilities() { return abilities; }
    @Override public LootTable getLootTable() { return lootTable; }

    @Override
    public void displayInfo() {
        System.out.println("=== "+name+" (Dragon Boss) ===");
        System.out.println("HP: "+health + " | ATK: "+damage+" | DEF: "+defense);
        System.out.println("Element: "+element+" | AI: "+aiBehavior);
        System.out.println("Abilities count: "+abilities.size());
    }

    @Override
    public Enemy clone(){

        List<Ability> clonedAbilities=new ArrayList<>();
        for (Ability a:this.abilities){
            clonedAbilities.add(a.clone());}
        LootTable clonedLoot=(this.lootTable!=null)?this.lootTable.clone():null;
        return new DragonBoss(name, health, damage, defense, speed, element,
                clonedAbilities, phases.get(1), phases.get(2), phases.get(3),
                clonedLoot, aiBehavior, canFly, hasBreathAttack, wingspan);
    }
}