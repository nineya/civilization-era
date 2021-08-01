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
     * 神像的血量
     */
    private int godHp;

    /**
     * 物理攻击力
     */
    protected int str;
    /**
     * 暴击率（物理攻击可以暴击）
     */
    protected double cri;

    /**
     * 护甲（物理抗性）
     */
    protected int ac;

    /**
     * 移动速度（Movement Speed）
     */
    protected int ms;
    /**
     * 攻击速度（Attack Speed）
     */
    protected int as;

    @Override
    public void onCreate() {

    }

    @Override
    public void onDemise() {

    }

    @Override
    public void addAttribute() {

    }

    @Override
    public void sufferAttack(int str, int sor) {

    }

    @Override
    public void fighting() {

    }
}
