package com.oracle.common;

public enum Status {

    SUCCESS(Compent.success_code,Compent.success_msg),
    Filed(Compent.filed_code,Compent.filed_msg);

    private Integer code;
    private String msg;

    Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
