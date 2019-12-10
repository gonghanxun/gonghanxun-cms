package com.gonghanxun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonghanxun.dao.UserMapper;
import com.gonghanxun.service.UserService;

@Service("user")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;
}
