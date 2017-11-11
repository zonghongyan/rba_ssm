package com.rba.basebeans;

/**
 * Created by 仁伯安 on 2017/11/11.
 */
public class BaseResult {
    public BaseResult() {
    }

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
