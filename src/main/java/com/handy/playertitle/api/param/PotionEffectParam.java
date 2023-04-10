package com.handy.playertitle.api.param;

import lombok.Data;

import java.io.Serializable;

/**
 * 药水效果
 *
 * @author handy
 */
@Data
public class PotionEffectParam implements Serializable {
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
