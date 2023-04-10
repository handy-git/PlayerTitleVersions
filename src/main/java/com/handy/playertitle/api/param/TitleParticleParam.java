package com.handy.playertitle.api.param;

import com.handy.playertitle.constants.ParticleTypeEnum;
import lombok.Data;

/**
 * 称号粒子
 *
 * @author handy
 * @since 2.7.9
 */
@Data
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
}
