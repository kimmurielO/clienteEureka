package com.everis.eurekamicroservicio.eurekamicroservicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(path="/")
	public String myValue() {
		return "Hola Mundo";
	}

}
