package com.handy.playertitle.api;

import com.handy.playertitle.api.param.TitleListParam;

/**
 * PlayerTitleApi
 *
 * @author handy
 * @since 2.7.9
 */
public class PlayerTitleApi {

    private PlayerTitleApi() {
    }

    private static class SingletonHolder {
        private static final PlayerTitleApi INSTANCE = new PlayerTitleApi();
    }

    /**
     * 获取 INSTANCE
     *
     * @return INSTANCE
     */
    public static PlayerTitleApi getInstance() {
        return PlayerTitleApi.SingletonHolder.INSTANCE;
    }

    /**
     * 查询称号
     *
     * @param titleId 称号唯一编号id
     * @return true/存在
     */
    public boolean findByTitleId(Long titleId) {
        return true;
    }

    /**
     * 新增称号
     *
     * @param titleListParam 入参
     * @return 称号唯一编号id，请保存好
     */
    public Long add(TitleListParam titleListParam) {
        return 0L;
    }

    /**
     * 给玩家称号
     *
     * @param playerName 玩家名
     * @param titleId    称号编码
     * @param day        时间，0为永久
     * @return true/成功
     */
    public boolean set(String playerName, Long titleId, int day) {
        return false;
    }

}