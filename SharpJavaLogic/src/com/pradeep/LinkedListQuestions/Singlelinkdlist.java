package com.pradeep.LinkedListQuestions;

public class Singlelinkdlist {
	Node head;
	
	 class Node {
		 
		 int data;
		 Node next;
		 
		 public Node (int data) {
			 this.data=data;
		 }
		 
		 public String toString() {
			 return Integer.toString(data);
		 }
	}
	
	 public void addToFirst(int data) {
		 Node node= new Node(data);
		 node.next=head;
		 head=node;
		 
	 }
	 
	 public void deleteFromFirst() {
		 head=head.next;
	 }
	 
	 public void addToFront(int data) {
		 Node node=new  Node(data);
		 node.next=head;
		 head=node;
	 }
	 
	 public void printList() {
		 Node current=head;
		 System.out.print("Head->");
		 while(current!=null) {
			 System.out.print(current);
			 System.out.print("->");
			 current=current.next;
		 }
		 
		 System.out.print("null \n");
	 }
	 
	 public void addAfter(int data,int aftervalue) {
		 Node current=head;
		 
		 while(current!=null) {
			 if(current.data==aftervalue) {
				 Node node = new Node(data);
				 node.next=current.next;
				 current.next=node;
				 break;
				 
			 }
			 current=current.next;
		 }
	 }
	 
	@SuppressWarnings("null")
	public void addToLast(int data) {
		 
		 Node current= head;
		 Node node= new Node(data);
		 node.next=null;
		 while(current.next!=null) {
			 current=current.next;
		 }
		 current.next=node;
	 }
	
	public void delete(int data) {
		Node temp=head,previous=null;
		
		while(temp!=null & temp.data!=data ) {
			previous=temp;
			temp=temp.next;
		}
		
		previous.next=temp.next;
		
	}
	
	public void deleteAfter(int data,int after) {
		Node current= head;
		Node prev=null;
		
		while(current!=null && current.data!=data) {
			prev= current;
			current=current.next;
		}
		
		prev.next=current.next.next;
	}
	
	public void  getlength() {
		Node current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		
		System.out.println(count);
		
	}
	

	public static void main(String[] args) {
		Singlelinkdlist list = new Singlelinkdlist();
		for(int i=0;i<5;i++) {
		list.addToFirst(i);
		}
		
		list.printList();
		
		list.deleteFromFirst();
		
		list.printList();
		list.addToFront(10);
		list.printList();
		
		list.addAfter(25, 2);
		list.printList();
		
		list.addToLast(30);
		list.printList();
		
		list.delete(25);
		list.printList();
		
		list.deleteAfter(2, 3);
		list.printList();
		
		list.getlength();

	}

}
