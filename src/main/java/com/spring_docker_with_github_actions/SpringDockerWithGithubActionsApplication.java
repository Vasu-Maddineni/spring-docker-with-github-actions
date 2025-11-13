package com.spring_docker_with_github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerWithGithubActionsApplication {
	
	@GetMapping
	public String home() {
		return "welcome to git hub auto deploy";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerWithGithubActionsApplication.class, args);
	}

}
