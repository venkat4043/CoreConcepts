package com.ram.datastructs;

import java.util.LinkedList;
import java.util.Stack;

public class DataStructsMain {

	public static void main(String[] args) {

// -------------- Linked list ---------------
		
//		LinkedList<Integer> integers = new LinkedList<Integer>();
//		
//		integers.add(12);
//		integers.add(20);
		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		
//		list.add(18);
//		list.add(18);
//		list.add(18);
//		
//		System.out.println(list);
		
//		LinkedList list = new LinkedList();
//		
//		list.add(15);
//		list.add(18);
//		list.add(21);
//		
//		list.addFirst(2);
//		
//		list.addAt(1, 43);
//		
//		//list.deleteAt(2);
//		
//		list.show();
		
	
//------------------Stack-----------------------
		
//		Stack<Integer> integers2 = new Stack<Integer>();
//		
//		integers2.add(1);
//		integers2.add(2);
//		integers2.add(3);
//		integers2.push(0);
//		integers2.pop();
//		
//		System.out.println(integers2);

//	Stack stack = new Stack();
	
//	stack.push(10);
//	stack.show();
//	stack.push(15);
//	stack.show();
//	stack.push(20);
//	stack.show();
//	stack.push(25);
//	stack.show();
//	stack.push(30);
//	stack.show();
//	stack.push(35);
//	stack.show();
	
//	stack.pop();
//	stack.show();
//	
//	stack.peek();
//	stack.show();
	
//	System.out.println("isEmpty " + stack.isEmpty());
	
//	System.out.println("size is " + stack.size());
	
	//System.out.println(stack);
	
	//stack.show();	
		
//----------------------DStack---------------------------
		
		DStack dStack = new DStack();
		dStack.push(10);
		dStack.show();
		dStack.push(15);
		dStack.show();
		dStack.push(20);
		dStack.show();
		dStack.push(25);
		dStack.show();
		dStack.push(30);
		dStack.show();
		dStack.push(35);
		dStack.show();
		
		dStack.pop();
		dStack.show();
		dStack.pop();
		dStack.show();
		dStack.pop();
		dStack.show();
		dStack.pop();
		dStack.show();
		
		System.out.println("size is " + dStack.size());
		System.out.println("capacity is " + dStack.capacity);
		
		
		
		
	}
}
