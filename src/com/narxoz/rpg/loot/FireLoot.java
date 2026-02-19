package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class FireLoot implements LootTable {
    @Override
    public List<String> getItems() {
        List<String> items=new ArrayList<>();
        items.add("Fire Crystal");
        items.add("Dragon Scale");
        return items;}

    @Override public int getGoldDrop() {
        return 500;}

    @Override public int getExperienceDrop() {
        return 1000;}

    @Override public String getLootInfo() {
        return "Valuable fire-themed loot";
    }

    @Override
    public LootTable clone() {
        return new FireLoot();}
}