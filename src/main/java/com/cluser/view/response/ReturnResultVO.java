package com.cluser.view.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ReturnResultVO<T> {

    public final static String SUCCESS = "SUCCESS";
    public final static String ERROR = "ERROR";

    private Boolean result;
    private String message;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private int errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public ReturnResultVO(){
        this.result = true;
        this.message = SUCCESS;
    }
    
    public ReturnResultVO(T data){
        this.result = true;
        this.message = SUCCESS;
        this.data = data;
    }
    
    public ReturnResultVO(Boolean result, String message, int transactionErrorCode){
        this.result = result;
        this.message = message;
        this.errorCode = transactionErrorCode;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int transactionErrorCode) {
        this.errorCode = transactionErrorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T contents) {
        this.data = contents;
    }
}
