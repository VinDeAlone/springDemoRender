package com.gitUpload.demoService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitUpload.demoService.entities.Demo;
import com.gitUpload.demoService.repositories.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoRepository repo;

	@Override
	public Demo createDemo(Demo demo) {
		return this.repo.save(demo);
	}

	@Override
	public Demo getDemobyId(int id) {
		return this.repo.findById(id).orElseThrow(()->new RuntimeException("Demo not found"));
	}

}
