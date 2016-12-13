package com.cluser.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

public class UserController {
//	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	@ResponseBody
//	public Callable<ReturnResultVO<TokenInfoVO>> userCreate(@Valid @RequestBody LoginInfoVO loginInfoVO)
//			throws UserCenterException {
//		TokenCreationVO tokenCreateVO = new TokenCreationVO();
//		tokenCreateVO.setOpType(TokenTypes.ACCESS.getValue());
//		tokenCreateVO.setLoginInfo(loginInfoVO);
//		return () -> new ReturnResultVO<>(tokenBusiness.createToken(tokenCreateVO));
//	}
}
