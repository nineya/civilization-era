package com.nineya.civilization.era.config.properties;

import lombok.Data;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 */
@Data
public class CivilizationEraProperties {
    /**
     * 游戏核心配置
     */
    private CoreProperties core = new CoreProperties();
    /**
     * 游戏数据库相关配置
     */
    private DataBaseProperties dataBase = new DataBaseProperties();
}
