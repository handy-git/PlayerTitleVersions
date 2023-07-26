package com.handy.playertitle.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 称号粒子
 *
 * @author handy
 */
@Data
public class TitleParticle implements Serializable {

    /**
     * ID
     */
    private Integer id;

    /**
     * 称号id
     */
    private Integer titleId;

    /**
     * 粒子类型
     */
    private String particleType;

    /**
     * 粒子id
     */
    private Integer superTrailsId;

    /**
     * 翅膀的颜色 or PlayerParticles的粒子效果
     */
    private String wingColor;

    /**
     * 翼轮廓 or PlayerParticles的粒子类型
     */
    private String wingContour;

    /**
     * 翼的第三种颜色 or PlayerParticles的粒子颜色
     */
    private String wingThirdColor;
}
