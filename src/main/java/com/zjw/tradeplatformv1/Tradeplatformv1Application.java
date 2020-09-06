package com.zjw.tradeplatformv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class Tradeplatformv1Application  {

	public static void main(String[] args) {
		SpringApplication.run(Tradeplatformv1Application.class, args);
	}

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(Tradeplatformv1Application.class);
	}*/

}
