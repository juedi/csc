package com.quzzjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.quzzjy.csc.mapper")
public class CscApplication {

	public static void main(String[] args) {
		SpringApplication.run(CscApplication.class, args);
	}

}
