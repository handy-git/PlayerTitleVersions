package com.handy.playertitle.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 玩家称号
 *
 * @author handy
 */
@Data
public class TitlePlayer implements Serializable {

    /**
     * ID
     */
    private Integer id;

    /**
     * 玩家名称
     */
    private String playerName;

    /**
     * 玩家uuid
     */
    private String playerUuid;

    /**
     * 称号id
     */
    private Integer titleId;

    /**
     * 称号名称
     */
    private String titleName;

    /**
     * 到期时间
     */
    private Date expirationTime;

    /**
     * 展示称号
     */
    private Boolean isUseShow;

    /**
     * 属性称号
     */
    private Boolean isUseBuff;

    /**
     * 粒子称号
     */
    private Boolean isUseParticle;

    /**
     * buff列表
     */
    private List<TitleBuff> titleBuffs = new ArrayList<>();

    /**
     * 称号粒子
     */
    private TitleParticle titleParticle;

    /**
     * 称号描述
     */
    private String description;

}
