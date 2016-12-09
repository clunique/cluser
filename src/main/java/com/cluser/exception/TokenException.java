package com.cluser.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by Lou Chen Xi on 30/8/2016.
 */
public class TokenException extends UserCenterException {

    public static final HttpStatus DEFAULT_STATUS = HttpStatus.UNAUTHORIZED;
    public static final TransactionErrorType DEFAULT_TRANSACTION_ERROR =  TransactionErrorType.TOKEN_INVALID_ERROR;

    public TokenException(){
        super(DEFAULT_STATUS, DEFAULT_TRANSACTION_ERROR);
    }
    public TokenException(HttpStatus httpStatus){
        this(httpStatus, DEFAULT_TRANSACTION_ERROR);
    }
    public TokenException(TransactionErrorType errorType){
        super(DEFAULT_STATUS, errorType);
    }
    public TokenException(HttpStatus httpStatus, TransactionErrorType errorType){
        super(httpStatus, errorType);
    }
    public TokenException(String desc){
        super(DEFAULT_STATUS, DEFAULT_TRANSACTION_ERROR, desc);
    }


}
