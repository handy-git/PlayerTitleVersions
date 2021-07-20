import com.handy.playertitle.api.PlayerTitleApi;
import com.handy.playertitle.api.param.TitleBuffParam;
import com.handy.playertitle.api.param.TitleListParam;
import com.handy.playertitle.api.param.TitleParticleParam;
import com.handy.playertitle.constants.BuffTypeEnum;
import com.handy.playertitle.constants.BuyTypeEnum;
import com.handy.playertitle.constants.ParticleTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 *
 * @author handy
 */
public class ApiTest {
    public static void main(String[] args) {
        // 1. 先保存唯一id到你的插件，可以保存到yml，或者数据库
        // 拿着保存的id去查询是否有该称号，有的话就跳过，没有的话就初始化新增这个称号
        Long titleId = null;
        boolean titleRst = PlayerTitleApi.getInstance().findByTitleId(titleId);
        if (!titleRst) {
            titleId = add();
        }
        // 2. 设置玩家称号
        boolean rst = PlayerTitleApi.getInstance().set("playerName", titleId, 0);
        System.out.println("设置返回：" + rst);
    }

    /**
     * 新增测试
     *
     * @return id
     */
    public static Long add() {
        TitleListParam titleListParam = new TitleListParam();
        titleListParam.setTitleName("称号名称");
        titleListParam.setBuyTypeEnum(BuyTypeEnum.NOT);
        titleListParam.setAmount(0);
        titleListParam.setDay(0);
        titleListParam.setItemStack(null);
        titleListParam.setIsHide(0);
        titleListParam.setDescription("这是一个测试称号");

        // 添加buff
        List<TitleBuffParam> titleBuffParams = new ArrayList<>();
        TitleBuffParam titleBuffParam = new TitleBuffParam();
        titleBuffParam.setBuffType(BuffTypeEnum.ATTRIBUTE_PLUS);
        titleBuffParam.setBuffContent("物理伤害: 100");
        titleBuffParams.add(titleBuffParam);
        titleListParam.setTitleBuffs(titleBuffParams);

        // 添加粒子
        TitleParticleParam titleParticleParam = new TitleParticleParam();
        titleParticleParam.setParticleType(ParticleTypeEnum.SUPER_TRAILS_PRO);
        titleParticleParam.setSuperTrailsId(300);
        titleParticleParam.setWingColor("RED");
        titleParticleParam.setWingContour("White");
        titleParticleParam.setWingThirdColor("Black");
        titleListParam.setTitleParticle(titleParticleParam);

        Long titleId = PlayerTitleApi.getInstance().add(titleListParam);
        System.out.println("新增返回：" + titleId);
        return titleId;
    }

}
