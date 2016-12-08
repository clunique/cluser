package com.cluser.view.request;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginInfoVO {
    @NotEmpty(message = "could not be empty")
    private String username;
    
    @NotEmpty(message = "could not be empty")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
