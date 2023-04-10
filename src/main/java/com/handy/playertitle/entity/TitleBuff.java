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

    private Integer id;

    private Integer titleId;

    private String buffType;

    private String buffContent;

    /**
     * 插件名称
     */
    private String pluginName;
}
