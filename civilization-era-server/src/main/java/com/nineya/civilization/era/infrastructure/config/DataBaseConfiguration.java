package com.nineya.civilization.era.infrastructure.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 数据库连接配置
 */
public class DataBaseConfiguration implements IConfiguration {
    private HikariConfig config;

    public DataBaseConfiguration(HikariConfig config) {
        this.config = config;
    }

    @Override
    public void config() {

    }

    private HikariDataSourceFactory hikariDataSourceFactory() {
        HikariDataSource dataSource = new HikariDataSource(config);
        return new HikariDataSourceFactory(dataSource);
    }
}
