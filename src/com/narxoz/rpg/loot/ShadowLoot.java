package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class ShadowLoot implements LootTable {
    @Override
    public List<String> getItems() {
        List<String> items=new ArrayList<>();
        items.add("Void Essence");
        items.add("Dark Fragment");
        return items;
    }

    @Override public int getGoldDrop() { return 666; }
    @Override public int getExperienceDrop() { return 1500; }
    @Override public String getLootInfo() { return "Cursed shadow themed loot"; }

    @Override
    public LootTable clone() {
        return new ShadowLoot();}
}