package com.erip14.greetingsmessages.config.implementation;

import com.erip14.greetingsmessages.config.ReloadableConfig;
import net.dzikoysk.cdn.entity.Description;
import net.dzikoysk.cdn.source.Resource;
import net.dzikoysk.cdn.source.Source;

import java.io.File;

public class PluginConfig implements ReloadableConfig {

    @Description("# Plugin settings")
    public String pluginPrefix = "&8[&6&lGreetingsMessages&8] &7";

    @Description("# Messages settings")
    public boolean sendDifferentMessageWhenPlayerJoinsForTheFirstTime = true;

    @Override
    public Resource resource(File folder) {
        return Source.of(folder, "config.yml");
    }
}
