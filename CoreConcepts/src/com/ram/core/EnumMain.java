package com.ram.core;

public class EnumMain {
	
	String s = null;
	int i = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
							
		System.out.println(Days.FRIDAY.toString());
		
		System.out.println("====================");
		
		System.out.println(MusicType.JAZZ);
		
		System.out.println(MusicType.JAZZ.calHearingLoss(4));

	}

}


