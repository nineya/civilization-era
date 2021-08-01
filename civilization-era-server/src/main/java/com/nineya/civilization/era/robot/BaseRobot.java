package com.nineya.civilization.era.robot;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 */
public abstract class BaseRobot implements IRobot {
    /**
     * 玩家综合战斗力（英雄加上场兵种战斗力）
     */
    protected int fighting;

    public BaseRobot(int fighting) {
        this.fighting = fighting;
    }
}
