package com.kyle.train.result;

import org.springframework.transaction.ReactiveTransaction;

public class ResponseData<T> extends Response {
    private T data;
    public T getData(){
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public ResponseData(T data) {
        this.data = data;
    }

    public ResponseData(ExceptionMsg msg) {
        super(msg);
    }

    public ResponseData(String rspCode, String rspMsg){
        super(rspCode, rspMsg);
    }

    public ResponseData(String rspCode, String rspMsg, T data){
        super(rspCode, rspMsg);
        this.data = data;
    }

    public ResponseData(ExceptionMsg msg, T data) {
        super(msg);
        this.data = data;
    }

    @Override
    public String toString(){
        return "ResponseData{" +
                "data=" + data +
                "} " + super.toString();
    }
}
