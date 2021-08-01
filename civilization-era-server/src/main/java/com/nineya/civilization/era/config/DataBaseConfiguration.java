package com.nineya.civilization.era.config;

import com.nineya.civilization.era.config.properties.DataBaseProperties;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 数据库连接配置
 */
public class DataBaseConfiguration implements IConfiguration {
    private DataBaseProperties properties;

    public DataBaseConfiguration(DataBaseProperties properties) {
        this.properties = properties;
    }

    @Override
    public void config() {

    }
}
