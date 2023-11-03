package com.bosir.gateway.core;

/**
 * 网关启动核心主类
 */
public class CoreBootstrap {

    public static void main(String[] args) {
        // 1、加载网关的配置信息

        // 2、插件初始化的工作

        // 3、初始化服务注册管理中心,监听动态配置的新增,修改,删除

        // 4、启动容器
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }));
    }
}
