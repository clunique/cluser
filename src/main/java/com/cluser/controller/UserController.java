package com.cluser.controller;

import java.util.List;
import java.util.concurrent.Callable;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cluser.business.UserBusiness;
import com.cluser.exception.UserCenterException;
import com.cluser.view.request.SearchUserConditionVO;
import com.cluser.view.response.ReturnResultVO;
import com.cluser.view.response.UserInfoOutVO;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

public class UserController {
	@Autowired
	@Qualifier("userBusiness")
	private UserBusiness userBusiness;
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Callable<ReturnResultVO<List<UserInfoOutVO>>> searchUser()
			throws UserCenterException {
		return () -> new ReturnResultVO<>(userBusiness.searchUser());
	}
}
