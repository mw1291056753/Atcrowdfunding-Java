package com.atguigu.atcrowdfunding.manager.service;

import java.util.Map;

import com.atguigu.atcrowdfunding.bean.TUser;

public interface UserService {

	TUser queryUserlogin(Map<String, Object> paramMap);

}
