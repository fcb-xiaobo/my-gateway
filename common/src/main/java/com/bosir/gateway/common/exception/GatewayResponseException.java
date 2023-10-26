package com.bosir.gateway.common.exception;

import com.bosir.gateway.common.enums.ResponseCode;

public class GatewayResponseException extends GatewayBaseException{

    public GatewayResponseException(){
        this(ResponseCode.INTERNAL_ERROR);
    }

    public GatewayResponseException(ResponseCode responseCode){
        super(responseCode.getMessage(),responseCode);
    }

    public GatewayResponseException(Throwable cause,ResponseCode responseCode){
        super(responseCode.getMessage(),responseCode,cause);
        this.responseCode=responseCode;
    }
}
