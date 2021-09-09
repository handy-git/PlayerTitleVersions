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

    private Long id;

    /**
     * 玩家名称
     */
    private String playerName;

    /**
     * 称号id
     */
    private Long titleId;

    /**
     * 称号name
     */
    private String titleName;

    /**
     * 到期时间
     */
    private Date expirationTime;

    /**
     * 是否使用
     */
    private Integer isUse;

    /**
     * buff列表
     */
    private List<TitleBuff> titleBuffs = new ArrayList<>();

    /**
     * 称号粒子
     */
    private TitleParticle titleParticle;

    /**
     * 描述
     */
    private String description;

}
