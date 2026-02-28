package com.capgemini.spring_rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.spring_rest_demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
