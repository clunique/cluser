package com.cluser.controller;

import java.util.concurrent.Callable;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cluser.enums.TokenTypes;
import com.cluser.exception.ClUserException;
import com.cluser.service.TokenService;
import com.cluser.view.request.LoginInfoVO;
import com.cluser.view.request.TokenCreationVO;
import com.cluser.view.response.ReturnResultVO;
import com.cluser.view.response.TokenInfoVO;

@RestController
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LoginController {
	@Autowired
	@Qualifier("tokenService")
	private TokenService tokenService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Callable<ReturnResultVO<TokenInfoVO>> login(@Valid @RequestBody LoginInfoVO loginInfoVO)
			throws ClUserException {
		TokenCreationVO tokenCreateVO = new TokenCreationVO();
		tokenCreateVO.setOpType(TokenTypes.ACCESS.getValue());
		tokenCreateVO.setLoginInfo(loginInfoVO);
		return () -> new ReturnResultVO<>(tokenService.createToken(tokenCreateVO));
	}
}
