package com.narxoz.rpg.combat;

public class IceSpell implements Ability {
    private String name;
    private int damage;

    public IceSpell(String name, int damage) {
        this.name=name;
        this.damage=damage;
    }

    @Override public String getName() { return name; }
    @Override public int getDamage() { return damage; }
    @Override public String getDescription() { return "Freezes enemies and deals "+damage+" damage"; }
    @Override
    public Ability clone() {
        return new IceSpell(this.name, this.damage);
    }
}