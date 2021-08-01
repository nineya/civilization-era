package com.nineya.civilization.era.robot;

import com.nineya.civilization.era.battle.IBattleground;
import com.nineya.civilization.era.people.Hero;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 */
public interface IRobot {
    /**
     * 为机器人生成英雄
     *
     * @return 英雄
     */
    Hero createHero();

    /**
     * 机器人加入战斗
     *
     * @param battleground 战场
     */
    void affiliateBattle(IBattleground battleground);
}
