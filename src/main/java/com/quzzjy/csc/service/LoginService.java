package com.quzzjy.csc.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.quzzjy.csc.domain.UserEntity;
import com.quzzjy.csc.domain.vo.LoginVo;
import com.quzzjy.csc.exception.ServiceException;
import com.quzzjy.csc.mapper.UserEntityMapper;

@Service
public class LoginService {

	@Autowired
	private UserEntityMapper userMapper;
	
	public boolean login(LoginVo loginVo, HttpSession session) {
		UserEntity entity = new UserEntity();
		entity.setName(loginVo.getName());
		entity.setUserType(loginVo.getUserType());
		UserEntity userEntity = userMapper.selectOne(new QueryWrapper<>(entity));
		
		if(userEntity == null) {
			ServiceException.create("用户不存在");
		}
		
		session.setAttribute("user", userEntity);
		
		return userEntity.getPassword().equals(loginVo.getPassword());
	}
	
}
