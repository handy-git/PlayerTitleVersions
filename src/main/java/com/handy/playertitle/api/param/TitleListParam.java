package com.handy.playertitle.api.param;

import lombok.Data;

import java.util.List;

/**
 * 新增称号入参
 *
 * @author handy
 * @since 2.7.9
 */
@Data
public class TitleListParam {

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
    private List<TitleBuffParam> titleBuffs;

    /**
     * 粒子列表
     */
    private TitleParticleParam titleParticle;

    /**
     * 是否添加默认的前后缀
     */
    private Boolean isPrefixAndSuffix;
}
