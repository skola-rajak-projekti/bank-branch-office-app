package com.example.mybank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class Greeting {
	
	@GetMapping("/get")
	public String greet() {
		return "glavna-strana.html";
	}


	
}
