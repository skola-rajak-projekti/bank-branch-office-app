package com.example.mybank;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.mybank.service.StorageService;
import com.example.mybank.utils.StorageProperties;


//@ComponentScan(basePackages = {"com.example})
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class MybankApplication {


		public static void main(String[] args) {
		SpringApplication.run(MybankApplication.class, args);
	
	}

		  @Bean
		  CommandLineRunner init(StorageService storageService) {
		    return (args) -> {
		     storageService.deleteAll();
		      storageService.init();
		    };
		  }

}
