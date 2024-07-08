package com.handy.playertitle.api;

import com.handy.playertitle.api.param.TitleBuffParam;
import com.handy.playertitle.api.param.TitleListParam;
import com.handy.playertitle.api.param.TitleParticleParam;
import com.handy.playertitle.entity.TitlePlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        return SingletonHolder.INSTANCE;
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
    @Deprecated
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
     * 给玩家称号
     *
     * @param playerName 玩家名
     * @param playerUuid 玩家uid
     * @param titleId    称号编码
     * @param day        时间，0为永久
     * @return true/成功
     * @since 4.0.0
     */
    public boolean set(String playerName, UUID playerUuid, Long titleId, int day) {
        return true;
    }

    /**
     * 根据titleId和玩家名删除 玩家对应称号
     *
     * @param playerName 玩家名
     * @param titleId    称号id
     * @return true成功
     * @since 2.10.1
     */
    @Deprecated
    public boolean removePlayerTitle(String playerName, Long titleId) {
        return true;
    }

    /**
     * 根据titleId和玩家Uid删除 玩家对应称号
     *
     * @param playerUuid 玩家Uid
     * @param titleId    称号id
     * @return true成功
     * @since 2.10.1
     */
    public boolean removePlayerTitle(UUID playerUuid, Long titleId) {
        return true;
    }

    /**
     * 获取玩家正在使用的展示称号信息
     *
     * @param player 玩家
     * @return 展示称号
     */
    @Deprecated
    public TitlePlayer findByPlayerNameAndIsUse(Player player) {
        return null;
    }

    /**
     * 获取玩家正在使用的展示称号信息
     *
     * @param player 玩家
     * @return 展示称号
     * @since 4.0.0
     */
    public TitlePlayer findByPlayerUuidAndIsUse(Player player) {
        return null;
    }

    /**
     * 获取玩家正在使用的属性称号信息
     *
     * @param player 玩家
     * @return 属性称号
     * @since 3.3.0
     */
    @Deprecated
    public TitlePlayer findByPlayerNameAndIsUseBuff(Player player) {
        return null;
    }

    /**
     * 获取玩家正在使用的属性称号信息
     *
     * @param player 玩家
     * @return 属性称号
     * @since 4.0.0
     */
    public TitlePlayer findByPlayerUuidAndIsUseBuff(Player player) {
        return null;
    }

    /**
     * 获取玩家正在使用的粒子称号信息
     *
     * @param player 玩家
     * @return 粒子称号
     * @since 3.3.0
     */
    @Deprecated
    public TitlePlayer findByPlayerNameAndIsUseParticle(Player player) {
        return null;
    }

    /**
     * 获取玩家正在使用的粒子称号信息
     *
     * @param player 玩家
     * @return 粒子称号
     * @since 4.0.0
     */
    public TitlePlayer findByPlayerUuidAndIsUseParticle(Player player) {
        return null;
    }

    /**
     * 获取玩家称号币
     *
     * @param playerName 玩家名
     * @return 称号币
     */
    @Deprecated
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
    @Deprecated
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
    @Deprecated
    public boolean subtractCoin(String playerName, Long amount) {
        return true;
    }

    /**
     * 获取玩家称号币
     *
     * @param playerUuid 玩家uid
     * @return 称号币
     * @since 4.0.0
     */
    public Integer getPlayerCoinNum(UUID playerUuid) {
        return 0;
    }

    /**
     * 增加玩家称号币
     *
     * @param playerUuid 玩家uid
     * @param amount     数量
     * @return true/成功
     * @since 4.0.0
     */
    public boolean addCoin(UUID playerUuid, Integer amount) {
        return true;
    }

    /**
     * 减少玩家称号币
     *
     * @param playerUuid 玩家uid
     * @param amount     数量
     * @return true/成功
     * @since 4.0.0
     */
    public boolean subtractCoin(UUID playerUuid, Integer amount) {
        return true;
    }

    /**
     * 设置玩家称号币
     *
     * @param playerUuid 玩家uid
     * @param amount     数量
     * @return true/成功
     * @since 4.0.0
     */
    public boolean setCoin(UUID playerUuid, Integer amount) {
        return true;
    }

    /**
     * 获取玩家称号数量
     *
     * @param playerName 玩家名
     * @return 称号数量
     */
    @Deprecated
    public Integer getPlayerTitleNum(String playerName) {
        return 0;
    }

    /**
     * 获取玩家称号数量
     *
     * @param playerUuid 玩家Uid
     * @return 称号数量
     * @since 4.0.0
     */
    public Integer getPlayerTitleNum(UUID playerUuid) {
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

    /**
     * 玩家是否有对应的称号ID
     *
     * @param playerName 玩家名称
     * @param titleId    称号id
     * @return true 有, false 无
     * @since 3.1.1
     */
    @Deprecated
    public boolean playerExistTitleId(String playerName, Integer titleId) {
        return true;
    }

    /**
     * 玩家是否有对应的称号ID
     *
     * @param playerUuid 玩家Uid
     * @param titleId    称号id
     * @return true 有, false 无
     * @since 4.0.0
     */
    public boolean playerExistTitleId(UUID playerUuid, Integer titleId) {
        return true;
    }

    /**
     * 获取玩家所有称号ID
     *
     * @param playerName 玩家名称
     * @return 所有称号ID
     * @since 3.4.1
     */
    @Deprecated
    public List<Integer> findAllTitleIdByPlayerName(String playerName) {
        return new ArrayList<>();
    }

    /**
     * 获取玩家所有称号ID
     *
     * @param playerUuid 玩家uid
     * @return 所有称号ID
     * @since 4.0.0
     */
    public List<Integer> findAllTitleIdByPlayerUuid(UUID playerUuid) {
        return new ArrayList<>();
    }

}