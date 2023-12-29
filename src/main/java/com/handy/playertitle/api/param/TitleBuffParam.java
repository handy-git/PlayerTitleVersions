package com.handy.playertitle.api.param;

import com.handy.playertitle.constants.BuffTypeEnum;
import lombok.Data;

/**
 * buff效果
 *
 * @author handy
 * @since 2.7.9
 */
@Data
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
     * buff介绍
     *
     * @since 3.5.3
     */
    private String description;

    /**
     * 药水效果
     */
    private PotionEffectParam potionEffectParam;
}
