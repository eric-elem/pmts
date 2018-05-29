package com.ericelem.pmts.models;

public class Feature {
	private String title;
	private String description;
	private double effortRequired;
	private double workCompleted;
	private double workRemaining;
	
	public Feature(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getEffortRequired() {
		return effortRequired;
	}
	public void setEffortRequired(double effortRequired) {
		this.effortRequired = effortRequired;
	}
	public double getWorkCompleted() {
		return workCompleted;
	}
	public void setWorkCompleted(double workCompleted) {
		this.workCompleted = workCompleted;
	}
	public double getWorkRemaining() {
		return workRemaining;
	}
	public void setWorkRemaining(double workRemaining) {
		this.workRemaining = workRemaining;
	}
}

