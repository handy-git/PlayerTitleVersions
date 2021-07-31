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

    /**
     * 药水效果
     */
    private PotionEffectParam potionEffectParam;

    /**
     * 称号buff类型
     *
     * @return 称号buff类型
     */
    public BuffTypeEnum getBuffType() {
        return buffType;
    }

    /**
     * 称号buff类型
     */
    public void setBuffType(BuffTypeEnum buffType) {
        this.buffType = buffType;
    }

    /**
     * 称号buff
     *
     * @return 称号buff
     */
    public String getBuffContent() {
        return buffContent;
    }

    /**
     * 称号buff
     */
    public void setBuffContent(String buffContent) {
        this.buffContent = buffContent;
    }

    /**
     * 药水效果
     *
     * @return 药水效果
     */
    public PotionEffectParam getPotionEffectParam() {
        return potionEffectParam;
    }

    /**
     * 药水效果
     */
    public void setPotionEffectParam(PotionEffectParam potionEffectParam) {
        this.potionEffectParam = potionEffectParam;
    }
}
