package com.ram.core;

public class Bitwise {
	
	public boolean isSleeping() {
		System.out.println("Sleeping");
		return true;
	}
	
	public boolean inHome() {
		System.out.println("Home");
		return true;
	}
	 
	public void check() {
		if(isSleeping() || inHome()) {
			System.out.println("Hello");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = -8;
		
		i = i >> 2;
		
		System.out.println(i);
		
		
		int x = 8;
		int y = 10;
		
		System.out.println("x&y - " + (x&y) + ";\nx|y - " + (x|y) + ";\nx^y - " + (x^y) + ";\n~x - " + ~x);
		
		System.out.println("=======================");
		
		Bitwise is = new Bitwise();
		
		is.check();
		
		

	}

}
