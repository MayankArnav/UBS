package com.ubs.opsit.domain;

public class HourPresentation extends TimeUnits{
	
	private String representationColour = "R";
	
	public HourPresentation(String timeString) {
		super(timeString);
	}
	public int get_5hCount(){
		int count = 0;
		count = getHours()/5;
		return count;
	}
	
	public int get_1hCount(){
		int count= 0;
		count = (getHours() - (get_5hCount()* 5))/1;
		return count;
	}
	public String getRepresentationColour() {
		return representationColour;
	}
	
	
	
	
	
}
