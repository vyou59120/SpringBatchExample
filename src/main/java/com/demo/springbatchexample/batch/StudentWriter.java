package com.demo.springbatchexample.batch;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.springbatchexample.model.Student;
import com.demo.springbatchexample.service.IStudentService;


public class StudentWriter implements ItemWriter<Student> {

	private static final Logger logger = Logger
			.getLogger(StudentWriter.class);
	
    @Autowired
    private IStudentService studentService;

    @Override
    public void write(List<? extends Student> students) {
        students.stream().forEach(student -> {
        	logger.info("Enregistrement en base de l'objet {}" + student);
            studentService.insertStudent(student);
        });
    }
}
