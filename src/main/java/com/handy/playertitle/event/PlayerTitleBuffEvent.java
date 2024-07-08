package com.handy.playertitle.event;

import com.handy.playertitle.entity.TitleBuff;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 玩家设置buff事件
 *
 * @author handy
 * @since 2.8.4
 */
public class PlayerTitleBuffEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    @Getter
    private final Player player;
    @Getter
    private final Map<String, List<TitleBuff>> titleBuffMap;
    @Getter
    private final List<TitleBuff> titleBuffList;
    private final boolean isAllBuff;

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PlayerTitleBuffEvent(Player player, List<TitleBuff> titleBuffList) {
        this.player = player;
        this.isAllBuff = false;
        this.titleBuffList = titleBuffList;
        this.titleBuffMap = new HashMap<>();
    }

    public PlayerTitleBuffEvent(Player player) {
        this.player = player;
        this.isAllBuff = false;
        this.titleBuffList = new ArrayList<>();
        this.titleBuffMap = new HashMap<>();
    }

    /**
     * 是否全局buff
     *
     * @return Player
     */
    public boolean isAllBuff() {
        return this.isAllBuff;
    }

    /**
     * 获取自己插件类型的buff
     *
     * @param pluginName 插件名
     * @return 类型
     */
    public List<TitleBuff> getMyPluginBuffType(String pluginName) {
        return this.titleBuffMap.get(pluginName);
    }

}