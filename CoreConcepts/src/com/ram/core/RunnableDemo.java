package com.ram.core;

//class Hi implements Runnable{	
//	public void run() {		
//		for(int i=0; i<5; i++) {
//			System.out.println("Hi");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

//class Hello implements Runnable{
//	public void run() {
//		for(int i=0; i<5; i++) {
//			System.out.println("Hello");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class RunnableDemo {	
	public static void main(String[] args) throws InterruptedException {
//		Runnable hi = () ->
//				{		
//				for(int i=0; i<5; i++) {
//					System.out.println("Hi");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}			
//		;
//		Runnable hello = () -> 
//				{
//				for(int i=0; i<5; i++) {
//					System.out.println("Hello");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		;
		
		Thread thread1 = new Thread(() ->
		{		
		for(int i=0; i<5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}			
);
		Thread thread2 = new Thread(() -> 
		{
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
		
		System.out.println("Thread1 priority :" + thread1.getPriority());
		
		System.out.println("Thread1 before start :" + thread1.isAlive()); 
		System.out.println(thread1.getName()); 
		System.out.println(thread2.getName()); 
		
		thread1.start();
		
		System.out.println("Thread1 after start :" + thread1.isAlive());
		Thread.sleep(100);
		thread2.start();	
		
		thread1.join();
		thread2.join();
		
		System.out.println("Thread1 after join :" + thread1.isAlive()); 
		
		System.out.println("Thread1 priority after join :" + thread1.getPriority());
				
		thread1.setName("Hi Thread");
		thread2.setName("Hello Thread");
		
		System.out.println(thread1.getName()); 
		System.out.println(thread2.getName());
		
		System.out.println("Bye");
	}
}
