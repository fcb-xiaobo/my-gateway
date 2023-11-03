package com.bosir.gateway.core;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/**
 * 网关配置信息加载类
 * 加载顺序
 * 运行参数 -> jvm参数 -> 环境变量 -> 配置文件 -> 内部config对象的默认属性值
 */
@Slf4j
public class GatewayConfigLoader {

    private final static String CONFIG_FILE = "gateway.properties";

    private GatewayConfig gatewayConfig=new GatewayConfig();

    public static GatewayConfig getRapidConfig() {
        return null;
    }
    public GatewayConfig load(String args[]){
        //加载配置
        try(InputStream is = GatewayConfigLoader.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if(is !=null){
                Properties properties=new Properties();
                properties.load(is);
            }
        } catch (IOException e) {
            log.warn("#GatewayConfigLoader# load config file {} is fail , {} ",CONFIG_FILE,e);
        }
        {
            // 环境变量
            Map<String, String> envConfig = System.getenv();
            Properties properties = new Properties();
            properties.putAll(envConfig);
        }

        // JVM参数
        {
            Properties properties = System.getProperties();
        }

        // 运行参数 --xx=xx --enable=true
        {
            if(args !=null && args.length > 0){
                Properties properties=new Properties();
                for (String arg:args) {
                    if(arg.startsWith("--")&&arg.contains("=")){
                        properties.put(arg.substring(2,arg.indexOf("=")),arg.substring(arg.indexOf("=")+1));
                    }
                }
            }
        }
        return gatewayConfig;
    }
}
