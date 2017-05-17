package com.nit.reservoir.core.utils;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * resource 目录下的 配置文件获取
 * User: zhoujingjie
 * Date: 14-3-31
 * Time: 上午9:29
 */
public class PropertiesUtil {
    private static Map<String, Properties> propertiesMap = new HashMap<String, Properties>();
    private static final Logger LOG = Logger.getLogger(PropertiesUtil.class);

    /**
     * 获取config.properties 中的property
     *
     * @param key 参数名
     * @return property
     */
    public static String getProperty(String key) {
        //如果是windows操作系统
//        if (System.getProperty("os.name").indexOf("Linux") != -1) {
//            return getProperty(key, "config-linux.properties");
//        }
        return getProperty(key, "config.properties");
    }

    /**
     * 根据properties name获取property
     *
     * @param key          属性名
     * @param propertyName 文件名
     * @return 属性名对应的值
     */
    public static synchronized String getProperty(String key, String propertyName) {
        if (key == null)
            return null;
        Properties properties = propertiesMap.get(propertyName);
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(propertyName));
                propertiesMap.put(propertyName, properties);
                return properties.getProperty(key);
            } catch (IOException e) {
                LOG.error(e);
                return null;
            }
        }
        return properties.getProperty(key);
    }
}
