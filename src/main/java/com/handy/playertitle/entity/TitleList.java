package com.handy.playertitle.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 称号列表
 *
 * @author handy
 */
@Data
public class TitleList implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 称号名称
     */
    private String titleName;

    /**
     * 购买类型
     */
    private String buyType;

    /**
     * 金额
     */
    private Integer amount;

    /**
     * 天数
     */
    private Integer day;

    /**
     * 物品
     */
    private String itemStack;

    /**
     * 是否隐藏
     */
    private Integer isHide;

    /**
     * 描述
     */
    private String description;

    /**
     * buff列表
     */
    private List<TitleBuff> titleBuffs;

    /**
     * 粒子列表
     */
    private TitleParticle titleParticle;
}
