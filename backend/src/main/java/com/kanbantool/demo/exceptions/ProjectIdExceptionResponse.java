package com.kanbantool.demo.exceptions;

public class ProjectIdExceptionResponse {
	private String projectIdentifier;

	public ProjectIdExceptionResponse(String projectIdentifer) {
		this.projectIdentifier = projectIdentifer;
	}

	public String getProjectIdentifer() {
		return projectIdentifier;
	}

	public void setProjectIdentifer(String projectIdentifer) {
		this.projectIdentifier = projectIdentifer;
	}
	
	
	

}
