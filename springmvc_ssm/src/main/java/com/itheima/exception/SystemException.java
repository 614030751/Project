package com.itheima.exception;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class SystemException extends RuntimeException{
    private Integer Code;

    public SystemException() {
        super();
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.Code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.Code = code;
    }

    public SystemException(Integer code, Throwable cause) {
        super(cause);
        this.Code = code;
    }

    protected SystemException(Integer code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.Code = code;
    }
}
