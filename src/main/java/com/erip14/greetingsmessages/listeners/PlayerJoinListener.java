package com.erip14.greetingsmessages.listeners;

import com.erip14.greetingsmessages.config.implementation.MessageConfig;
import com.erip14.greetingsmessages.config.implementation.PluginConfig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public class PlayerJoinListener implements Listener {

    private final MessageConfig messageConfig;
    private final PluginConfig pluginConfig;
    private final Random random;

    public PlayerJoinListener(MessageConfig messageConfig, PluginConfig pluginConfig, Random random) {
        this.messageConfig = messageConfig;
        this.pluginConfig = pluginConfig;
        this.random = random;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        int randomNumber;

        if (!player.hasPlayedBefore()) {
            randomNumber = this.random.nextInt(this.messageConfig.messages.size());

            event.setJoinMessage(this.messageConfig.messages.get(randomNumber)
                    .replace("{PREFIX}", this.pluginConfig.pluginPrefix)
                    .replace("{PLAYER}", player.getName()));

            return;
        }

        randomNumber = this.random.nextInt(this.messageConfig.messagesWhenPlayerJoinAgain.size());

        event.setJoinMessage(this.messageConfig.messagesWhenPlayerJoinAgain.get(randomNumber)
                .replace("{PREFIX}", this.pluginConfig.pluginPrefix)
                .replace("{PLAYER}", player.getName()));
    }

}
