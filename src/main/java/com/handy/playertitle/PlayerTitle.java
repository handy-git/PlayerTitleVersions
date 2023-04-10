package com.handy.playertitle;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 主类
 *
 * @author handy
 */
public class PlayerTitle extends JavaPlugin {
    private static PlayerTitle INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    @Override
    public void onDisable() {
    }

    public static PlayerTitle getInstance() {
        return INSTANCE;
    }

}