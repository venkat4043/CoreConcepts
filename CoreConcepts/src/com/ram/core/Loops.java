package com.ram.core;

import java.awt.Label;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Loops");
		out_label:
		while(true) {
			int i = 0;
			in_label:
			while(true) {
				if(i>5) {
					break out_label;
				}else {			
					System.out.println(i++);
				}
			}		
			
		}

	}

}
