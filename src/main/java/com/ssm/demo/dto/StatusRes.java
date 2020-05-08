package com.ssm.demo.dto;

/**
 * @ClassName StatusRes
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/8 0008
 **/
public class StatusRes {

    private boolean flag;
    private String msg;
    private Object data;

    public static StatusRes build(boolean flag, String msg, Object data){
        return new StatusRes(flag,msg,data);
    }

    public StatusRes(boolean flag, String msg, Object data) {
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
