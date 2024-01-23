package com.gitUpload.demoService.services;

import com.gitUpload.demoService.entities.Demo;

public interface DemoService {
	
	Demo createDemo(Demo demo);
	Demo getDemobyId(int id);

}
