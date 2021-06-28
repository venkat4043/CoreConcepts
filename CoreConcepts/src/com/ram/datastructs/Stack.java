package com.ram.datastructs;

public class Stack {

	
	int stack[] = new int[5];
	int top = 0;
	
	public void push(int i) {
		
		if(top==stack.length) {
			System.out.println("Stack is full");
		}else {			
			stack[top] = i;
			top ++;
			
			//System.out.println(stack[0] + "," + stack[1]);
			System.out.println("top =" + top);	
			
			//System.out.println("length is : " + stack.length);
		}
	}

	public void show() {

		for (int i : stack) {
			System.out.print(i + " ");			
		}
		System.out.println();		
	}

	public void pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {		
			//System.out.println("top =" + top);
			top--;
			System.out.println("deleted " + stack[top]);
			stack[top] = 0;
			System.out.println("top =" + top);
		}
		
	}

	public void peek() {
		top--;
		System.out.println("last value " + stack[top]);
		
	}

	public boolean isEmpty() {
		if(top<=0)
			return true;
		return false;
	}

	public int size() {	
		
		return top;
	}
}
