package com.nineya.civilization.era.robot;

import com.nineya.civilization.era.battle.IBattleground;
import com.nineya.civilization.era.people.hero.Hero;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 新手机器人
 */
public class BeginnerRobot extends BaseRobot {

    public BeginnerRobot(int fighting) {
        super(fighting);
    }

    public Hero createHero() {
        Hero hero = new Hero();
        return hero;
    }

    public void affiliateBattle(IBattleground battleground) {

    }
}
