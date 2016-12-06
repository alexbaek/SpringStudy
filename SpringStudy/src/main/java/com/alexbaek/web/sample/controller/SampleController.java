package com.alexbaek.web.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexbaek.web.sample.vo.SampleDataVO;

@RestController
@RequestMapping(value = "/sample")
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void getTestData(SampleDataVO data) {
		logger.info("========== SampleController ========== getTestData() ========== ");
		
		logger.info("========== SampleController = " + data.getSampleId());
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.POST)
	public void getTestDataPost(@RequestBody SampleDataVO data) {
		logger.info("========== SampleController ========== getTestDataPost() ========== ");
		
		logger.info("========== SampleController = " + data.getSampleId());
	}
}
