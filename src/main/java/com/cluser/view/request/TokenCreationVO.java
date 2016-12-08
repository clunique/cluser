package com.cluser.view.request;

import com.cluser.view.anotation.RequestToken;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Lou Chen Xi on 1/9/2016.
 */
@RequestToken
public class TokenCreationVO {

    @JsonProperty("op_type")
    private String opType;

    @JsonProperty("login_info")
    private LoginInfoVO loginInfoVO;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("username")
    private String username;

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public LoginInfoVO getLoginInfo() {
        return loginInfoVO;
    }

    public void setLoginInfo(LoginInfoVO loginInfoVO) {
        this.loginInfoVO = loginInfoVO;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
