package com.narxoz.rpg.enemy;

import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private Map<String, Enemy> prototypes = new HashMap<>();

    public void addPrototype(String key, Enemy enemy) {
        prototypes.put(key, enemy);
    }
    public Enemy create(String key) {
        Enemy e=prototypes.get(key);
        return (e!=null)?e.clone():null;
    }
}