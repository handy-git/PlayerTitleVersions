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

    /**
     * 粒子类型
     *
     * @return 粒子类型
     */
    public ParticleTypeEnum getParticleType() {
        return particleType;
    }

    /**
     * 粒子类型
     */
    public void setParticleType(ParticleTypeEnum particleType) {
        this.particleType = particleType;
    }

    /**
     * 粒子id
     *
     * @return 粒子id
     */
    public Integer getSuperTrailsId() {
        return superTrailsId;
    }

    /**
     * 粒子id
     */
    public void setSuperTrailsId(Integer superTrailsId) {
        this.superTrailsId = superTrailsId;
    }

    /**
     * 翅膀的颜色
     *
     * @return 翅膀的颜色
     */
    public String getWingColor() {
        return wingColor;
    }

    /**
     * 翅膀的颜色
     */
    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    /**
     * 翼轮廓
     *
     * @return 翼轮廓
     */
    public String getWingContour() {
        return wingContour;
    }

    /**
     * 翼轮廓
     */
    public void setWingContour(String wingContour) {
        this.wingContour = wingContour;
    }

    /**
     * 翼的第三种颜色
     *
     * @return 翼的第三种颜色
     */
    public String getWingThirdColor() {
        return wingThirdColor;
    }

    /**
     * 翼的第三种颜色
     */
    public void setWingThirdColor(String wingThirdColor) {
        this.wingThirdColor = wingThirdColor;
    }
}
