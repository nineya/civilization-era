package com.nineya.civilization.era.player.match;

import com.nineya.civilization.era.core.BeanEnum;

import java.util.concurrent.ExecutorService;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 匹配竞争对手
 */
public class MatchOpponent {
    /**
     * 主线程池
     */
    private ExecutorService mainThreadPool = BeanEnum.mainThreadPool.getBean();
}
