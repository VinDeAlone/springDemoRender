package com.gitUpload.demoService.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class Demo {
	
	private int id;
	private String name;
	public Demo() {
		super();
	}
	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
