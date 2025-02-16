package com.auranite.quest;

import com.google.gson.Gson;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class QuestManager implements PreparableReloadListener {
    private static final Gson GSON = new Gson();
    private static final Map<ResourceLocation, Quest> QUESTS = new HashMap<>();

    public static void loadQuests(ResourceManager manager) {
        // ... (реализация загрузки из JSON)
    }

    public static Quest getQuest(ResourceLocation id) {
        return QUESTS.get(id);
    }

    @Override
    public CompletableFuture<Void> reload(PreparationBarrier preparationBarrier, ResourceManager resourceManager, ProfilerFiller profilerFiller, ProfilerFiller profilerFiller1, Executor executor, Executor executor1) {
        return null;
    }
}