package com.quzzjy.csc.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quzzjy.csc.domain.UserEntity;
import com.quzzjy.csc.domain.vo.LoginVo;
import com.quzzjy.csc.service.LoginService;

@RestController
@RequestMapping("/")
public class LoginController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;
	
	@PostMapping("login")
	public boolean login(@RequestBody @Valid LoginVo loginVo, HttpSession session) {
		return loginService.login(loginVo, session);
	}
	
	@PostMapping("logout")
	public void logout(HttpSession session) {
		UserEntity user = (UserEntity)session.getAttribute("user");
		if(user != null) {
			LOGGER.info("{}登出", user.getName());
		}
		session.removeAttribute("user");
	}
}
