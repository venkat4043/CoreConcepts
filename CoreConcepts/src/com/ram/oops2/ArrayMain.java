package com.ram.oops2;

public class ArrayMain {	
	
//	public void print(int[] nums) {
//		for (int i : nums) {
//			System.out.println(i);
//		}
//	}
	 static int[] nums = {10,11};
	  {
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	public void print(String... nums) {
		for (String i : nums) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ArrayMain main = new ArrayMain();
		
		int[] nums = {1,2};
		//main.print(nums);
		
		String[] names = {"Ram", "Raj"};
		main.print(names);
		main.print();
		
//		int[] numbers = {1,2};
//		int[] numbers2 = new int[2];
//		numbers2[0] = 3;
//		numbers2[1] = 4;
//		
//		for (int number : numbers2) {
//			System.out.println(number);
//		}
//		
//		System.out.println(numbers.length);
//		System.out.println(numbers2.length);
		
//		int x = numbers.length;
//		System.out.println(x);

	}

}
