//package com.ram.core;
//
//class Hi extends Thread{	
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
//
//class Hello extends Thread{
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
//
//public class ThreadDemo {	
//	public static void main(String[] args) throws InterruptedException {
//		Hi hi = new Hi();
//		Hello hello = new Hello();
//		hi.start();
//		Thread.sleep(100);
//		hello.start();
//	}
//}
