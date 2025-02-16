package com.auranite.quest;

import com.google.gson.Gson;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;

import java.util.HashMap;
import java.util.Map;
public class QuestManager {
    private static final Gson GSON = new Gson();
    private static final Map<ResourceLocation, Quest> QUESTS = new HashMap<>();

    public static void loadQuests(ResourceManager manager) {
        // ... (реализация загрузки из JSON)
    }

    public static Quest getQuest(ResourceLocation id) {
        return QUESTS.get(id);
    }
}