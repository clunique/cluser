package com.cluser.view.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class TokenInfoVO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accessTokenValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String refreshTokenValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resetPasswordTokenValue;

    public String getAccessTokenValue() {
        return accessTokenValue;
    }

    public void setAccessTokenValue(String accessTokenValue) {
        this.accessTokenValue = accessTokenValue;
    }

    public String getRefreshTokenValue() {
        return refreshTokenValue;
    }

    public void setRefreshTokenValue(String refreshTokenValue) {
        this.refreshTokenValue = refreshTokenValue;
    }

    public String getResetPasswordTokenValue() {
        return resetPasswordTokenValue;
    }

    public void setResetPasswordTokenValue(String resetPasswordTokenValue) {
        this.resetPasswordTokenValue = resetPasswordTokenValue;
    }
}
