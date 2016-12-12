package com.alexbaek.web.batch.sample;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.alexbaek.web.sample.controller.SampleController;

public class SampleJobBean extends QuartzJobBean {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleJobBean.class);

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		logger.info("========== SampleJobBean ========== START ========== ");
		
	}

}
