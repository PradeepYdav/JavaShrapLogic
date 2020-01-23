package com.pradeep.linkedlist;

public class Sllpract {
	Node head;
	
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
		
		public String toString() {
			return Integer.toString(data);
		}
	}
	
	public void insert(int data) {
		Node node= new Node(data);
		node.next=head;
		head=node;
	}
	
	public void printList() {
		Node current =head;
		System.out.print("Head ");
		while(current!=null){
			System.out.print(current);
			System.out.print("->");
			current=current.next;
		}
		System.out.print(" Null");
	}
	
	public void revLink() {
		Node previous=null;;
		Node current=head;
		Node next;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head=previous;
	}
	
	public void rev() {
		revrec(head);
	}
	

	private Node revrec(Node node) {
		Node first;
		if (head==null || head.next==null) {
			return node;
		}
		first=revrec(node.next);
		node.next.next=node;
		node.next=null;
		
		
		
		return first;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sllpract list= new Sllpract();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		list.printList();
		
//		list.revLink();
//		list.printList();
		
//		list.rev();
//		list.printList();
		

	}

}
