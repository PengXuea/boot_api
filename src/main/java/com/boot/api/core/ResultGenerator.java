package com.boot.api.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "OK";

    public static Result genSuccessResult() {
        return new Result()
                .setRet(ResultCode.OK)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result()
                .setRet(ResultCode.OK)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setResult(data);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setRet(ResultCode.FAIL)
                .setMessage(message);
    }
}
