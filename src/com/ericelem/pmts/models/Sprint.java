package com.ericelem.pmts.models;

import java.util.Date;

public class Sprint {
	private Date dueDate;
	private double workCompleted;
	private double workRemaining;
	
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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
