package com.handy.playertitle.api.param;

import com.handy.playertitle.constants.ParticleTypeEnum;

/**
 * 称号粒子
 *
 * @author handy
 * @since 2.7.9
 */
public class TitleParticleParam {

    /**
     * 粒子类型
     */
    private ParticleTypeEnum particleType;

    /**
     * 粒子id
     */
    private Integer superTrailsId;

    /**
     * 翅膀的颜色
     */
    private String wingColor;

    /**
     * 翼轮廓
     */
    private String wingContour;

    /**
     * 翼的第三种颜色
     */
    private String wingThirdColor;

    public ParticleTypeEnum getParticleType() {
        return particleType;
    }

    public void setParticleType(ParticleTypeEnum particleType) {
        this.particleType = particleType;
    }

    public Integer getSuperTrailsId() {
        return superTrailsId;
    }

    public void setSuperTrailsId(Integer superTrailsId) {
        this.superTrailsId = superTrailsId;
    }

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getWingContour() {
        return wingContour;
    }

    public void setWingContour(String wingContour) {
        this.wingContour = wingContour;
    }

    public String getWingThirdColor() {
        return wingThirdColor;
    }

    public void setWingThirdColor(String wingThirdColor) {
        this.wingThirdColor = wingThirdColor;
    }
}
