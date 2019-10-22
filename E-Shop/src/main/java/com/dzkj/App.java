package com.dzkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//扫描本包或子包下的注解组件
@SpringBootApplication
@ServletComponentScan
@Controller
//@MapperScan("com.dzkj.mapper")
public class App {
	public static void main(String[] args) {
		//springboot开机
		SpringApplication.run(App.class, args);
	}
	@RequestMapping("/index")
	public String index() {
		return "person/index";
	}
	
}
