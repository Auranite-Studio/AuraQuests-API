package com.auranite.quest;

import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class QuestProgress {
    private final Map<ResourceLocation, Integer> progress = new HashMap<>();

    public int getProgress(ResourceLocation questId) {
        return progress.getOrDefault(questId, 0);
    }

    public void setProgress(ResourceLocation questId, int value) {
        progress.put(questId, value);
    }
}