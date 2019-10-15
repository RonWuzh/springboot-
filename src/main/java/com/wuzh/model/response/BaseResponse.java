//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.wuzh.model.response;

public class BaseResponse<T> {
    protected String requestId;
    protected Integer code;
    protected T item;
    protected String message;

    public BaseResponse() {
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static BaseResponse response(String message, Integer code, Object item) {
        BaseResponse entity = new BaseResponse();
        entity.code = code;
        entity.message = message;
        entity.item = item;
        return entity;
    }
}
