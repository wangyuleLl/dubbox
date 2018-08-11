package cn.itcast.dobboxdemo.service.impl;



import com.alibaba.dubbo.config.annotation.Service;

import cn.itcast.dobboxdemo.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	public String getUsername() {
		
		return "静静";
	}

}
