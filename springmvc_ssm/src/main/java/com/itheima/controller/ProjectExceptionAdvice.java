package com.itheima.controller;

import com.itheima.exception.BussinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//声明这个类是用来处理异常的
public class ProjectExceptionAdvice {

    @ExceptionHandler(BussinessException.class)//拦截对应异常
    public Result doBussinessException(BussinessException ex){
        System.out.println("处理Bussiness异常");
        return new Result(ex.getCode(),null,"处理Bussiness异常");
    }

    @ExceptionHandler(SystemException.class)//拦截对应异常
    public Result doSystemException(SystemException ex){
        System.out.println("处理System异常");
        return new Result(ex.getCode(),null,"处理System异常");
    }

    @ExceptionHandler(Exception.class)//拦截对应异常
    public Result doException(Exception ex){
        System.out.println("处理其他异常");
        return new Result(Code.SYSTEMUNKNOW_ERR,null,"处理其他异常");
    }
}
