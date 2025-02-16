package com.auranite.quest;

import net.minecraft.world.item.ItemStack;

import java.util.List;

public class QuestReward {
    private int experience;
    private List<ItemStack> items;

    // Геттеры
    public int getExperience() { return experience; }
    public List<ItemStack> getItems() { return items; }
}