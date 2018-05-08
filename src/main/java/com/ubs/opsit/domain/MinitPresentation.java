package com.ubs.opsit.domain;

public class MinitPresentation extends TimeUnits{
	private static final String QTR_COLOUR= "R";
	private static final String MINIT_COLOUR= "Y";
	
	private String representationColour = "Y";
	
	public MinitPresentation(String timeString) {
		super(timeString);
	}
	
	public int get_qtrCount(){
		int count=0;
		
		count = getMinits() / 15;
		representationColour = QTR_COLOUR;
		return count;
	}
	
	public int get_5mCount(){
		int count = 0;
		count = (getMinits()/5) - get_qtrCount();
		representationColour = MINIT_COLOUR;
		return count;
	}
	
	public int get_1mCount(){
		int count= 0;
		count = (getMinits() % 5)/1;
		return count;
	}

	public String getRepresentationColour() {
		return representationColour;
	}
	
}
