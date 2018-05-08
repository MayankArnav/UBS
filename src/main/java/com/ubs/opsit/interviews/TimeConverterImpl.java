package com.ubs.opsit.interviews;

import com.ubs.opsit.domain.BerlinClock;

public class TimeConverterImpl implements TimeConverter{
	BerlinClock berlinClock;
	@Override
	public String convertTime(String time) {
		berlinClock=new BerlinClock(time);
		// TODO Auto-generated method stub
		String berlinTimeSTring = berlinClock.toString();
		System.out.println(berlinTimeSTring);
		return berlinTimeSTring;
	}	

}
