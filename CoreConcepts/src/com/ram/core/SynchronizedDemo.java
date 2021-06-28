package com.ram.core;

class Counter{
	int count;	
	public synchronized void increment() {
		//System.out.println("increment() called");
			count ++;				
	}	
}

public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Counter counter = new Counter();
		
//		counter.increment();
//		counter.increment();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}				
			}
		});	
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}				
			}
		});		
		
		thread1.start();
		thread2.start();	
		
		thread1.join();
		thread2.join();
		
		System.out.println("Count :" + counter.count);

	}

}
