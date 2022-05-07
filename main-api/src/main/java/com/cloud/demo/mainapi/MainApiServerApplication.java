package com.cloud.demo.mainapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MainApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApiServerApplication.class, args);
	}

}
