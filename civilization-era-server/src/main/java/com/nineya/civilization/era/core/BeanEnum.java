package com.nineya.civilization.era.core;

import com.nineya.civilization.era.core.BeanFactory;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * bean 工厂对象存取辅助
 */
public enum BeanEnum {
    /**
     * 核心线程池
     */
    mainThreadPool,
    /**
     * 战斗线程池
     */
    battleThreadPool;

    /**
     * 初始化bean
     *
     * @param bean
     */
    public void initializeBean(Object bean) {
        BeanFactory.initializeBean(name(), bean);
    }

    /**
     * 判断bean是否存在
     *
     * @return
     */
    public boolean containsBean() {
        return BeanFactory.containsBean(name());
    }

    /**
     * 添加一个bean，如果对象已经存在则将覆盖原对象
     *
     * @param bean
     */
    public void addBean(Object bean) {
        BeanFactory.addBean(name(), bean);
    }

    /**
     * 获取bean对象
     *
     * @param <T>
     * @return
     */
    public <T> T getBean() {
        return BeanFactory.getBean(name());
    }
}
