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
    ATTRIBUTE_PLUS("attribute_plus", "AttributePlus"),
    SX_ATTRIBUTE("sx_attribute", "SX-Attribute"),
    POTION_EFFECT("potion_effect", "potion_effect"),
    MMO_ITEMS("MMOItems", "MMOItems"),
    ATTRIBUTE_SYSTEM("AttributeSystem", "AttributeSystem"),
    ;

    private final String buffType;
    private final String buffTypeName;

    public static BuffTypeEnum getEnum(String buffType) {
        for (BuffTypeEnum buyTypeEnum : BuffTypeEnum.values()) {
            if (buyTypeEnum.getBuffType().equalsIgnoreCase(buffType)) {
                return buyTypeEnum;
            }
        }
        return null;
    }

}