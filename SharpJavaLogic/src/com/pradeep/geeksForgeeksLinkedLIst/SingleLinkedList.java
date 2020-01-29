package com.pradeep.geeksForgeeksLinkedLIst;

public class SingleLinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
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
		Node current=head;
		System.out.print("Head -> ");
		while(current!=null) {
			System.out.print(current.data +"->");
			current=current.next;
		}
		System.out.print(" null \n");
	}
	
	public void deleteKey(int data) {
		Node current=head;
		Node prevous=null;
		while(current!=null && current.data != data) {
			prevous=current;
			current=current.next;
		}
		prevous.next=current.next;
		
	}
	
	public void deleteLinkedlist() {
		head=null;
	}
	
	public void length() {
		Node current=head;
		int count=0;
		while(current!=null) {
			current=current.next;
			count++;
		}
		System.out.println(count);
	}
	
	public int lengthrec() {
		int count=0;
		int len=lenrec(head,count);
		return len;
	}
	
	private int lenrec(Node head2,int len) {
		if(head2==null) {
			return len;
		}
		return lenrec(head2.next,len+1);
	}
	
	
	public Node find(int data) {
		Node current=head;
		while(current!=null && current.data!=data) {
			current=current.next;
		}
		return current;
	}
	
	public boolean findr(int key) {
		return findrec(head,key);
	}

	private boolean findrec(Node head2, int key) {
		// TODO Auto-generated method stub
		
		if(head2==null) {
			return false;
		}
		
		if(head2.data==key) {
			return true;
		}
		return findrec(head2.next,key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList list= new SingleLinkedList();
		for(int i=0;i<6;i++) {
			list.insert(i);
		}
		
		list.printList();
		
		list.deleteKey(4);
		list.printList();
		//list.deleteLinkedlist();
		
		//list.printList();
		
		list.length();
		
		System.out.println(list.lengthrec());
		
		System.out.println(list.find(8));
		System.out.println(list.findr(5));
		
		

	}

}
