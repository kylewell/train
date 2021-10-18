package com.kyle.train.result;

public enum ExceptionMsg {
    SUCCESS("200", "操作成功"),
    FAILED("999999", "操作失败");

    private String code;
    private String msg;
    public String getCode(){
        return code;
    }
    public String getMsg(){
        return msg;
    }

    private ExceptionMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
