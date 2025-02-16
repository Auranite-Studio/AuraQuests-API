package com.auranite.network;


import com.auranite.quest.QuestProgress;

public class QuestProgressProvider {
    public static final Capability<QuestProgress> QUEST_PROGRESS =
            CapabilityManager.get(new CapabilityToken<>() {});

}