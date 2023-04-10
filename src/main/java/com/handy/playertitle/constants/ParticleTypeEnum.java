package com.handy.playertitle.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 称号粒子类型
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
    SUPER_TRAILS("SuperTrails"),
    PLAYER_PARTICLES("PlayerParticles");

    private final String particleType;

    /**
     * 获取粒子类型
     *
     * @param particleType 类型
     * @return ParticleTypeEnum
     */
    public static ParticleTypeEnum getEnum(String particleType) {
        for (ParticleTypeEnum particleTypeEnum : ParticleTypeEnum.values()) {
            if (particleTypeEnum.getParticleType().equalsIgnoreCase(particleType)) {
                return particleTypeEnum;
            }
        }
        throw new RuntimeException("没有这种粒子类型:" + particleType);
    }

    public static List<String> getParticleTypeEnum() {
        List<String> enumList = new ArrayList<>();
        for (ParticleTypeEnum particleTypeEnum : ParticleTypeEnum.values()) {
            enumList.add(particleTypeEnum.getParticleType());
        }
        return enumList;
    }

}
