package com.mvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoAppApplication.class, args);
	}
	
	@GetMapping("/home")
	public String hello() {
		return "Hello world";
	}

}
 