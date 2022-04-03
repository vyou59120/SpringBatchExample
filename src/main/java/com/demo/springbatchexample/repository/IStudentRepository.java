package com.demo.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springbatchexample.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
}
