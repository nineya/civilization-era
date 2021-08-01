package com.nineya.civilization.era.people;

import lombok.Data;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 游戏角色，包含游戏的一些基本属性
 */
@Data
public class BasePeople implements IPeople {

    /**
     * 血量（Hit point）
     */
    protected int hp;
    /**
     * 法力值（Magic Point）
     */
    protected int mp;

    /**
     * 物理攻击力
     */
    protected int str;
    /**
     * 暴击率（物理攻击可以暴击）
     */
    protected double cri;
    /**
     * 魔法攻击力
     */
    protected int sor;

    /**
     * 护甲（物理抗性）
     */
    protected int ac;
    /**
     * 躲闪概率,物理攻击可以躲闪（Dodge Chance）
     */
    protected double dc;
    /**
     * 魔法抗性（Magic Resist）
     */
    protected double mr;

    /**
     * 移动速度（Movement Speed）
     */
    protected int ms;
    /**
     * 攻击速度（Attack Speed）
     */
    protected int as;

    public void onCreate() {

    }

    public void onDemise() {

    }

    public void addAttribute() {

    }

    public void sufferAttack(int str, int sor) {

    }
}
