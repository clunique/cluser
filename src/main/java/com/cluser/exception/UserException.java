package com.cluser.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by Lou Chen Xi on 30/8/2016.
 */
public class UserException extends UserCenterException {

    public static final HttpStatus DEFAULT_STATUS = HttpStatus.BAD_REQUEST;
    public static final TransactionErrorType DEFAULT_TRANSACTION_ERROR =  TransactionErrorType.UNKNOWN_ERROR;

    public UserException(){
        super(DEFAULT_STATUS, DEFAULT_TRANSACTION_ERROR);
    }
    public UserException(TransactionErrorType errorType){
        super(DEFAULT_STATUS, errorType);
    }
    public UserException(HttpStatus httpStatus, TransactionErrorType errorType){
        super(httpStatus, errorType);
    }
    public UserException(String desc){
        super(DEFAULT_STATUS, DEFAULT_TRANSACTION_ERROR, desc);
    }
    
    public UserException(HttpStatus httpStatus, TransactionErrorType transactionError, String custDesc){
    	super(httpStatus, transactionError, custDesc);
    }
    
    public UserException(HttpStatus httpStatus, TransactionErrorType transactionError, String custDesc, Throwable throwable){
        super(httpStatus, transactionError, custDesc, throwable);
    }
}
