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

    public static List<String> getBuyTypeList() {
        return new ArrayList<>(BUY_TYPE_LIST.keySet());
    }

    public static Map<String, BuyType> getBuyTypeMap() {
        return BUY_TYPE_LIST;
    }

    public static Long getLastTypeId() {
        List<Long> typeIdList = new ArrayList<>();
        for (String buyType : BUY_TYPE_LIST.keySet()) {
            typeIdList.add(BUY_TYPE_LIST.get(buyType).getBuyTypeId());
        }
        return Collections.max(typeIdList);
    }

    public static List<String> getBuyTypeListNotPermission() {
        List<String> buyType = getBuyTypeList();
        buyType.removeIf(type -> BuyTypeEnum.PERMISSION.getBuyType().equals(type));
        return buyType;
    }

    public static void put(String buyType, String buyTypeName, String pluginName) {
        BuyType type = BuyType.builder().buyType(buyType).buyTypeName(buyTypeName).buyTypeId(getLastTypeId()).pluginName(pluginName).build();
        BUY_TYPE_LIST.put(buyType, type);
    }

    public static String getTypeName(String buyType) {
        BuyType type = BUY_TYPE_LIST.get(buyType);
        return buyType != null ? type.getBuyTypeName() : "&a无";
    }

    public static String getType(Long buyTypeId) {
        for (String buyType : BUY_TYPE_LIST.keySet()) {
            BuyType type = BUY_TYPE_LIST.get(buyType);
            if (type.getBuyTypeId().equals(buyTypeId)) {
                return type.getBuyType();
            }
        }
        return null;
    }

    public static BuyType getType(String buyTypeStr) {
        for (String buyType : BUY_TYPE_LIST.keySet()) {
            BuyType type = BUY_TYPE_LIST.get(buyType);
            if (type.getBuyType().equals(buyTypeStr)) {
                return type;
            }
        }
        return null;
    }

    public static void remove(String buyType) {
        BUY_TYPE_LIST.remove(buyType);
    }

}