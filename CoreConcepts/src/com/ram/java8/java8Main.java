package com.ram.java8;

import java.time.LocalDate;

public class java8Main {
	
	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		print(date);
		print(date.plusWeeks(1));
		print(date.minusWeeks(1));
		print(date.isAfter(date.minusWeeks(1)));
		
		String string = "Hello";
		print(string);
		

	}

}
