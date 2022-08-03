package com.owenblog.Exception;

/**
 * 自定义的异常
 * 统一处理异常信息
 * 可便于解耦，可以用在拦截器。控制层，业务层
 */

public class MyException extends RuntimeException{
    public MyException(String message) {
        super(message);
    }
}
