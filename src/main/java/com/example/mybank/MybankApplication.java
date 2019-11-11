package com.example.mybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@ComponentScan(basePackages = {"com.example})
@SpringBootApplication
public class MybankApplication {


		public static void main(String[] args) {
		SpringApplication.run(MybankApplication.class, args);
		System.out.println("test");
	}

}
