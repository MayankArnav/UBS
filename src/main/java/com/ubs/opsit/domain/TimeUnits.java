package com.ubs.opsit.domain;

public class TimeUnits {
	
	private int hours;
	private int minits;
	private int seconds;
	
	TimeUnits (){
		super();
	}
	
	TimeUnits(String timeString){
		
		String[] units=timeString.split(":");
		hours= Integer.parseInt(units[0]);
		minits= Integer.parseInt(units[1]);
		seconds= Integer.parseInt(units[2]);
		
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinits() {
		return minits;
	}
		
	public void setMinits(int minits) {
		this.minits = minits;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
}
