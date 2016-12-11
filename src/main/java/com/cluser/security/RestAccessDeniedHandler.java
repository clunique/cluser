package com.cluser.security;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.cluser.exception.TransactionErrorType;

/**
 * Created by Lou Chen Xi on 19/9/2016.
 */
public class RestAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        int transactionErrorCode = TransactionErrorType.INSUFFICIENT_PRIVILEGES.getErrorCode();
        String desc = TransactionErrorType.INSUFFICIENT_PRIVILEGES.getDesc();
        String retVal = String.format("{\"result\":%s,\"message\":\"%s\",\"error_code\":%s}", false, desc, transactionErrorCode);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.getOutputStream().println(retVal);
    }
}
