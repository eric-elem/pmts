package com.ericelem.pmts.models;

public class Release {
	private int releaseNumber;
	
	public Release(int releaseNumber) {
		this.releaseNumber = releaseNumber;
	}
	
	public int getReleaseNumber() {
		return releaseNumber;
	}
	public void getReleaseNumber(int releaseNumber) {
		this.releaseNumber = releaseNumber;
	}
	
}
