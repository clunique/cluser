package com.cluser.security;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.www.NonceExpiredException;

import com.cluser.exception.TransactionErrorType;

/**
 * Created by Lou Chen Xi on 17/11/2016.
 */
public class JwtAuthenticationFailureHandler implements AuthenticationFailureHandler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        logger.info("Authentication failure: " + exception.getMessage());
        int status = HttpServletResponse.SC_UNAUTHORIZED;
        int transactionErrorCode = TransactionErrorType.UNAUTHORIZED.getErrorCode();
        String desc = exception.getMessage();
        if(exception instanceof NonceExpiredException) {
            transactionErrorCode = TransactionErrorType.TOKEN_EXPIRED_ERROR.getErrorCode();
        }else if(exception instanceof BadCredentialsException){
            transactionErrorCode = TransactionErrorType.TOKEN_INVALID_ERROR.getErrorCode();
        }

        String retVal = String.format("{\"result\":%s,\"message\":\"%s\",\"error_code\":%s}", false, desc, transactionErrorCode);
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.setStatus(status);
        response.getOutputStream().println(retVal);
    }
}
