package com.nineya.civilization.era.infrastructure.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 */
public class HikariDataSourceFactory extends UnpooledDataSourceFactory {

    public HikariDataSourceFactory(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
