package com.nineya.civilization.era.infrastructure.config.properties;

import lombok.Data;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 */
@Data
public class CoreProperties {
    /**
     * 游戏主线程线程池大小
     */
    private int mainThreadCount = 8;
    /**
     * 用于监听游戏战斗状态线程的线程池大小
     */
    private int battleThreadCount = 8;
}
