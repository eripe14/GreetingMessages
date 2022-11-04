package com.eripe14.greetingsmessages.config.implementation;

import com.eripe14.greetingsmessages.config.ReloadableConfig;
import net.dzikoysk.cdn.entity.Description;
import net.dzikoysk.cdn.source.Resource;
import net.dzikoysk.cdn.source.Source;

import java.io.File;

public class PluginConfig implements ReloadableConfig {

    @Description("# Plugin settings")
    public String pluginPrefix = "&8[&6&lGreetingsMessages&8] &7";

    @Override
    public Resource resource(File folder) {
        return Source.of(folder, "config.yml");
    }
}
