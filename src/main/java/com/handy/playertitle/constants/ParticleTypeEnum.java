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
     * 粒子类型
     */
    SUPER_TRAILS_PRO("SuperTrailsPro"),
    SUPER_TRAILS("SuperTrails");

    private final String particleType;

}
