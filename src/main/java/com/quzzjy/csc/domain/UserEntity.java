/**
 * 
 */
package com.quzzjy.csc.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @typename UserEntity
 * @brief 用户信息
 * @author dly
 * @date 2019年10月24日 下午7:56:48
 * @version 1.0.0
 * @since 1.0.0
 */
@TableName("csc_user")
public class UserEntity {
	private Long userId;
	private String name;
	private String address;
	private String status;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
