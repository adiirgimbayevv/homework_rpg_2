package com.narxoz.rpg.combat;

public class FireSpell implements Ability {
    private String name;
    private int damage;

    public FireSpell(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override public String getName() {
        return name;}
    @Override public int getDamage() {
        return damage;}

    @Override public String getDescription() {
        return "Deals fire damage: "+damage;
    }
    @Override
    public Ability clone() {
        return new FireSpell(this.name, this.damage);
    }
}