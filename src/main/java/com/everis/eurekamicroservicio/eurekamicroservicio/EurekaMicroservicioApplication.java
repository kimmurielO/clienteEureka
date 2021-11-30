package com.everis.eurekamicroservicio.eurekamicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMicroservicioApplication.class, args);
	}

}
