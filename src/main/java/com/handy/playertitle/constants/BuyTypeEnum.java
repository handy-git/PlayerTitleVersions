package com.handy.playertitle.constants;

/**
 * 购买类型
 *
 * @author handy
 */
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

    public String getBuyType() {
        return buyType;
    }

    BuyTypeEnum(String buyType) {
        this.buyType = buyType;
    }
}
