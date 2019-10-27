package com.quzzjy.csc.domain.vo;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LoginVo {

	@NotNull
	private String name;
	
	@NotNull
	private String password;
	
	@NotNull
	private String userType;
	
}
