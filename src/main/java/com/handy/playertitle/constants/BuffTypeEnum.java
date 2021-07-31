package com.handy.playertitle.constants;

/**
 * buff类型
 *
 * @author handy
 */
public enum BuffTypeEnum {

    /**
     * attribute_plus
     */
    ATTRIBUTE_PLUS("attribute_plus"),
    /**
     * sx_attribute
     */
    SX_ATTRIBUTE("sx_attribute"),
    /**
     * 原版药水
     */
    POTION_EFFECT("potion_effect"),
    /**
     * 无视怪物
     */
    MONSTER_TRUCE("monster_truce"),
    /**
     * 玩家强化概率
     */
    PLAYER_INTENSIFY("player_intensify"),
    ;

    private final String buffType;

    /**
     * buff类型
     *
     * @return buff类型
     */
    public String getBuffType() {
        return buffType;
    }

    BuffTypeEnum(String buffType) {
        this.buffType = buffType;
    }
}
