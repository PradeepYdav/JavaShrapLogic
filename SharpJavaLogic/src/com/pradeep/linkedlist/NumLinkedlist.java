package com.pradeep.linkedlist;

public class NumLinkedlist {
	
	Node head;
	int size;
	
	class Node{
		int num;
		Node next;
		
		 Node(int num){
			 this.num=num;
		 }

		@Override
		public String toString() {
			return Integer.toString(num);
		}
		 
		
	}
	
	public void addToFront(int num) {
		Node node= new Node(num);
		node.next=head;
		head=node;
		size++;
	}
	
	public void printLinked() {
		Node current=head;
		System.out.print("Head->");
		while(current!=null) {
			System.out.print(current);
			System.out.print("->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public void getSize() {
		System.out.println(size);
	}
	
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void removeFromFirst() {
		if(isEmpty()) {
			return;
		}
		
		head=head.next;
		size--;
		
		
	}
	
	public static void main(String[] args) {
		NumLinkedlist list =  new NumLinkedlist();
		
		System.out.println(list.isEmpty());
		System.out.println("Size ");
		
		list.addToFront(0);
		list.addToFront(2);
		list.addToFront(3);
		list.addToFront(4);
		list.addToFront(5);
		
		
		list.printLinked();
		
		list.removeFromFirst();
		System.out.println("---------------");
		list.printLinked();
	}
	

}
