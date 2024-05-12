package com.sparksuccess.demo.repository;

import com.sparksuccess.demo.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CarRepos extends MongoRepository<Car, String> {
    Car findByVIN(String VIN);
    Car findItemById(String Id);
    @Query("{'VIN': {$regex: '?0'}}")
    List<Car> findByCustomVIN(String pattern);
}
