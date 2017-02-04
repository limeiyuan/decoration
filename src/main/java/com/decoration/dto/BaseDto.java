package com.decoration.dto;

/**
 * Created by LiMeiyuan on 2017/2/4.
 */
public class BaseDto {
    private Boolean success;
    private Object result;
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
