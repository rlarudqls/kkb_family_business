package com.beans.familybusiness.dto;

public class BenefitDTO {

    private Long id;
    private String name;
    private String description;
    private String eligibility;
    private String applicationMethod;

    // Constructors (if needed)...

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEligibility() {
        return eligibility;
    }

    public String getApplicationMethod() {
        return applicationMethod;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public void setApplicationMethod(String applicationMethod) {
        this.applicationMethod = applicationMethod;
    }
}
