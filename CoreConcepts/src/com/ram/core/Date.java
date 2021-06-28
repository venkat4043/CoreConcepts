package com.ram.core;

public class Date {
	
	byte day = 0;
	byte month = 0;
	int year = 0;
	
	public Date(int day, int month, int year) {
		this.day = (byte)day;
		this.month = (byte)month;
		this.year = year;
	}
	
	public Date() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Date) {
			Date temp = (Date) obj;
			result = ((temp.day == day) && (temp.month == month) && (temp.year == year));
		}
		return result;
	}
	
	public byte getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = (byte)day;
	}
	public byte getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = (byte)month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
