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
     * 购买类型
     */
    NOT("not"),
    VAULT("vault"),
    PLAYER_POINTS("playerPoints"),
    COIN("coin"),
    ITEM_STACK("itemStack"),
    PERMISSION("permission"),
    ACTIVITY("activity");

    private final String buyType;

}
