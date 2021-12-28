package com.handy.playertitle.constants;

import lombok.Builder;
import lombok.Getter;

import java.util.*;

/**
 * 购买类型
 *
 * @author handy
 * @since 2.8.2
 */
@Builder
public class BuyType {

    private static Map<String, BuyType> BUY_TYPE_LIST = new LinkedHashMap<>();
    @Getter
    private String buyType;
    @Getter
    private String buyTypeName;
    @Getter
    private Long buyTypeId;
    @Getter
    private String pluginName;

    /**
     * 获取全部购买类型
     *
     * @return 类型
     */
    public static List<String> getBuyTypeList() {
        return new ArrayList<>(BUY_TYPE_LIST.keySet());
    }

    /**
     * 获取购买类型
     *
     * @return 购买类型
     */
    public static Map<String, BuyType> getBuyTypeMap() {
        return BUY_TYPE_LIST;
    }

    /**
     * 获取最后一个类型id
     *
     * @return 类型id
     */
    public static Long getLastTypeId() {
        List<Long> typeIdList = new ArrayList<>();
        for (String buyType : BUY_TYPE_LIST.keySet()) {
            typeIdList.add(BUY_TYPE_LIST.get(buyType).getBuyTypeId());
        }
        return Collections.max(typeIdList);
    }

    /**
     * 获取移除权限的类型剩下的类型
     *
     * @return 类型
     */
    public static List<String> getBuyTypeListNotPermission() {
        List<String> buyType = getBuyTypeList();
        buyType.removeIf(type -> BuyTypeEnum.PERMISSION.getBuyType().equals(type));
        return buyType;
    }

    /**
     * 添加购买类型
     *
     * @param buyType     类型
     * @param buyTypeName 类型名称
     * @param pluginName  插件名
     */
    public static void put(String buyType, String buyTypeName, String pluginName) {
        BuyType type = BuyType.builder().buyType(buyType).buyTypeName(buyTypeName).buyTypeId(getLastTypeId()).pluginName(pluginName).build();
        BUY_TYPE_LIST.put(buyType, type);
    }

    /**
     * 获取类型名称
     *
     * @param buyType 类型
     * @return 类型名
     */
    public static String getTypeName(String buyType) {
        BuyType type = BUY_TYPE_LIST.get(buyType);
        return buyType != null ? type.getBuyTypeName() : "&a无";
    }

    /**
     * 跟好类型id获取类型
     *
     * @param buyTypeId 类型id
     * @return 类型
     */
    public static String getType(Long buyTypeId) {
        for (String buyType : BUY_TYPE_LIST.keySet()) {
            BuyType type = BUY_TYPE_LIST.get(buyType);
            if (type.getBuyTypeId().equals(buyTypeId)) {
                return type.getBuyType();
            }
        }
        return null;
    }

    /**
     * 跟好类型str获取类型
     *
     * @param buyTypeStr 类型str
     * @return 类型
     */
    public static BuyType getType(String buyTypeStr) {
        for (String buyType : BUY_TYPE_LIST.keySet()) {
            BuyType type = BUY_TYPE_LIST.get(buyType);
            if (type.getBuyType().equals(buyTypeStr)) {
                return type;
            }
        }
        return null;
    }

    /**
     * 移除类型
     *
     * @param buyType 购买类型
     */
    public static void remove(String buyType) {
        BUY_TYPE_LIST.remove(buyType);
    }

}