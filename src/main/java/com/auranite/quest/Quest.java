package com.auranite.quest;

import com.google.gson.annotations.SerializedName;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class Quest {
    private String title;
    private String description;
    private ResourceLocation icon;

    @SerializedName("conditions")
    private List<QuestCondition> conditions;

    @SerializedName("rewards")
    private QuestReward rewards;

    // Геттеры
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public ResourceLocation getIcon() { return icon;}
    public List<QuestCondition> getConditions() { return conditions; }
    public QuestReward getRewards() { return rewards; }
}