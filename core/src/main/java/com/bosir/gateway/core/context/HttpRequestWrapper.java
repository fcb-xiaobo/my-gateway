package com.bosir.gateway.core.context;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

public class HttpRequestWrapper {
    private FullHttpRequest fullHttpRequest;

    private ChannelHandlerContext ctx;
}
