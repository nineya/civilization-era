package com.nineya.civilization.era.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/**
 * 时间：2021/7/6 23:10
 * 单例数据存储bean
 *
 * @author 殇雪话诀别
 */
public class BeanFactory {
    private static final Map<String, Object> BEANS = new ConcurrentHashMap<>();

    /**
     * 初始化一个bean
     *
     * @param bean
     */
    public static void initializeBean(Object bean) {
        initializeBean(bean.getClass().getName(), bean);
    }

    /**
     * 指定bean名称初始化一个bean
     *
     * @param beanName
     * @param bean
     */
    public static void initializeBean(String beanName, Object bean) {
        if (BEANS.containsKey(beanName)) {
            throw new IllegalArgumentException("已存在同名对象：" + beanName);
        }
        BEANS.put(beanName, bean);
    }

    /**
     * 判断bean是否存在
     *
     * @param clazz
     * @return
     */
    public static boolean containsBean(Class clazz) {
        return BEANS.containsKey(clazz.getName());
    }

    /**
     * 判断bean是否存在
     *
     * @param beanName
     * @return
     */
    public static boolean containsBean(String beanName) {
        return BEANS.containsKey(beanName);
    }

    /**
     * 添加一个bean，如果对象已经存在则将覆盖原对象
     *
     * @param bean
     */
    public static void addBean(Object bean) {
        addBean(bean.getClass().getName(), bean);
    }

    /**
     * 添加一个bean，如果对象已经存在则将覆盖原对象
     *
     * @param beanName
     * @param bean
     */
    public static void addBean(String beanName, Object bean) {
        BEANS.put(beanName, bean);
    }

    /**
     * 根据bean类型查询bean
     *
     * @param beanClass
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> beanClass) {
        return getBean(beanClass.getName());
    }

    /**
     * 使用bean名称get bean
     *
     * @param beanName
     * @param <T>
     * @return
     */
    public static <T> T getBean(String beanName) {
        if (!containsBean(beanName)) {
            throw new RuntimeException(beanName + "不存在");
        }
        return (T) BEANS.get(beanName);
    }
}
