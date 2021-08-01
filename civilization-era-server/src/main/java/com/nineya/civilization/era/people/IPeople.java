package com.nineya.civilization.era.people;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 人物基本操作接口
 */
public interface IPeople {
    /**
     * 创建人物生命周期
     */
    void onCreate();

    /**
     * 人物死亡生命周期
     */
    void onDemise();

    /**
     * 给人物附加属性
     */
    void addAttribute();

    /**
     * 受到攻击
     *
     * @param str 物理攻击力
     * @param sor 魔法攻击力
     */
    void sufferAttack(int str, int sor);
}
