package com.kanbantool.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanbantool.demo.domain.Project;
import com.kanbantool.demo.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		//logic
		
		return projectRepository.save(project);
	}
}
