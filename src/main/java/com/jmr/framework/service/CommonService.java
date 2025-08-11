package com.jmr.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonService {
	@Autowired
	private CommonDaoImpl commonDao;

	public String getLegacyDataDetails(String tableName) {
		return commonDao.getLegacyDataDetails(tableName);
	}
	
}
