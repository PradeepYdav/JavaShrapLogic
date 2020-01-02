package com.pradeep.linkedlist;

public class SinglyLinkedList {
	
	Node head;
	
	
	class Node{
		
		int num;
		Node next;
		
		Node(int num){
			this.num=num;
		}
		
		public String toString() {
			return Integer.toString(num);
		}
		
	}
	
	public void  addToFront(int num) {
		Node node= new Node(num);
		node.next=head;
		head=node;
	}
	
	public void printList() {
		Node current =head;
		System.out.print("Head ->");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" ->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public void removeFromFront() {
		
		head=head.next;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList list= new SinglyLinkedList();
		
		for (int i = 0; i < 5; i++) {
			list.addToFront(i);
			
		}
		list.printList();
		
		for (int i = 0; i < 5; i++) {
			list.removeFromFront();
			System.out.println();
			list.printList();
		}
		

		for (int i = 0; i < 8; i++) {
			list.addToFront(i);
			
		}
		
		for (int i = 0; i < 5; i++) {
			list.removeFromFront();
			System.out.println();
			list.printList();
		}
		
		

	}

}
