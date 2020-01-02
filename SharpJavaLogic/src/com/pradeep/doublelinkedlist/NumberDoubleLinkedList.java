package com.pradeep.doublelinkedlist;

public class NumberDoubleLinkedList {
	
	Node head;
	Node tail;
	int size;
	
	class Node{
		private int num;
		private Node next;
		private Node previous;
		
		public Node(int num) {
			this.num=num;
		}
		
		public  String toString() {
			return Integer.toString(num);
		}
		
	}
	
	public void addToFront(int num) {
		Node node= new Node(num);
		node.next=head;
		
		if(head==null) {
			tail=node;
		}else {
			node.previous=node;
		}
		head=node;
		size++;
	}
	
	public void getSize() {
		System.out.println(size);
	}
	
	public void printList() {
		Node current =head;
		System.out.print("Head -> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current=current.next;
			
		}
		System.out.print("null");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberDoubleLinkedList linkedList= new NumberDoubleLinkedList();
		
		linkedList.getSize();
		
		linkedList.addToFront(0);
		linkedList.addToFront(1);
		linkedList.addToFront(2);
		linkedList.addToFront(3);
		linkedList.addToFront(4);
		
		linkedList.getSize();
		linkedList.printList();

	}

}
