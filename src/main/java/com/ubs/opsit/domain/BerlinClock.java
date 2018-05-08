package com.ubs.opsit.domain;

public class BerlinClock {
	
	private String[] H1R5 = {"O","O","O","O"};
	private String[] H1R1 = {"O","O","O","O"};
	private String[] M1R15 = {"O","O","O"};;
	private String[] M1Y5 = {"O","O","O","O","O","O","O","O"};
	private String[] M1YR5 = {M1Y5[0],M1Y5[1],M1R15[0],M1Y5[2],M1Y5[3],M1R15[1],M1Y5[4],M1Y5[5],M1R15[2],M1Y5[6],M1Y5[7]};
	private String[] M1Y1 = {"O","O","O","O"};
	private String[] S1Y1 = {"O"};
	private String timeString = "";
	
	private HourPresentation hp;
	private MinitPresentation mp;
	private SecondPresentation sp;
	
	public BerlinClock(String timeString) {
		hp= new HourPresentation(timeString);
		mp= new MinitPresentation(timeString);
		sp= new SecondPresentation(timeString);
		
		convertTime(H1R5, hp.get_5hCount(),hp.getRepresentationColour());
		convertTime(H1R1, hp.get_1hCount(),hp.getRepresentationColour());
		convertTime(M1R15, mp.get_qtrCount(),mp.getRepresentationColour());
		convertTime(M1Y5, mp.get_5mCount(),mp.getRepresentationColour());
		convertTime(M1Y1, mp.get_1mCount(),mp.getRepresentationColour());
		convertTime(S1Y1, sp.get_1mCount(),sp.getRepresentationColour());
		
		
		
	}
	
	
	
	private void convertTime(String[] timeRow, int count, String colour){
		for(int i = 0; i< count; i++){
			timeRow[i] = colour;
		}
	}
	
	
	@Override
	public String toString() {
		String[] M1YR5 = {M1Y5[0],M1Y5[1],M1R15[0],M1Y5[2],M1Y5[3],M1R15[1],M1Y5[4],M1Y5[5],M1R15[2],M1Y5[6],M1Y5[7]};
		
		StringBuilder berlinTime = new StringBuilder();
		berlinTime.append(joinString(S1Y1)+"\n");
		berlinTime.append(joinString(H1R5)+"\n");
		berlinTime.append(joinString(H1R1)+"\n");
		berlinTime.append(joinString(M1YR5)+"\n");
		berlinTime.append(joinString(M1Y1)+"\n");
		
		
		// TODO Auto-generated method stub
		return berlinTime.toString();
	} 
	
	private String joinString(String[] arr){
		StringBuilder joinedString = new StringBuilder();
		for(String tmp : arr){
			joinedString.append(tmp);
		}
		return joinedString.toString();
	}
	
}
