package com.ram.oops2;

import com.ram.oops.Hello;

public class Overload extends Hello{
	
	int i = 1000;
	
	void method(){
		System.out.println(i);
		//i = super.i;
		System.out.println(i);
	}
	
//	public static void check() {
//		System.out.println("1");
//	}
//	public static int check(int a) {
//		return a;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		check();
//		System.out.println(check(2));
		
		Overload o = new Overload();
		o.method();

	}

}
