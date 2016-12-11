package com.cluser.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Created by Lou Chen Xi on 31/10/2016.
 */
public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private String token;
    public JwtAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
        this.token = (String) credentials;

    }
    public JwtAuthenticationToken(String token){
        this("", token);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
