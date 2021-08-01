package com.nineya.civilization.era.battle;

import com.nineya.civilization.era.people.God;
import com.nineya.civilization.era.people.Hero;
import lombok.Data;

import java.util.List;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 战场，战斗分红蓝双方，双方各自有英雄阵营，英雄由玩家控制可以进行出兵操作
 * 双发中任意一方神像被击碎将战斗失败
 */
public class BaseBattleground implements IBattleground {
    /**
     * 战场大小
     */
    private int battlegroundSize;

    /**
     * 蓝方神像
     */
    protected God blueGod;
    /**
     * 蓝方英雄
     */
    protected List<Hero> blueHero;
    /**
     * 红方神像
     */
    protected God redGod;
    /**
     * 红方英雄
     */
    protected List<Hero> redHero;
    /**
     * 战场观察者，用于观察战场状态
     */
    protected List<IBattleObserver> battleObservers;

    public void onStart() {

    }
}
