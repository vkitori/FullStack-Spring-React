package com.kanbantool.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kanbantool.demo.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository <Project, Long>{

	Project findByProjectIdentifier(String projectId);

	@Override
	Iterable<Project> findAll();

	
}
