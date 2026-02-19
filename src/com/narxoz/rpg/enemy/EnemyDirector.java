package com.narxoz.rpg.enemy;

import com.narxoz.rpg.factory.EnemyComponentFactory;

public class EnemyDirector {
    public Enemy constructFireDragon(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder.setName("Fire Dragon")
                .setHealth(5000)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }

    public Enemy constructIceWarrior(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder.setName("Frost Knight")
                .setHealth(2000)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
}