package com.example.enums;

public enum  OPCExceptionEnum {
    PARAN_NULL_ERR(10000,"no role"),
    NO_ROLE(10001,"no role");

    private int code;

    private String msg;

    private OPCExceptionEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
