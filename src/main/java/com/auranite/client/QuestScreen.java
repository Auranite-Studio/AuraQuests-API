// src/main/java/com/example/questmod/client/QuestScreen.java
package com.auranite.client;

import com.auranite.quest.Quest;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.neoforged.neoforge.client.gui.widget.ScrollPanel;
import com.auranite.quest.QuestManager;

public class QuestScreen extends Screen {
    private ScrollPanel questList;

    protected QuestScreen(Component title) {
        super(title);
    }

    @Override
    protected void init() {
        questList = new ScrollPanel(...);
        QuestManager.getQuests().forEach(this::addQuestEntry);
    }

    private void addQuestEntry(Quest quest) {
        // Создание виджета квеста
    }
}