package com.auranite.quest;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class CollectItemsCondition implements QuestCondition {
    private final Item item;
    private final int count;

    public CollectItemsCondition(ResourceLocation itemId, int count) {
        this.item = Item.byId(BuiltInRegistries.ITEM.getId(itemId));
        this.count = count;
    }

    @Override
    public boolean test(Player player) {
        return player.getInventory().countItem(item) >= count;
    }
}