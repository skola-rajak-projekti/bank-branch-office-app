package com.example.mybank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greeting {
	
	@GetMapping("/get")
	public String greet() {
		return "greet.html";
	}

}
