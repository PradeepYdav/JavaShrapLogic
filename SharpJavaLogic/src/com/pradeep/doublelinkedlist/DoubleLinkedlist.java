package com.pradeep.doublelinkedlist;

public class DoubleLinkedlist {
	Node head;
	Node tail;
	
	
	class Node {
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
		 
		Node node = new Node(num);
		node.next=head;
		
		if(head==null) {
			tail=node;
		}else {
			head.previous=node;
		}
		
		head=node;
		
		 
	 }
	 
	 public void addToBack(int num) {
		 Node node = new Node(num);
		 
		 if(tail==null) {
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
	 
	 public void removeFromBack() {
		 if(tail.previous==null) {
			 head=null;
		 }else {
			 tail.previous.next=null;
		 }
		 tail=tail.previous;
	 }
	 
	 public void printlist() {
		 Node current=head;
		 System.out.print("Head -> ");
		 while(current!=null) {
			 System.out.print(current);
			 System.out.print(" <=> ");
			 current=current.next;
		 }
		 System.out.print("null \n");
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedlist list= new DoubleLinkedlist();
		
		for(int i=0;i<5;i++) {
			list.addToFront(i);
		}
		
		list.printlist();
		
		for(int i=15;i<20;i++) {
			list.addToBack(i);
		}
		
		list.printlist();
		
		list.removeFromFront();
		list.printlist();
		
		list.removeFromBack();
		list.printlist();

	}

}
