package com.gitUpload.demoService.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gitUpload.demoService.entities.Demo;

public interface DemoRepository extends MongoRepository<Demo, Integer> {

}
