package com.itheima.exception;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class BussinessException extends RuntimeException{
    private Integer Code;

    public BussinessException() {
        super();
    }

    public BussinessException(Integer code, String message) {
        super(message);
        this.Code = code;
    }

    public BussinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.Code = code;
    }

    public BussinessException(Integer code, Throwable cause) {
        super(cause);
        this.Code = code;
    }

    protected BussinessException(Integer code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.Code = code;
    }
}
