package com.ram.core;
/**
 * @author Ram
 */


import java.lang.Math;

/**
 * 
 * Whats up
 *
 */

public class MainClass {
	
	int id;
	
	char ch = '\u0061';
	
	char c = 4;
	
	long num = 11111111111111111L;
	
	double sal = 1.1;
	
	float f = 1.1f;
	
	double d = 12_111.00;
	
	{
		number = 30;
		
	}
	
	static {
		number = 40;
	}
	
	private static int number = 100;
	
	private static String toUnicode(char ch) {
	    return String.format("\\u%04x", (int) ch);
	}
	
	
	
	
	
	//static int eid = 123;
	
//	MainClass(int number){
//		//int n = number;
//		System.out.println("Hello :" + number);
//	}
	
//	private MainClass() { 
//		System.out.println("private constructor");
//		Math m = null;
//		System.out.println(m.floor(10));
//	}
//	
//	static void print() {
//		System.out.println("static method");
//	}
	
	void hello(int b) {
		int a = b;
		System.out.println(a);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MainClass class1 = new MainClass(1);
//		System.out.println(class1.eid);
//		System.out.println(MainClass.eid);
//		
//		class1.print();
//		MainClass.print();
		
		//MainClass class2 = new MainClass();
		
		//class1.MainClass();
		
		
//		
//		Sample sample =  new Sample();
		
		
		
		
//		System.out.println(MainClass.number);
		
		
		
		MainClass class1 = new MainClass();
//		System.out.println(class1.sal);
		
//		System.out.println(class1.id);
//		
//		System.out.println("===============");
//		
//		class1.hello(2);
		
//		System.out.println(MainClass.toUnicode('b'));
		
		
//================================================================
		
		
		Date date = new Date(1,1,2000);
		Date date2 = new Date(1,1,2001);
		
		
		
		System.out.println(date.equals(date2));
		
		
		
		
		
		
		

	}

}
