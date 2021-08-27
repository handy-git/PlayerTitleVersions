package com.handy.playertitle.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 粒子类型
 *
 * @author handy
 */
@Getter
@AllArgsConstructor
public enum ParticleTypeEnum {

    /**
     * SuperTrailsPro
     */
    SUPER_TRAILS_PRO("SuperTrailsPro"),
    /**
     * SuperTrails
     */
    SUPER_TRAILS("SuperTrails");

    private final String particleType;

}
