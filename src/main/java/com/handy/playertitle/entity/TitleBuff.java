package com.handy.playertitle.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 称号buff
 *
 * @author handy
 */
@Data
public class TitleBuff implements Serializable {

    /**
     * ID
     */
    private Integer id;

    /**
     * 称号id
     */
    private Integer titleId;

    /**
     * buff类型
     */
    private String buffType;

    /**
     * buff
     */
    private String buffContent;

    /**
     * buff介绍
     *
     * @since 3.5.3
     */
    private String description;

    /**
     * 插件名称
     */
    private String pluginName;
}
