package com.quzzjy.kk;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@CrossOrigin
public class KkController {

	@GetMapping("/geocoder/v2")
	public String test1(HttpServletRequest request) throws IOException{
		System.out.println("/geocoder/v2************");
		String callback = request.getParameter("callback");
		return String.format("%s && %s(%s)", callback, callback, FileUtils.readFileToString(ResourceUtils.getFile("classpath:kk/location.json"), "utf-8"));
	}
	@GetMapping("/location/ip")
	public String test2(HttpServletRequest request) throws IOException{
		System.out.println("/location/ip************");
		String callback = request.getParameter("callback");
		return String.format("%s && %s(%s)", callback, callback, FileUtils.readFileToString(ResourceUtils.getFile("classpath:kk/ip.json"), "utf-8"));
	}
	@GetMapping("/getscript")
	public String test3(HttpServletRequest request) throws IOException{
		System.out.println("/getscript************");
		return FileUtils.readFileToString(ResourceUtils.getFile("classpath:kk/script.js"), "utf-8");
	}
	@GetMapping("/api")
	public String test4(HttpServletRequest request) throws IOException{
		System.out.println("/api************");
		return FileUtils.readFileToString(ResourceUtils.getFile("classpath:kk/api.js"), "utf-8");
	}
}
