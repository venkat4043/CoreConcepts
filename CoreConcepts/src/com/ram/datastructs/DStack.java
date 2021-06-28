package com.ram.datastructs;

public class DStack {
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int i) {
		
		//System.out.println(stack.length);
		if(top==stack.length) {
			expand();
		} 			
		stack[top] = i;
		top ++;
		
		//System.out.println(stack[0] + "," + stack[1]);
		System.out.println("top =" + top);	
		
		//System.out.println("length is : " + stack.length);
		
	}

	private void expand() {
		System.out.println("expand()");
		int newStack[] = new int[capacity*2];
		
		for (int i=0; i<size(); i++) {
			newStack[i] = stack[i];
			}
		stack = newStack;
		capacity *= 2;
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
		
		System.out.println("size is " + size());
		System.out.println("capacity is " + capacity);
		System.out.println("length is " + stack.length);
		
		if(size() <= capacity/2/2) {
			System.out.println("Vachesa");
			shrink();
		}
		
	}

	private void shrink() {
		System.out.println("shrink()");
		int newStack[] = new int[capacity/2];
		
		for (int i=0; i<size(); i++) {
			System.out.println("for");
			newStack[i] = stack[i];
			}
		stack = newStack;
		capacity = capacity/2;		

		
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
