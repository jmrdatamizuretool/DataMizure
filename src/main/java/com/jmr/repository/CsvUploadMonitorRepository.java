package com.jmr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.batch.entity.CsvUploadMonitor;
@Repository
public interface CsvUploadMonitorRepository extends CrudRepository<CsvUploadMonitor, String>{

}
