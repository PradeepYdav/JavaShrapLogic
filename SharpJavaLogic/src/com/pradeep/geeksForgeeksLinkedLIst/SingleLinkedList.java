package com.pradeep.geeksForgeeksLinkedLIst;

import java.util.Stack;

import javax.swing.text.DefaultEditorKit.CutAction;

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
	
	public void printMiddle() {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		System.out.println(slow.data);
		
		
		
	}
	
	public void checkPalindrome() {
		Node current=head;
		Node current2=head;
		
		
		boolean isPalim=true;
		Stack<Integer> stack= new Stack<Integer>();
		
		while(current!=null) {
			stack.add(current.data);
			current=current.next;
		}
		
		while(current2!=null) {
			int i=stack.pop();
			if(current2.data==i) {
				isPalim=true;
			}else {
				isPalim=false;
				break;
			}
			current2=current2.next;
		}
		
		System.out.println(isPalim);
		
		
		
	}
	
	public void  removeduplicates() {
		Node current=head;
		while(current!=null) {
			Node temp=current;
			while(temp!=null && temp.data==current.data) {
				temp=temp.next;
			}
			current.next=temp;
			current=current.next;
		}
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList list= new SingleLinkedList();
//		for(int i=0;i<8;i++) {
//			list.insert(i);
//		}
//		
//		list.printList();
//		
//		list.deleteKey(4);
//		list.printList();
//		//list.deleteLinkedlist();
//		
//		//list.printList();
//		
//		list.length();
//		
//		System.out.println(list.lengthrec());
//		
//		System.out.println(list.find(8));
//		System.out.println(list.findr(5));
//		
//		list.printMiddle();
//		
//		list.insert(1);
//		list.insert(2);
//		list.insert(2);
//		list.insert(1);
//		
//		list.checkPalindrome();
//		
		list.insert(1);
		list.insert(2);
		list.insert(2);
		list.insert(3);
		
		list.removeduplicates();
		list.printList();
		
		

	}

}
