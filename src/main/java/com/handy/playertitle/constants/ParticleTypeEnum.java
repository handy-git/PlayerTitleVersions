package com.handy.playertitle.constants;

/**
 * @author handy
 */
public enum ParticleTypeEnum {

    /**
     * buff类型
     */
    SUPER_TRAILS_PRO("SuperTrailsPro"),
    SUPER_TRAILS("SuperTrails");

    private final String particleType;

    public String getParticleType() {
        return particleType;
    }

    ParticleTypeEnum(String particleType) {
        this.particleType = particleType;
    }
}
