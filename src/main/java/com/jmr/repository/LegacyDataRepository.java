package com.jmr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.batch.entity.LegacyDataVb;
@Repository
public interface LegacyDataRepository extends CrudRepository<LegacyDataVb, String>{

}
