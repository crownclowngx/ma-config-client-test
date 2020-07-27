package com.micro.action.maconfigclienttest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MaConfigClientTestApplication {
	@Value("${name}")
	private String name;
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World "+name;
	}
	public static void main(String[] args) {
		SpringApplication.run(MaConfigClientTestApplication.class, args);
	}

}
