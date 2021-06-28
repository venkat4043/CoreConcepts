package com.ram.datastructs;

public class LinkedList {
	
	Node head;
	
	public void add(int data) {
		//System.out.println("add()");
		
		Node node = new Node();		
		node.data = data;
		node.next = null;	
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void addFirst(int data) {
		//System.out.println("addFirst()");
		
		Node node = new Node();		
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;		
	}
	
	public void addAt(int index, int data) {
		//System.out.println("addAt()");
		
		Node node = new Node();		
		node.data = data;
		node.next = null;		
	
		if(index==0) {
			addFirst(data); 
		}else {		
		Node n = head;
		
		for(int i=0; i<index-1; i++) {
			n = n.next;			
		}
		node.next = n.next;
		n.next = node;
		}
	}
	
	public void show() {
		
		//System.out.println("Show()");
		
		Node n = head;
		
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void deleteAt(int index) {

		Node n = head;
		Node n1 = null;
		
		for(int i=0; i<index-1; i++) {			
			n = n.next;			
		}
		n1 = n.next;
		n.next = n1.next;
		//System.out.println("n1" + n1.data);
		//System.out.println("n" + n.data);
		
		
		
		//System.out.println(n.data);
		
	}
	


}
