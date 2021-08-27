package com.handy.playertitle.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 购买类型
 *
 * @author handy
 */
@Getter
@AllArgsConstructor
public enum BuyTypeEnum {
    /**
     * 无
     */
    NOT("not"),
    /**
     * 金币
     */
    VAULT("vault"),
    /**
     * 点券
     */
    PLAYER_POINTS("playerPoints"),
    /**
     * 称号币
     */
    COIN("coin"),
    /**
     * 物品
     */
    ITEM_STACK("itemStack"),
    /**
     * 权限
     */
    PERMISSION("permission"),
    /**
     * 活动
     */
    ACTIVITY("activity");

    private final String buyType;

}