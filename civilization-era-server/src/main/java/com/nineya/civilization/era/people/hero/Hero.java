package com.nineya.civilization.era.people.hero;

import com.nineya.civilization.era.people.BasePeople;
import com.nineya.civilization.era.people.IPeople;

import java.util.List;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 英雄
 */
public class Hero extends BasePeople implements IPeople {
    /**
     * 英雄具有的金币数
     */
    private int money;
    /**
     * 英雄携带的兵种集团
     */
    private List<IPeople> corps;
}
