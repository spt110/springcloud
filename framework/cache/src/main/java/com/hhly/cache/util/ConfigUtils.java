package com.hhly.cache.util;

import org.springframework.core.env.Environment;

/**
 * @author pengchao
 * @create 2017-08-17
 * @desc 配置项工具
 */
public class ConfigUtils {
    /*
    public static String propertyIsExists(String key) {
        bool isExists = false;
        Environment environment = ApplicationContextUtil.getBean(Environment.class);
        if (environment != null) {
            isExists = true;
        }
        return isExists;
    }
    public static String getProperty(String key) {
        String result = "";
        //Environment environment = SpringUtils.getBean(Environment.class);
        Environment environment = ApplicationContextUtil.getBean(Environment.class);
        if (environment != null) {
            result = environment.getProperty(key, "");
        }
        return result;
    }
    public static String getProperty(String key, String defaultValue) {
        String result = defaultValue;
        //Environment environment = SpringUtils.getBean(Environment.class);
        Environment environment = ApplicationContextUtil.getBean(Environment.class);
        if (environment != null) {
            result = environment.getProperty(key, defaultValue);
        }
        return result;
    }
    */
}
