package com.beans.familybusiness.entity;

public class Benefit {

    private Long id;
    private String name;
    private String description;
    private String eligibility;
    private String applicationMethod;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getApplicationMethod() {
		return applicationMethod;
	}
	public void setApplicationMethod(String applicationMethod) {
		this.applicationMethod = applicationMethod;
	}

    // Getters and setters
}
