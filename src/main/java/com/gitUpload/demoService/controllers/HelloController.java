package com.gitUpload.demoService.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public ResponseEntity<?> getHelloText(){
		return ResponseEntity.status(HttpStatus.OK)
				.body("Hello from render application")
				;
	}

}
