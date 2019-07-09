package com.boot.api.core;

import com.alibaba.fastjson.JSON;

/**
 * 统一API响应结果封装
 */
public class Result<T> {
    private int ret;
    private String message;
    private T result;

    public Result setRet(ResultCode resultCode) {
        this.ret = resultCode.ret();
        return this;
    }

    public int getRet() {
        return ret;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getResult() {
        return result;
    }

    public Result setResult(T result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
