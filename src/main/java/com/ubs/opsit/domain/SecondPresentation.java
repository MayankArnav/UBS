package com.ubs.opsit.domain;

public class SecondPresentation extends TimeUnits{
	
	private String representationColour = "Y";
	public SecondPresentation(String timeString) {
		super(timeString);
	}
	public int get_1mCount(){
		int count= 0;
		count = (getSeconds()+1) % 2;
		return count;
	}
	public String getRepresentationColour() {
		return representationColour;
	}
	
	
}
