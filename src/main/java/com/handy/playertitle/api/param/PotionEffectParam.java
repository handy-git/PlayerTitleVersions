package com.handy.playertitle.api.param;


import lombok.Data;

/**
 * 药水效果
 *
 * @author handy
 * @since 2.8.0
 */
@Data
public class PotionEffectParam {
    /**
     * 药水原名称
     */
    private String potionName;
    /**
     * 药水汉化名称
     */
    private String potionChinesizationName;
    /**
     * 药水等级
     */
    private Integer potionLevel;
    /**
     * 是否隐藏粒子
     */
    private Boolean potionHide = true;

}