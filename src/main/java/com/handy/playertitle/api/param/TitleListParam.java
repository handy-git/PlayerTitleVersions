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

    /**
     * 称号名称
     *
     * @return 称号名称
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * 称号名称
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    /**
     * 购买类型
     *
     * @return 购买类型
     */
    public BuyTypeEnum getBuyTypeEnum() {
        return buyTypeEnum;
    }

    /**
     * 购买类型
     */
    public void setBuyTypeEnum(BuyTypeEnum buyTypeEnum) {
        this.buyTypeEnum = buyTypeEnum;
    }

    /**
     * 金额
     *
     * @return 金额
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 金额
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 天数
     *
     * @return 天数
     */
    public Integer getDay() {
        return day;
    }

    /**
     * 天数
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * 物品
     *
     * @return 物品
     */
    public String getItemStack() {
        return itemStack;
    }

    /**
     * 物品
     */
    public void setItemStack(String itemStack) {
        this.itemStack = itemStack;
    }

    /**
     * 是否隐藏
     *
     * @return 是否隐藏
     */
    public Integer getIsHide() {
        return isHide;
    }

    /**
     * 是否隐藏
     */
    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    /**
     * 描述
     *
     * @return 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * buff列表
     *
     * @return buff列表
     */
    public List<TitleBuffParam> getTitleBuffs() {
        return titleBuffs;
    }

    /**
     * buff列表
     */
    public void setTitleBuffs(List<TitleBuffParam> titleBuffs) {
        this.titleBuffs = titleBuffs;
    }

    /**
     * 粒子列表
     *
     * @return 粒子列表
     */
    public TitleParticleParam getTitleParticle() {
        return titleParticle;
    }

    /**
     * 粒子列表
     */
    public void setTitleParticle(TitleParticleParam titleParticle) {
        this.titleParticle = titleParticle;
    }
}
