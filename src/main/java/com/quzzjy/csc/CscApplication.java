package com.quzzjy.csc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.quzzjy.csc.mapper")
public class CscApplication {

	public static void main(String[] args) {
		SpringApplication.run(CscApplication.class, args);
	}

}
