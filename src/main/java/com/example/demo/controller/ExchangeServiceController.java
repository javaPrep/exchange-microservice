package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeServiceController {

	@GetMapping(path = "/message")
	public String printMessage() {
		return "welcome message";
	}

}
