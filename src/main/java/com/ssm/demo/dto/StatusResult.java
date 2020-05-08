package com.ssm.demo.dto;

public enum StatusResult {

    SUCCESS("操作成功",200),
    FAIL("操作失败",401);

    private String msg;
    private int code;
    private Object obj;

    private StatusResult(String msg ,int code){
        this.msg = msg;
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
