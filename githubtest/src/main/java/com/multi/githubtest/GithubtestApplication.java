package com.multi.githubtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GithubtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubtestApplication.class, args);
	}

}
