package com.svr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class AppConfigStart {
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfigStart.class, args);
	}
}
