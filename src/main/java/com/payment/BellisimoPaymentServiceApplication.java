package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BellisimoPaymentServiceApplication {
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**").allowedOrigins("*");
                registry.addMapping("/api/***").allowedOrigins("*");
                registry.addMapping("/api/**/**").allowedOrigins("*");
                registry.addMapping("/*").allowedOrigins("*");
            }
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(BellisimoPaymentServiceApplication.class, args);
	}
}
