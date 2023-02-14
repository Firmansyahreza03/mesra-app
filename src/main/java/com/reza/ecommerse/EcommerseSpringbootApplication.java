package com.reza.ecommerse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.reza.ecommerse"})
public class EcommerseSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerseSpringbootApplication.class, args);
	}

}
