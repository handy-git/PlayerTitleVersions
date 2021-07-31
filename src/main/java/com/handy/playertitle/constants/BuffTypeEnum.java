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
     * buff类型
     */
    ATTRIBUTE_PLUS("attribute_plus"),
    SX_ATTRIBUTE("sx_attribute"),
    POTION_EFFECT("potion_effect"),
    MONSTER_TRUCE("monster_truce"),
    PLAYER_INTENSIFY("player_intensify"),
    ;

    private final String buffType;

}
