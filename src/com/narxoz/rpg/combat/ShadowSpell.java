package com.narxoz.rpg.combat;

public class ShadowSpell implements Ability {
    private String name;
    private int damage;

    public ShadowSpell(String name, int damage) {
        this.name=name;
        this.damage=damage;
    }

    @Override public String getName() { return name; }
    @Override public int getDamage() { return damage; }
    @Override public String getDescription() { return "Consumes soul and deals "+damage+" shadow damage"; }

    @Override
    public Ability clone() {
        return new ShadowSpell(this.name, this.damage);}
}