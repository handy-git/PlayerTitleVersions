package com.handy.playertitle.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 购买类型
 *
 * @author handy
 */
@Getter
@AllArgsConstructor
public enum BuyTypeEnum {
    /**
     * 全部
     */
    ALL("all", 0),
    /**
     * 白嫖
     */
    NOT("not", 1),
    /**
     * 金币
     */
    VAULT("vault", 2),
    /**
     * 点券
     */
    PLAYER_POINTS("playerPoints", 3),
    /**
     * 称号币
     */
    COIN("coin", 4),
    /**
     * 物品
     */
    ITEM_STACK("itemStack", 5),
    /**
     * 权限
     */
    PERMISSION("permission", 6),
    /**
     * 活动
     */
    ACTIVITY("activity", 7);

    private final String buyType;
    private final Integer buyTypeId;

    /**
     * 获取全部列表
     *
     * @return 列表
     */
    public static List<String> getBuyTypeList() {
        List<String> list = new ArrayList<>();
        for (BuyTypeEnum buyTypeEnum : BuyTypeEnum.values()) {
            list.add(buyTypeEnum.buyType);
        }
        list.removeIf(type -> BuyTypeEnum.ALL.getBuyType().equals(type));
        return list;
    }

    /**
     * 获取不包含权限的列表
     *
     * @return 列表
     */
    public static List<String> getEnumListNotPermission() {
        List<String> buyTypeList = getBuyTypeList();
        buyTypeList.removeIf(type -> BuyTypeEnum.PERMISSION.getBuyType().equals(type));
        return buyTypeList;
    }

    /**
     * 获取对应枚举
     *
     * @param buyType 类型
     * @return 枚举
     */
    public static BuyTypeEnum getEnum(String buyType) {
        for (BuyTypeEnum buyTypeEnum : BuyTypeEnum.values()) {
            if (buyTypeEnum.getBuyType().equalsIgnoreCase(buyType)) {
                return buyTypeEnum;
            }
        }
        return null;
    }


    /**
     * 获取对应枚举
     *
     * @param buyType 类型
     * @return 枚举
     */
    public static BuyTypeEnum getEnumThrow(String buyType) {
        return null;
    }

    /**
     * 获取对应枚举
     *
     * @param buyTypeId 类型Id
     * @return 枚举
     */
    public static BuyTypeEnum getEnum(Integer buyTypeId) {
        for (BuyTypeEnum buyTypeEnum : BuyTypeEnum.values()) {
            if (buyTypeEnum.getBuyTypeId().equals(buyTypeId)) {
                return buyTypeEnum;
            }
        }
        return null;
    }

    /**
     * 获取下一个枚举
     *
     * @param buyType 类型
     * @return 枚举
     */
    public static String getNextEnum(String buyType) {
        BuyTypeEnum anEnum = getEnum(buyType);
        if (anEnum == null) {
            return BuyTypeEnum.ALL.getBuyType();
        }
        int num = anEnum.getBuyTypeId() + 1;
        if (num > 7) {
            num = 0;
        }
        for (BuyTypeEnum buyTypeEnum : BuyTypeEnum.values()) {
            if (buyTypeEnum.getBuyTypeId() == num) {
                return buyTypeEnum.getBuyType();
            }
        }
        return BuyTypeEnum.ALL.getBuyType();
    }

}