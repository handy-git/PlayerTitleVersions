package com.handy.playertitle.event;

import com.handy.playertitle.entity.TitleBuff;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

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
    private final Player player;
    private final Map<String, List<TitleBuff>> titleBuffMap;
    private final List<TitleBuff> titleBuffList;
    private final boolean isAllBuff;

    @Override
    public HandlerList getHandlers() {
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

    public PlayerTitleBuffEvent(Player player, Long titleId) {
        this.player = player;
        this.isAllBuff = false;
        this.titleBuffList = new ArrayList<>();
        this.titleBuffMap = new HashMap<>();
    }

    /**
     * 获取Player
     *
     * @return Player
     */
    public Player getPlayer() {
        return this.player;
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
     * 获取全部buff信息
     *
     * @return key 插件名 value buff集合
     */
    public Map<String, List<TitleBuff>> getTitleBuffMap() {
        return this.titleBuffMap;
    }

    /**
     * 获取全部buff信息
     *
     * @return 称号信息
     */
    public List<TitleBuff> getTitleBuffList() {
        return this.titleBuffList;
    }

    /**
     * 获取自己插件类型的buff
     *
     * @return 类型
     */
    public List<TitleBuff> getMyPluginBuffType(String pluginName) {
        return this.titleBuffMap.get(pluginName);
    }

}