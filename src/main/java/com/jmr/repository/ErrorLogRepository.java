package com.jmr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.batch.entity.ErrorLogVb;
@Repository
public interface ErrorLogRepository extends CrudRepository<ErrorLogVb, String>{

}
