package com.demo.springbatchexample;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

	private static final Logger logger = Logger
			.getLogger(Scheduler.class);
	
    @Autowired
    private BatchLauncher batchLauncher;

    @Scheduled(fixedDelay = 8000)
    public void perform() throws Exception {
    	logger.info("Batch programmé pour tourner toutes les 8 secondes");
        batchLauncher.run();
    }
}
