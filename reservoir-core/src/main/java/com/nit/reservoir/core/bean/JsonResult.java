package com.nit.reservoir.core.bean;

import java.io.Serializable;

/**
 * Controller 返回的json结果
 * User: charlie.deng
 * Date: 16-8-22
 * Time: 下午3:15
 */
public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = 7001253570790171980L;
    /**
     * 状态
     */
    private int code;

    /**
     * 错误信息描述
     */
    private String msg;

    /**
     * 响应时间
     */
    private long time;

    /**
     * 响应数据
     */
    private Object data;

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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static JsonResult createSuccess(String msg, Object data) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(0);
        jsonResult.setMsg(msg == null ? "" : msg);
        jsonResult.setTime(System.currentTimeMillis());
        jsonResult.setData(data == null ? "" : data);

        return jsonResult;
    }

    public static JsonResult createSuccess(String msg) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(0);
        jsonResult.setMsg(msg == null ? "" : msg);
        jsonResult.setTime(System.currentTimeMillis());
        jsonResult.setData("");

        return jsonResult;
    }

    public static JsonResult createSuccess(Object data) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(0);
        jsonResult.setMsg("");
        jsonResult.setTime(System.currentTimeMillis());
        jsonResult.setData(data == null ? "" : data);

        return jsonResult;
    }

    public static JsonResult createFailed(int code, String msg) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(code);
        jsonResult.setMsg(msg);
        jsonResult.setTime(System.currentTimeMillis());
        jsonResult.setData("");

        return jsonResult;
    }

}
