package com.pradeep.doublelinkedlist;


public class challenge1 {
	
	Node head;
	Node tail;
	
	class Node{
		int num;
		Node next;
		Node previous;
		
		Node(int num){
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
			head.previous=node;
		}
		head=node;
	}
	
	public void addToBack(int num) {
		Node node= new Node(num);
		if(head==null) {
			head=node;
		}else {
			tail.next=node;
			node.previous=tail;
		}
		tail=node;
	}
	
	public void removeFromFront() {
		if(head.next==null) {
			tail=null;
		}else {
			head.next.previous=null;
		}
		head=head.next;
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
		Node current =head;
		System.out.print("Head -> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current=current.next;
		}
		System.out.print("null \n");
	}
	
	public void addBefore(int numtoadd,int nobeforetoadd) {
		Node current= head;
		
		while(current!=null && !(current.num==nobeforetoadd)) {
			
			current=current.next;
		}
		
		
			Node newnode= new Node(numtoadd);
			newnode.previous=current.previous;
			newnode.next=current;
			current.previous=newnode;
			if(head==current) {
				head=newnode;
			}else {
				current.previous.next=newnode;
			}
		
		
		
	}
	
	

	public static void main(String[] args) {
		challenge1 list= new challenge1();
		
		for(int num=0;num<5;num++)
			list.addToFront(num);
			
			list.printList();
			
//			for(int num=10;num<15;num++)
//				list.addToBack(num);
//			
//				
//				list.printList();
//				
//				list.removeFromFront();
//
//				list.printList();
//				
//				list.removeFromEnd();
//
//				list.printList();
				
				list.addBefore(25, 1);
				
				list.printList();

	}

}
