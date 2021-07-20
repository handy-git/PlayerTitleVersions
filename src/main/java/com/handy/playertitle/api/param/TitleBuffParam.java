package com.handy.playertitle.api.param;

import com.handy.playertitle.constants.BuffTypeEnum;

/**
 * buff效果
 *
 * @author handy
 * @since 2.7.9
 */
public class TitleBuffParam {

    /**
     * 称号buff类型
     */
    private BuffTypeEnum buffType;

    /**
     * 称号buff
     */
    private String buffContent;

    public BuffTypeEnum getBuffType() {
        return buffType;
    }

    public void setBuffType(BuffTypeEnum buffType) {
        this.buffType = buffType;
    }

    public String getBuffContent() {
        return buffContent;
    }

    public void setBuffContent(String buffContent) {
        this.buffContent = buffContent;
    }
}
