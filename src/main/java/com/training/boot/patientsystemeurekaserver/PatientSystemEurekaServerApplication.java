package com.training.boot.patientsystemeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PatientSystemEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientSystemEurekaServerApplication.class, args);
	}

}
