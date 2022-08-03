package com.owenblog.Exception;

/**
 * 抛出自定义异常
 */
public class GraceException {
    public static void display(String errMsg){
        throw new MyException(errMsg);
    }
}
