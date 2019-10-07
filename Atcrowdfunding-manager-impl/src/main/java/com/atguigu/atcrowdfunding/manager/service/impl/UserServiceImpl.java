package com.atguigu.atcrowdfunding.manager.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.manager.service.UserService;
import com.atguigu.atcrowdfunding.bean.TUser;
import com.atguigu.atcrowdfunding.exception.LoginFailException;
import com.atguigu.atcrowdfunding.manager.dao.TUserMapper;;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TUserMapper tuserMapper;

	public TUser queryUserlogin(Map<String, Object> paramMap) {
		TUser tuser = tuserMapper.queryUserlogin(paramMap);
		
		if(tuser == null){
			throw new LoginFailException("用户账号或密码不正确！");
		}
		
		return tuser;
	}
	
}
