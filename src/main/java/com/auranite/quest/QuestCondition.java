// src/main/java/com/example/questmod/data/QuestCondition.java
package com.auranite.quest;

import com.google.gson.JsonObject;
import net.minecraft.world.entity.player.Player;

public interface QuestCondition {
    boolean test(Player player);

    // Фабричный метод для десериализации
    static QuestCondition fromJson(JsonObject json) {
        String type = json.get("type").getAsString();
        return switch(type) {
            case "collect_item" -> {
                yield collectItemsCondition;
            }
            // Другие типы условий
            default -> throw new IllegalArgumentException("Unknown condition type: " + type);
        };
    }
}