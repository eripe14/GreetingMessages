package com.eripe14.greetingsmessages.util;

public final class ChatUtil {

    private ChatUtil() {

    }

    public static String color(String message) {
        return message.replace("&", "§");
    }

}
