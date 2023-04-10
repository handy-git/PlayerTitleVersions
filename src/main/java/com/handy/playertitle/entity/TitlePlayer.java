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

    private Integer id;

    private String playerName;

    private String playerUuid;

    private Integer titleId;

    private String titleName;

    private Date expirationTime;

    private Boolean isUseShow;

    private Boolean isUseBuff;

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
