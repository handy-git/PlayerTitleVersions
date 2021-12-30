package com.handy.playertitle.constants;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * buff类型
 *
 * @author handy
 * @since 2.8.4
 */
@Builder
public class BuffType {

    private static Map<String, BuffType> BUFF_TYPE_LIST = new LinkedHashMap<>();
    @Getter
    private String buffType;
    @Getter
    private String buffTypeName;
    @Getter
    private String pluginName;

    /**
     * 获取类型list
     *
     * @return 类型liet
     */
    public static List<String> getBuffTypeList() {
        return new ArrayList<>(BUFF_TYPE_LIST.keySet());
    }

    /**
     * 获取类型map
     *
     * @return 全部类型map
     */
    public static Map<String, BuffType> getBuffTypeMap() {
        return BUFF_TYPE_LIST;
    }

    /**
     * 新增类型
     *
     * @param buffType     buff类型
     * @param buffTypeName buff类型名称
     * @param pluginName   插件名
     */
    public static void put(String buffType, String buffTypeName, String pluginName) {
    }

    /**
     * 获取类型名
     *
     * @param buffType buffType
     * @return 类型名
     */
    public static String getTypeName(String buffType) {
        return "";
    }

    /**
     * 获取类型
     *
     * @param buffTypeStr 类型
     * @return BuffType
     */
    public static BuffType getType(String buffTypeStr) {
        return null;
    }

    /**
     * 删除类型
     *
     * @param buffType 类型
     */
    public static void remove(String buffType) {
    }

}