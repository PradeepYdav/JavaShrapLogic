package com.pradeep.doublelinkedlist;

public class DoublyLinkedlist {
	
	Node head;
	Node tail;
	
	class Node{
		int num;
		Node next;
		Node previous;
		
		public Node(int num) {
			this.num=num;
		}
		
		public String toString() {
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
	}
	
	public void addToEnd(int num) {
		Node node= new Node(num);
		if(tail==null) {
			head=node;
		}else {
			tail.next=node;
			node.previous=tail;
		}
		tail=node;
	}
	
	
	public void removeFromFront() {
		Node remoNode=head;
		
		if(head.next==null) {
			tail=null;
		}else {
			head.next.previous=null;
		}
		
		head=head.next;
		remoNode.next=null;
	}
	
	public void removeFromEnd() {
		
		if(tail.previous==null) {
			head=null;
		}else {
			tail.previous.next=null;
		}
		tail=tail.previous;
		
		 
	}
	
	
	public void printList() {
	 Node current=head;
	 System.out.print("Head ->");
	 while(current!=null) {
		 System.out.print(current);
		 System.out.print(" <=> ");
		 current=current.next;
	 }
	 System.out.print("null\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedlist list = new DoublyLinkedlist();
		
		for(int i=0;i<5;i++) {
			list.addToFront(i);
		}
		
		list.printList();
		
		for(int i=10;i<15;i++) {
			list.addToEnd(i);
		}
		
		list.printList();
		
		list.removeFromFront();
		list.removeFromFront();
		
		list.printList();
		
		list.removeFromEnd();
		list.removeFromEnd();
		
		list.printList();
		

	}

}
