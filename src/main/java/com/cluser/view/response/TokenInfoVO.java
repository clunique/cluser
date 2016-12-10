package com.cluser.view.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class TokenInfoVO {
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String accessToken;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String refreshToken;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String resetPasswordToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}
}
