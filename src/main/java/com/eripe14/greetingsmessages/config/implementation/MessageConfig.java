package com.eripe14.greetingsmessages.config.implementation;

import com.eripe14.greetingsmessages.config.ReloadableConfig;
import net.dzikoysk.cdn.entity.Description;
import net.dzikoysk.cdn.source.Resource;
import net.dzikoysk.cdn.source.Source;

import java.io.File;
import java.util.List;

public class MessageConfig implements ReloadableConfig {

    @Description("# Greetings Messages when player join for the first time")
    public List<String> messages = List.of(
            "{PREFIX} &7Welcome to the server, {PLAYER}!",
            "{PREFIX} &7Hello, {PLAYER}!",
            "{PREFIX} &7Hi, {PLAYER}!",
            "{PREFIX} &7Hey, {PLAYER}!",
            "{PREFIX} &7Greetings, {PLAYER}!",
            "{PREFIX} &7Welcome, {PLAYER}!",
            "{PREFIX} &7Hello there, {PLAYER}!",
            "{PREFIX} &7Hey there, {PLAYER}!",
            "{PREFIX} &7Welcome there, {PLAYER}!"
    );

    @Description("# Greetings Messages when player join for the second time")
    public List<String> messagesWhenPlayerJoinAgain = List.of(
            "{PREFIX} &7Welcome back, {PLAYER}!",
            "{PREFIX} &7Hello, {PLAYER}!",
            "{PREFIX} &7Hi, {PLAYER}!",
            "{PREFIX} &7Hey, {PLAYER}!",
            "{PREFIX} &7Greetings, {PLAYER}!",
            "{PREFIX} &7Welcome, {PLAYER}!",
            "{PREFIX} &7Hello there, {PLAYER}!",
            "{PREFIX} &7Welcome back, {PLAYER}!"
    );

    @Override
    public Resource resource(File folder) {
        return Source.of(folder, "messages.yml");
    }
}
