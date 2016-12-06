package com.alexbaek.web.sample.service;

import javax.inject.Inject;

import com.alexbaek.web.sample.dao.SampleDao;
import com.alexbaek.web.sample.vo.SampleDataVO;

public class SampleServiceImpl implements SampleService {
	
	@Inject
	SampleDao sampleDao;

	@Override
	public SampleDataVO getSampleData() throws Exception {
		// TODO Auto-generated method stub
		return sampleDao.getSampleData();
	}

}
