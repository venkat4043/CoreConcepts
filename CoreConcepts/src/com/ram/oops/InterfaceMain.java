package com.ram.oops;

import java.io.Serializable;
import java.security.PublicKey;
import java.time.LocalDate;

public class InterfaceMain implements Payable {
	
	//String wish;
	
	void wish(Wish w) {
		System.out.println(w.wish("Hello"));
	}
	
	public static void p(Object o){
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new InterfaceMain().check(new Payable() {
//			
//			@Override
//			public double pay() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
		
		InterfaceMain interfaceMain = new InterfaceMain();
		interfaceMain.wish(wish -> wish);
		
		
		
		LocalDate date = LocalDate.now(); p(date);

	}
	
	public void check(Payable p) {
		double gross = p.pay();
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
	
	

}
