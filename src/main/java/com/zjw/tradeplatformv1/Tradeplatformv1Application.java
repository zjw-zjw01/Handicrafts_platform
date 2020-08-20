package com.zjw.tradeplatformv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableScheduling
public class Tradeplatformv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tradeplatformv1Application.class, args);
	}


}
