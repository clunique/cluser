package com.cluser.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cluser.dao.mapper.TUserMapper;
import com.cluser.dao.model.TUser;
import com.cluser.dao.model.TUserExample;
import com.cluser.view.request.SearchUserConditionVO;
import com.cluser.view.response.UserInfoOutVO;

@Service("userService")
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Resource
	TUserMapper userMapper;
	
	public TUser getUserByUsername(String userName) {
		TUser tUser = null;
		TUserExample example = new TUserExample();
		TUserExample.Criteria cri = example.createCriteria();
		cri.andUsernameEqualTo(userName);
		List<TUser> listUser = userMapper.selectByExample(example);
		if(listUser.size() > 0) {
			tUser = listUser.get(0);
		}
		return tUser;
	}
	
	public List<UserInfoOutVO> searchUser(SearchUserConditionVO condi) {
		List<UserInfoOutVO> out = new ArrayList<UserInfoOutVO>();
		return out;
	}
}
