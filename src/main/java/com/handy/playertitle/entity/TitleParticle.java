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

    private Integer id;

    private Integer titleId;

    private String particleType;

    private Integer superTrailsId;

    private String wingColor;

    private String wingContour;

    private String wingThirdColor;
}
