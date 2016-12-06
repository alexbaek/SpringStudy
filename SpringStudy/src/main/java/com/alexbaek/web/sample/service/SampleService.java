package com.alexbaek.web.sample.service;

import org.springframework.stereotype.Service;

import com.alexbaek.web.sample.vo.SampleDataVO;

public interface SampleService {

	public SampleDataVO getSampleData() throws Exception;
	
}
