package com.kanbantool.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kanbantool.demo.domain.Backlog;

@Repository
public interface BacklogRepository  extends CrudRepository <Backlog, Long>{
	
}
