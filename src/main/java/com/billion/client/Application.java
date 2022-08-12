package com.billion.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqiang
 */

@RestController
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Value("${demo.param1}")
	private String param1;

	@Value("${demo.param2}")
	private String param2;

	@RequestMapping(value = "/demo")
	public String hi() {
		return param1 + " and " + param2;
	}

	@RequestMapping(value = "/")
	public String hiss() {
		return param1 + " 1and " + param2;
	}

}