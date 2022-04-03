package com.demo.springbatchexample.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class StudentFieldSetMapper implements FieldSetMapper<Student> {
    @Override
    public Student mapFieldSet(FieldSet fieldSet) {

  
    	return new Student(fieldSet.readString(0),
						fieldSet.readString(1),
						fieldSet.readString(2),
						fieldSet.readString(3),
						fieldSet.readString(4),
						fieldSet.readString(5),
						fieldSet.readString(6)
						);
			
               
    }
}

