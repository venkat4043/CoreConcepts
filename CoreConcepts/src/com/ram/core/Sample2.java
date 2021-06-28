package com.ram.core;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short s = 40;		
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
//		s = (short)i;		
//		System.out.println(s);
		
//		String str ;
//		
//		str = "Ram";
//		
//		System.out.println(str);
//		
//		BigInteger bigInteger = new BigInteger("2");
//		
//		System.out.println(bigInteger);
//		
//		bigInteger = bigInteger.multiply(bigInteger);
//		
//		System.out.println(bigInteger);
//		
//		BigDecimal bigDecimal = new BigDecimal("11.11");
//		
//		System.out.println(bigDecimal);
//		
//		bigDecimal = BigDecimal.ZERO;
//		
//		System.out.println(bigDecimal);
		
		
//		int age = 26;
//		String message = null;
//		String otherMessage = null;
//		
//		if (age >= 25) { 
//		    message = "25 years or older.";
//		    otherMessage = "More text..."; // ILLEGAL
//		}
//		else if (age >= 20) {
//		    message = "Between 20 years and 24 years old";
//		    otherMessage = "More text..."; // ILLEGAL
//		}
//		else
//		    message = "Younger than 20.";
//		    System.out.println("More text..."); // LEGAL
//		
//		System.out.println(message);
//		System.out.println(otherMessage);
		
		int var = 'a';
		String msg = null;
		switch (var) {
		  //String msg = "Hello"; // ILLEGAL
		  case 'a': {
		  msg = "Hello!";
		  break;
		  }
		  default: {
		  msg = "Hey!";
		  break;
		  }
		}
		
		System.out.println(msg);
		System.out.println(var);
		
		

	}

}
