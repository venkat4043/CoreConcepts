package com.ram.oops2;



public class q11 {
	
	double d;
	
	public void printClassLoaders() throws ClassNotFoundException {

	    System.out.println("Classloader of this class:"
	        + PrintClassLoader.class.getClassLoader());

//	    System.out.println("Classloader of Logging:"
//	        + Logging.class.getClassLoader());
//
//	    System.out.println("Classloader of ArrayList:"
//	        + ArrayList.class.getClassLoader());
	}

	public static void main(String as[]) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		long l = 2147483649L;
//		System.out.println(l);
		
		int a = 2;
		long b = 4;
		short c = 6;
		System.out.println(++a + b++ *c);
		
		//double d = 0;
		
		System.out.println(new q11().d);
		
		System.out.println(Math.floor(10));
		System.out.println(Math.ceil(10));
		System.out.println((10));
		
		new q11().printClassLoaders();
		
		

	}

}
