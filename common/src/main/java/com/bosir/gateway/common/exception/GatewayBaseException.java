package com.bosir.gateway.common.exception;

import com.bosir.gateway.common.enums.ResponseCode;

/**
 * 网关内部基础异常类
 */
public class GatewayBaseException extends RuntimeException {

    public GatewayBaseException() {

    }

    protected ResponseCode responseCode;

    public GatewayBaseException(String message, ResponseCode responseCode) {
        super(message);
        this.responseCode = responseCode;
    }

    public GatewayBaseException(String message, ResponseCode responseCode, Throwable cause) {
        super(message, cause);
        this.responseCode = responseCode;
    }

    public GatewayBaseException(ResponseCode responseCode, Throwable cause) {
        super(cause);
        this.responseCode = responseCode;
    }

    public GatewayBaseException(String message, Throwable cause,
                                boolean enableSuppression, boolean writableStackTrace, ResponseCode responseCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.responseCode = responseCode;
    }

    public ResponseCode getCode() {
        return responseCode;
    }
}
