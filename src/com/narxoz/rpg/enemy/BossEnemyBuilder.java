package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;

public class BossEnemyBuilder implements EnemyBuilder {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private List<Ability> abilities = new ArrayList<>();
    private LootTable lootTable;
    private String ai;
    private int phase1, phase2, phase3;

    @Override
    public BossEnemyBuilder setName(String name) { this.name=name; return this; }
    @Override
    public BossEnemyBuilder setHealth(int health) { this.health=health; return this; }
    @Override
    public BossEnemyBuilder setDamage(int damage) { this.damage=damage; return this; }
    @Override
    public BossEnemyBuilder setDefense(int defense) { this.defense=defense; return this; }
    @Override
    public BossEnemyBuilder setSpeed(int speed) { this.speed=speed; return this; }
    @Override
    public BossEnemyBuilder setAbilities(List<Ability> abilities) {
        this.abilities=abilities;
        return this;
    }

    @Override
    public BossEnemyBuilder setLootTable(LootTable lootTable) {
        this.lootTable=lootTable;
        return this;}

    @Override
    public BossEnemyBuilder setAI(String ai) {
        this.ai=ai;
        return this;}

    public BossEnemyBuilder addPhase(int phaseNumber, int threshold) {
        if (phaseNumber==1) this.phase1=threshold;
        else if (phaseNumber==2) this.phase2=threshold;
        else if (phaseNumber==3) this.phase3=threshold;
        return this;}

    @Override
    public Enemy build() {
        if (name==null||health<=0) {
            throw new IllegalStateException("Enemy should have a valid name and health!");}
        return new DragonBoss(name, health, damage, defense, speed, "FIRE",
                abilities, phase1, phase2, phase3, lootTable, ai, true, true, 20);}
}