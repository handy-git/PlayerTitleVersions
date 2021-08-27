package com.handy.playertitle.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * buff类型
 *
 * @author handy
 */
@Getter
@AllArgsConstructor
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

}
