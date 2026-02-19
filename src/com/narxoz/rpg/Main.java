package com.narxoz.rpg;

import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- RPG Enemy System ---\n");
        EnemyComponentFactory shadowFactory=new ShadowComponentFactory();
        BossEnemyBuilder bossBuilder = new BossEnemyBuilder();

        System.out.println("Creating Shadow Boss...");
        Enemy shadowDragon=bossBuilder.setName("Night Terror").setHealth(12000).setDamage(500).setAbilities(shadowFactory.createAbilities()).setLootTable(shadowFactory.createLootTable()).setAI(shadowFactory.createAIBehavior()).addPhase(1, 12000).addPhase(2, 6000).build();

        shadowDragon.displayInfo();

        EnemyRegistry registry=new EnemyRegistry();

        registry.addPrototype("basic_goblin", new Goblin("Shadow Minion"));
        registry.addPrototype("boss_template", shadowDragon);

        Enemy clonedGoblin=registry.create("basic_goblin");
        Enemy clonedBoss=registry.create("boss_template");

        System.out.println("\n--- Cloned Shadow Entities ---");
        if (clonedGoblin!=null) clonedGoblin.displayInfo();
        if (clonedBoss!=null) clonedBoss.displayInfo();

        System.out.println("\n[Verification] Deep Copy Check: "+(shadowDragon.getAbilities()!=clonedBoss.getAbilities()?"SUCCESS (Unique lists)":"FAILED"));
    }
}