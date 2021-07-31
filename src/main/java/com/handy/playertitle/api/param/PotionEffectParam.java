package com.handy.playertitle.api.param;


import java.io.Serializable;

/**
 * 药水效果
 *
 * @author handy
 * @since 2.8.0
 */
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

    /**
     * 药水原名称
     *
     * @return 药水原名称
     */
    public String getPotionName() {
        return potionName;
    }

    /**
     * 药水原名称
     */
    public void setPotionName(String potionName) {
        this.potionName = potionName;
    }

    /**
     * 药水汉化名称
     *
     * @return 药水汉化名称
     */
    public String getPotionChinesizationName() {
        return potionChinesizationName;
    }

    /**
     * 药水汉化名称
     */
    public void setPotionChinesizationName(String potionChinesizationName) {
        this.potionChinesizationName = potionChinesizationName;
    }

    /**
     * 药水等级
     *
     * @return 药水等级
     */
    public Integer getPotionLevel() {
        return potionLevel;
    }

    /**
     * 药水等级
     */
    public void setPotionLevel(Integer potionLevel) {
        this.potionLevel = potionLevel;
    }

    /**
     * 是否隐藏粒子
     *
     * @return 是否隐藏粒子
     */
    public Boolean getPotionHide() {
        return potionHide;
    }

    /**
     * 是否隐藏粒子
     */
    public void setPotionHide(Boolean potionHide) {
        this.potionHide = potionHide;
    }
}
