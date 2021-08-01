package com.nineya.civilization.era;

import com.nineya.civilization.era.config.CivilizationEraConfiguration;
import com.nineya.civilization.era.config.properties.CivilizationEraProperties;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 游戏应用处理类
 */
public class CivilizationEraApplication {

    public static void run() {
        try {
            Yaml yaml = new Yaml();
            CivilizationEraProperties properties = yaml.loadAs(new FileInputStream("config.yaml"), CivilizationEraProperties.class);

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
