package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableEurekaClient
@EnableAspectJAutoProxy
public class Assessment4DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assessment4DemoApplication.class, args);
		System.out.println("Logger is working");	
	}
	@PostConstruct
	public void registerWithEureka() {
	    System.out.println("Attempting to register with Eureka...");
	}
}
