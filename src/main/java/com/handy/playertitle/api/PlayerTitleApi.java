package com.handy.playertitle.api;

import com.handy.playertitle.api.param.TitleBuffParam;
import com.handy.playertitle.api.param.TitleListParam;
import com.handy.playertitle.api.param.TitleParticleParam;
import com.handy.playertitle.entity.TitlePlayer;
import org.bukkit.entity.Player;

import java.util.List;

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

    public static PlayerTitleApi getInstance() {
        return PlayerTitleApi.SingletonHolder.INSTANCE;
    }

    /**
     * 新增称号购买类型
     *
     * @param buyType     购买类型
     * @param buyTypeName 购买类型名称
     * @param pluginName  注册插件名称
     * @return true/成功
     */
    public boolean addBuyType(String buyType, String buyTypeName, String pluginName) {
        return true;
    }

    /**
     * 新增称号Buff类型
     *
     * @param buffType     buff类型
     * @param buffTypeName buff类型名称
     * @param pluginName   注册插件名称
     * @return true/成功
     * @since 2.8.4
     */
    public boolean addBuffType(String buffType, String buffTypeName, String pluginName) {
        return true;
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
     * 删除称号
     *
     * @param titleId 称号id
     * @return true/成功
     * @since 2.10.1
     */
    public boolean removeTitle(Long titleId) {
        return true;
    }

    /**
     * 添加称号buff
     *
     * @param titleId    称号id
     * @param titleBuffs 称号buff
     * @return true/成功
     */
    public boolean addTitleBuff(Long titleId, List<TitleBuffParam> titleBuffs) {
        return true;
    }

    /**
     * 删除称号buff
     *
     * @param titleId 称号id
     * @return true/成功
     */
    public boolean removeTitleBuff(Long titleId) {
        return true;
    }

    /**
     * 添加称号粒子
     *
     * @param titleId            称号id
     * @param titleParticleParam 称号粒子
     * @return true/成功
     */
    public boolean addTitleParticle(Long titleId, TitleParticleParam titleParticleParam) {
        return true;
    }

    /**
     * 删除称号粒子
     *
     * @param titleId 称号id
     * @return true/成功
     */
    public boolean removeTitleParticle(Long titleId) {
        return true;
    }

    /**
     * 更改名称
     *
     * @param titleId           称号id
     * @param titleName         称号名称
     * @param isPrefixAndSuffix 是否使用默认前后缀
     * @return true/成功
     */
    public boolean update(Long titleId, String titleName, boolean isPrefixAndSuffix) {
        return true;
    }

    /**
     * 更改描述
     *
     * @param titleId     称号id
     * @param description 描述
     * @return true/成功
     */
    public boolean updateDescription(Long titleId, String description) {
        return true;
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
        return true;
    }

    /**
     * 给玩家称号
     *
     * @param playerName 玩家名
     * @param titleId    称号编码
     * @return true/成功
     * @since 1.10.1
     */
    public boolean set(String playerName, Long titleId) {
        return true;
    }

    /**
     * 获取玩家正在使用的称号信息
     *
     * @param player 玩家
     * @return 称号
     */
    public TitlePlayer findByPlayerNameAndIsUse(Player player) {
        return null;
    }

    /**
     * 获取玩家称号币
     *
     * @param playerName 玩家名
     * @return 称号币
     */
    public Long getPlayerCoinNum(String playerName) {
        return 0L;
    }

    /**
     * 增加玩家称号币
     *
     * @param playerName 玩家名
     * @param amount     数量
     * @return true/成功
     */
    public boolean addCoin(String playerName, Long amount) {
        return true;
    }

    /**
     * 减少玩家称号币
     *
     * @param playerName 玩家名
     * @param amount     数量
     * @return true/成功
     */
    public boolean subtractCoin(String playerName, Long amount) {
        return true;
    }

    /**
     * 获取玩家称号数量
     *
     * @param playerName 玩家名
     * @return 称号数量
     */
    public Integer getPlayerTitleNum(String playerName) {
        return 0;
    }

    /**
     * 移除buff
     *
     * @param player 玩家
     * @since 2.9.9
     */
    public void removeBuff(Player player) {
    }

    /**
     * 设置buff
     *
     * @param player 玩家
     * @since 2.9.9
     */
    public void setBuff(Player player) {
    }

}