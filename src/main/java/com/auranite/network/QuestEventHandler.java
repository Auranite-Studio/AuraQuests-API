package com.auranite.network;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

public class QuestEventHandler {
    @SubscribeEvent
    public void onPlayerTick(PlayerTickEvent event) {
        if(event.phase == TickEvent.Phase.END) return;

        event.player.getCapability(QuestProgressProvider.QUEST_PROGRESS).ifPresent(progress -> {
            // Проверка выполнения квестов
        });
    }
}