package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class IceLoot implements LootTable {
    @Override
    public List<String> getItems() {
        List<String> items=new ArrayList<>();
        items.add("Frozen Core");
        items.add("Ice Shard");
        return items;
    }

    @Override public int getGoldDrop() { return 300; }
    @Override public int getExperienceDrop() { return 600; }
    @Override public String getLootInfo() { return "Glacial treasure"; }

    @Override
    public LootTable clone() {
        return new IceLoot();
    }
}