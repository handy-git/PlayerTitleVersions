package com.handy.playertitle.api.param;

import com.handy.playertitle.constants.BuyTypeEnum;

import java.util.List;

/**
 * 新增称号入参
 *
 * @author handy
 * @since 2.7.9
 */
public class TitleListParam {

    /**
     * 称号名称
     */
    private String titleName;

    /**
     * 购买类型
     */
    private BuyTypeEnum buyTypeEnum;

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

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public BuyTypeEnum getBuyTypeEnum() {
        return buyTypeEnum;
    }

    public void setBuyTypeEnum(BuyTypeEnum buyTypeEnum) {
        this.buyTypeEnum = buyTypeEnum;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getItemStack() {
        return itemStack;
    }

    public void setItemStack(String itemStack) {
        this.itemStack = itemStack;
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TitleBuffParam> getTitleBuffs() {
        return titleBuffs;
    }

    public void setTitleBuffs(List<TitleBuffParam> titleBuffs) {
        this.titleBuffs = titleBuffs;
    }

    public TitleParticleParam getTitleParticle() {
        return titleParticle;
    }

    public void setTitleParticle(TitleParticleParam titleParticle) {
        this.titleParticle = titleParticle;
    }
}
