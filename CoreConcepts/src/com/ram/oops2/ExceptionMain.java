package com.ram.oops2;

public class ExceptionMain {
	
	int[] nums = new int[8];
	
	void numbers() {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		System.out.println("numbers()");
	}
	
	

	public static void main(String[] args) {

		ExceptionMain main = new ExceptionMain();
		
		main.numbers();
		
		try {
			System.out.println(main.nums[8]);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Only 8 numbers are available");
			System.out.println(e.getStackTrace());			
		} catch (NumberFormatException e) {
			System.out.println("Unknown Exception");
			System.out.println(e.getStackTrace());			
		} catch (Exception e) {
			System.out.println("Only 8 numbers are available");
			System.out.println(e.getStackTrace());
		}		
		

	}

}
