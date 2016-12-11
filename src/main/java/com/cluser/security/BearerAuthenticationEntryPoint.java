package com.cluser.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.cluser.exception.TransactionErrorType;

/**
 * Created by Lou Chen Xi on 19/9/2016.
 */
public class BearerAuthenticationEntryPoint implements AuthenticationEntryPoint {
    private static Logger logger = LoggerFactory.getLogger(BearerAuthenticationEntryPoint.class);
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        int status = HttpServletResponse.SC_UNAUTHORIZED;
        int transactionErrorCode = TransactionErrorType.UNAUTHORIZED.getErrorCode();
        String desc = TransactionErrorType.UNAUTHORIZED.getDesc();
        String retVal = String.format("{\"result\":%s,\"message\":\"%s\",\"error_code\":%s}", false, desc, transactionErrorCode);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(status);
        response.getOutputStream().println(retVal);
    }
}
