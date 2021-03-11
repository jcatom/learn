package cc.jml1024.learn.api.response;

import cc.jml1024.learn.api.enumerate.ResponseCode;

public class ResultResponse<T> {
    private T data;
    private String resCode;
    private String resMsg;

    public ResultResponse() {
        this.resCode = ResponseCode.SUCCESS.getCode();
        this.resMsg = ResponseCode.SUCCESS.getMessage();
    }

    public ResultResponse(ResponseCode responseCode) {
        this.resCode = responseCode.getCode();
        this.resMsg = responseCode.getMessage();
    }

    public ResultResponse(String resCode, String resMsg) {
        this.resCode = resCode;
        this.resMsg = resMsg;
    }

    public ResultResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }
}
