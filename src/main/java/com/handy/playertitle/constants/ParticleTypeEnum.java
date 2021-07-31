package com.handy.playertitle.constants;

/**
 * 粒子类型
 *
 * @author handy
 */
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

    ParticleTypeEnum(String particleType) {
        this.particleType = particleType;
    }

    /**
     * 粒子类型
     *
     * @return 粒子类型
     */
    public String getParticleType() {
        return particleType;
    }
}
