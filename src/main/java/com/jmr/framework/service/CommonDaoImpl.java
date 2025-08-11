package com.jmr.framework.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.LegacyDataVb;
import com.jmr.repository.LegacyDataRepository;
@Component
public class CommonDaoImpl implements  CommonDao{
	@Autowired
	private LegacyDataRepository repo;
	public String getLegacyDataDetails(String tableName) {
		Optional<LegacyDataVb> legacyDataVb = repo.findById(tableName);
		return legacyDataVb.get().getCsv_file_path();
	}
}
