package com.kanbantool.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanbantool.demo.domain.Project;
import com.kanbantool.demo.domain.Backlog;
import com.kanbantool.demo.repositories.ProjectRepository;
import com.kanbantool.demo.exceptions.ProjectIdException;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			if(project.getId() == null) {
				Backlog backlog = new Backlog();
				project.setBacklog(backlog);
				backlog.setProject(project);
				backlog.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			}
			
			
			return projectRepository.save(project);
		} catch (Exception e) {
			throw new ProjectIdException("Project ID "+ project.getProjectIdentifier().toUpperCase() + " already exists");
		}
	}
	
	public Project findProjectByIdentifier(String projectId) {
		
		Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		
		if(project == null) {
			throw new ProjectIdException("Project ID "+ projectId + " does not exists");
		}
		
		return project;
	}
	
	public Iterable<Project> findAllProjects(){
		return projectRepository.findAll();
	}
	
	public void deleteProjectByIdentifier (String projectid) {
		Project project = projectRepository.findByProjectIdentifier(projectid);
		
		if(project == null) {
			throw new ProjectIdException("Cannot delete the project with ID "+ projectid + ". This project doesn't exist");
		}
		
		projectRepository.delete(project);
		
	}
	
}
