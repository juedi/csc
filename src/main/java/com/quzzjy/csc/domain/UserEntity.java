package com.quzzjy.csc.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @typename UserEntity
 * @brief 用户信息
 * @author dly
 * @date 2019年10月24日 下午7:56:48
 * @version 1.0.0
 * @since 1.0.0
 */
@TableName("csc_user")
@Data
public class UserEntity {
	private Long userId;
	private String name;
	private String address;
	private String status;
	/**1-商户；2-管理员；0-超级管理员*/
	private String userType;
	
	private String phone;
	private String password;
	private String realname;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String updateUser;

}
