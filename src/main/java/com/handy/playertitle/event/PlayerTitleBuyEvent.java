package com.handy.playertitle.event;

import com.handy.playertitle.constants.BuyType;
import com.handy.playertitle.entity.TitleList;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 玩家购买称号事件
 *
 * @author handy
 * @since 2.8.2
 **/
public class PlayerTitleBuyEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final TitleList title;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PlayerTitleBuyEvent(Player player, TitleList title) {
        this.player = player;
        this.title = title;
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
     * 获取称号信息
     *
     * @return 称号信息
     */
    public TitleList getTitle() {
        return this.title;
    }

    /**
     * 获取购买的类型
     *
     * @return 类型
     */
    public String getBuyType() {
        return this.title.getBuyType();
    }

    /**
     * 判断是否是自己插件的类型
     *
     * @return 类型
     */
    public boolean isBuyType(String pluginName) {
        BuyType type = BuyType.getType(this.getBuyType());
        if (type == null) {
            return false;
        }
        return type.getPluginName().equals(pluginName);
    }

    /**
     * 获取需要的数量
     *
     * @return 数量
     */
    public Integer getAmount() {
        return this.title.getAmount();
    }

    /**
     * 获取需求
     *
     * @return 购买需求
     */
    public String getItemStack() {
        return this.title.getItemStack();
    }

    /**
     * 确定新增玩家称号
     */
    public void addPlayerTitle() {

    }

}