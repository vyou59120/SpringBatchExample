package com.demo.springbatchexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springbatchexample.model.Student;
import com.demo.springbatchexample.repository.IStudentRepository;
import com.demo.springbatchexample.service.IStudentService;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public void insertStudent(Student student) {
        studentRepository.save(student);
    }
}
