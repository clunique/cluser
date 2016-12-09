package com.cluser.exception;

import org.springframework.http.HttpStatus;


@SuppressWarnings("serial")
public class UserCenterException extends RuntimeException {

    public static final HttpStatus DEFAULT_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;
    public static final TransactionErrorType DEFAULT_TRANSACTION_ERROR =  TransactionErrorType.UNKNOWN_ERROR;

    private HttpStatus httpStatus;
    private TransactionErrorType transactionError;
    private String correlationId;

    public UserCenterException() {
        this(DEFAULT_STATUS, DEFAULT_TRANSACTION_ERROR);
    }

    public UserCenterException(Throwable throwable){
        this(DEFAULT_TRANSACTION_ERROR.getDesc(), throwable);
    }

    public UserCenterException(String custDesc, Throwable throwable){
        this(DEFAULT_STATUS, DEFAULT_TRANSACTION_ERROR, custDesc, throwable);
    }

    public UserCenterException(HttpStatus httpStatus, String custDesc, Throwable throwable){
        this(httpStatus, DEFAULT_TRANSACTION_ERROR, custDesc, throwable);
    }

    public UserCenterException(HttpStatus httpStatus) {
        this(httpStatus, DEFAULT_TRANSACTION_ERROR);
    }

    public UserCenterException(TransactionErrorType desc) {
        this(DEFAULT_STATUS, desc);
    }

    public UserCenterException(String custDesc) {
        this(DEFAULT_STATUS, DEFAULT_TRANSACTION_ERROR, custDesc);
    }

    public UserCenterException(HttpStatus httpStatus, TransactionErrorType transactionError){
        this(httpStatus, transactionError, transactionError.getDesc());
    }

    public UserCenterException(HttpStatus httpStatus, TransactionErrorType transactionError, String custDesc){
        this(httpStatus, transactionError, custDesc, null);
    }
    public UserCenterException(HttpStatus httpStatus, TransactionErrorType transactionError, String custDesc, Throwable throwable){
        super(custDesc, throwable);
        // setCorrelationId(RequestCorrelation.getId());
        updateHttpStatus(httpStatus);
        setTransactionError(transactionError);
    }

    protected void updateHttpStatus(HttpStatus httpStatus){
        setHttpStatus(httpStatus);
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public TransactionErrorType getTransactionError() {
        return transactionError;
    }

    public void setTransactionError(TransactionErrorType transactionError) {
        this.transactionError = transactionError;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

}
