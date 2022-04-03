package com.demo.springbatchexample.controller;

import org.apache.log4j.Logger;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbatchexample.BatchLauncher;


@RestController
@RequestMapping("/load")
public class StudentController {
	
	private static final Logger logger = Logger
			.getLogger(StudentController.class);
	
    @Autowired
    private BatchLauncher batchLauncher;

    @GetMapping
    public BatchStatus load() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
    	logger.info("Batch demarré à la demande");
        return batchLauncher.run();
    }
}
