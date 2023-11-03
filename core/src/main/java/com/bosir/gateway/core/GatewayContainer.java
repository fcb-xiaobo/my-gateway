package com.bosir.gateway.core;

import com.bosir.gateway.core.netty.NettyHttpClient;
import com.bosir.gateway.core.netty.NettyHttpServer;
import com.bosir.gateway.core.netty.NettyHttpServerHandler;

/**
 * 启动容器的主类,主要负责
 * 1、http接收的服务
 * 2、http的转发类
 * 3、核心处理器
 */
public class GatewayContainer implements LifeCycle{

    private final GatewayConfig gatewayConfig;


    private NettyHttpClient nettyHttpClient;

    private NettyHttpServer nettyHttpServer;

    private NettyHttpServerHandler nettyHttpServerHandler;

    @Override
    public void init() {

    }

    @Override
    public void start() {
        nettyHttpClient.start();
        nettyHttpServer.start();
        nettyHttpServerHandler.start();

    }

    @Override
    public void shutdown() {
        nettyHttpClient.shutdown();
        nettyHttpServer.shutdown();
        nettyHttpServerHandler.shutdown();

    }
}
