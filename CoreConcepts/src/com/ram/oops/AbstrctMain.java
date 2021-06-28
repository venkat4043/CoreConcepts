package com.ram.oops;

public class AbstrctMain extends Sample {
	
	@Override
	 void hello() {
		System.out.println("Hello over ridded");		
	}
	
	public static void main(String[] args) {
		new AbstrctMain().hello();
	}

}
