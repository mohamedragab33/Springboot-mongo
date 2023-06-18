package com.mongo.repository;

import com.mongo.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends MongoRepository<Student, Long> {


}
