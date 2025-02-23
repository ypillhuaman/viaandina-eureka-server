package com.aviaandina.eureka.server.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ViaandinaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaandinaEurekaServerApplication.class, args);
	}

}
