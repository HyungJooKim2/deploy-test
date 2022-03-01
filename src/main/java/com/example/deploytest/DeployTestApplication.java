package com.example.deploytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaAuditing //Auditing 과 관련된 bean 이용가능
public class DeployTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployTestApplication.class, args);
	}

}
