package com.nineya.civilization.era;

import com.nineya.civilization.era.config.CivilizationEraConfiguration;
import com.nineya.civilization.era.config.properties.CivilizationEraProperties;
import lombok.extern.slf4j.Slf4j;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;

/**
 * @author 殇雪话诀别
 * 2021/8/1
 * 游戏应用处理类
 */
@Slf4j
public class CivilizationEraApplication {

    public static void run() {
        try {
            Yaml yaml = new Yaml();
            CivilizationEraProperties properties = yaml.loadAs(new FileInputStream("config.yaml"), CivilizationEraProperties.class);
            new CivilizationEraConfiguration(properties.getCore()).config();
            log.info("启动成功！");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
