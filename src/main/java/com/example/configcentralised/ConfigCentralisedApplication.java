package com.example.configcentralised;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigCentralisedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCentralisedApplication.class, args);
	}

}
