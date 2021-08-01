package com.nineya.civilization.era.config;

import com.nineya.civilization.era.core.BeanEnum;
import com.nineya.civilization.era.config.properties.CoreProperties;

import java.util.concurrent.*;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 读取游戏配置文件
 */
public class CivilizationEraConfiguration implements IConfiguration {
    private CoreProperties properties;

    public CivilizationEraConfiguration(CoreProperties properties) {
        this.properties = properties;
    }

    /**
     * 执行配置
     */
    @Override
    public void config() {
        BeanEnum.mainThreadPool.initializeBean(mainThreadPool(properties.getMainThreadCount()));
        BeanEnum.battleThreadPool.initializeBean(mainThreadPool(properties.getBattleThreadCount()));
    }

    /**
     * 主线程池
     *
     * @param threadCount
     * @return
     */
    private ExecutorService mainThreadPool(int threadCount) {
        return new ThreadPoolExecutor(threadCount, threadCount,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
    }

    /**
     * 战斗线程池
     *
     * @param threadCount
     * @return
     */
    private ExecutorService battleThreadPool(int threadCount) {
        return new ThreadPoolExecutor(threadCount, threadCount,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
    }
}
