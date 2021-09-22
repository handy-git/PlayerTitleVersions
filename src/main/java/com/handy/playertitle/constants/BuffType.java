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

    public static List<String> getBuffTypeList() {
        return new ArrayList<>(BUFF_TYPE_LIST.keySet());
    }

    public static Map<String, BuffType> getBuffTypeMap() {
        return BUFF_TYPE_LIST;
    }

    public static void put(String buffType, String buffTypeName, String pluginName) {
    }

    public static String getTypeName(String buffType) {
        return "";
    }

    public static BuffType getType(String buffTypeStr) {
        return null;
    }

    public static void remove(String buffType) {
    }

}