package com.auranite.network;

import com.auranite.quest.QuestProgress;
import net.minecraft.network.FriendlyByteBuf;

public class QuestSyncPacket implements SimpleChannel.Message {
    private QuestProgress progress;

    public static void encode(QuestSyncPacket msg, FriendlyByteBuf buffer) {
        // Сериализация данных
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        // Обработка на клиенте
    }
}