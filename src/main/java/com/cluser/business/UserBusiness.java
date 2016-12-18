package com.cluser.business;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.cluser.service.UserService;
import com.cluser.view.request.SearchUserConditionVO;
import com.cluser.view.response.UserInfoOutVO;

@Service("userBusiness")
public class UserBusiness {
	@Resource
	UserService userService;
	
	@PreAuthorize("hasPermission('usercenter', 'user:search')")
	// hasPermission('作用域', '权限名称')
	public List<UserInfoOutVO> searchUser() {
		SearchUserConditionVO condi = new SearchUserConditionVO();
		return userService.searchUser(condi);
	}
}
