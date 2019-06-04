package com.andy.design.pattern;


/**
 * <p>结果类</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 19:57
 */
public class Result {

    private Integer errorCode;
    private String message;
    private Object data;

    public Result(Integer errorCode, String message, Object data) {
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
