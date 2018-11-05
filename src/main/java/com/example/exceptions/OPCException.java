package com.example.exceptions;


import com.example.enums.OPCExceptionEnum;

public class OPCException extends RuntimeException {

    private OPCExceptionEnum opExceptionEnum;

    private Integer errCode;

    public OPCException(OPCExceptionEnum exceptionEnum, String... args) {
        super(getMsg(exceptionEnum, args));
        opExceptionEnum = exceptionEnum;
        errCode = exceptionEnum.getCode();
    }

    public OPCException(Throwable e, OPCExceptionEnum exceptionEnum, String... args) {
        super(getMsg(exceptionEnum, args), e);
        opExceptionEnum = exceptionEnum;
        errCode = exceptionEnum.getCode();
    }

    public OPCException(Throwable e, String msg){
        super(msg, e);
    }

    public OPCException(String msg){
        super(msg);
    }

    private static String getMsg(OPCExceptionEnum exceptionEnum, String[] args) {
        return String.format(exceptionEnum.getMsg(), args);
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }
}