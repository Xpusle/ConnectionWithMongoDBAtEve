package com.example.ConnectionWithMongoDBAtEve.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ConnectionWithMongoDBAtEve.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository <Employee,Integer>{

}
