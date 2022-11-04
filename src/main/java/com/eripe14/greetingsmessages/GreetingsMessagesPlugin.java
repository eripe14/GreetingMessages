package com.eripe14.greetingsmessages;

import com.eripe14.greetingsmessages.config.ConfigManager;
import com.eripe14.greetingsmessages.config.implementation.MessageConfig;
import com.eripe14.greetingsmessages.config.implementation.PluginConfig;
import com.eripe14.greetingsmessages.listeners.PlayerJoinListener;
import com.google.common.base.Stopwatch;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GreetingsMessagesPlugin extends JavaPlugin {

    private ConfigManager configManager;

    private PluginConfig pluginConfig;
    private MessageConfig messageConfig;

    @Override
    public void onEnable() {
        Stopwatch started = Stopwatch.createStarted();

        this.configManager = new ConfigManager(this.getDataFolder());

        this.pluginConfig = this.configManager.load(new PluginConfig());
        this.messageConfig = this.configManager.load(new MessageConfig());

        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(this.messageConfig, this.pluginConfig, new Random()), this);

        long millis = started.elapsed(TimeUnit.MILLISECONDS);
        this.getLogger().info("Successfully loaded GreetingsMessagesPlugin in " + millis + "ms");
    }

    public ConfigManager getConfigManager() {
        return this.configManager;
    }

    public PluginConfig getPluginConfig() {
        return this.pluginConfig;
    }

    public MessageConfig getMessageConfig() {
        return this.messageConfig;
    }

}
