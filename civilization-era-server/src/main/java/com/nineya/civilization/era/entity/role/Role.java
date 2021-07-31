package com.nineya.civilization.era.entity.role;

import lombok.Data;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 游戏角色，包含游戏的一些基本属性
 */
@Data
public class Role {

    /**
     * 血量（Hit point）
     */
    private int hp;
    /**
     * 法力值（Magic Point）
     */
    private int mp;

    /**
     * 物理攻击力
     */
    private int str;
    /**
     * 暴击率
     */
    private double cri;
    /**
     * 魔法攻击力
     */
    private int sor;

    /**
     * 护甲（物理抗性）
     */
    private int ac;
    /**
     * 躲闪概率,物理攻击可以躲闪（Dodge Chance）
     */
    private double dc;
    /**
     * 魔法抗性（Magic Resist）
     */
    private double mr;

    /**
     * 移动速度（Movement Speed）
     */
    private int ms;
    /**
     * 攻击速度（Attack Speed）
     */
    private int as;
}
