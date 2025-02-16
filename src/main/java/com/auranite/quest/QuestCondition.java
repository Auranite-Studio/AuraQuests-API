package com.auranite.quest;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
public interface QuestCondition {
    boolean test(Player player);

    static QuestCondition fromJson(JsonObject json) {
        String type = json.get("type").getAsString();
        return switch(type) {
            case "collect_item" -> createCollectCondition(json);
            // Добавьте другие типы условий здесь
            default -> throw new IllegalArgumentException("Unknown quest condition type: " + type);
        };
    }

    private static CollectItemsCondition createCollectCondition(JsonObject json) {
        ResourceLocation itemId = ResourceLocation.parse(json.get("item").getAsString());
        int count = json.get("count").getAsInt();
        return new CollectItemsCondition(
                BuiltInRegistries.ITEM.get(itemId),
                count
        );
    }
}