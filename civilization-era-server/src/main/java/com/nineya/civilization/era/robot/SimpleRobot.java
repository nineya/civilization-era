package com.nineya.civilization.era.robot;

import com.nineya.civilization.era.battle.IBattleground;
import com.nineya.civilization.era.people.Hero;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 简单机器人
 */
public class SimpleRobot extends BaseRobot {

    public SimpleRobot(int fighting) {
        super(fighting);
    }

    public Hero createHero() {
        return null;
    }

    public void affiliateBattle(IBattleground battleground) {

    }
}
