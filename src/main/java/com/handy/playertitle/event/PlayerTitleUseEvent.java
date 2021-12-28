package com.handy.playertitle.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 玩家使用称号事件
 *
 * @author handy
 * @since 2.8.2
 */
public class PlayerTitleUseEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final Long id;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * HANDLERS
     *
     * @return HANDLERS
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * 称号使用事件
     *
     * @param player 玩家
     * @param id     称号id
     */
    public PlayerTitleUseEvent(Player player, Long id) {
        this.player = player;
        this.id = id;
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
     * 获取玩家称号id
     *
     * @return 称号信息
     */
    public Long getId() {
        return this.id;
    }

}