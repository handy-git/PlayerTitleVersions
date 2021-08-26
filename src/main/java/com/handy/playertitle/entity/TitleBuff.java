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
    private Long id;

    /**
     * 称号id
     */
    private Long titleId;

    /**
     * 称号buff类型
     */
    private String buffType;

    /**
     * 称号buff
     */
    private String buffContent;
}
