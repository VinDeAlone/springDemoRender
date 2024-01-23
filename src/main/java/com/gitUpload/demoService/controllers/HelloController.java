package com.gitUpload.demoService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitUpload.demoService.entities.Demo;
import com.gitUpload.demoService.services.DemoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private DemoService ser;
	
	@GetMapping
	public ResponseEntity<?> getHelloText(){
		return ResponseEntity.status(HttpStatus.OK)
				.body("Hello from render application")
				;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDemoById(@PathVariable int id){
		Demo demo = this.ser.getDemobyId(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(demo)
				;
	}
	
	@PostMapping
	public ResponseEntity<?> createDemo(@RequestBody Demo demo){
		demo = this.ser.createDemo(demo);
		return ResponseEntity.status(HttpStatus.OK)
				.body("Created user successfully !!!")
				;
	}

}
