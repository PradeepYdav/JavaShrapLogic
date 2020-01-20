package com.pradeep.LinkedListQuestions;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
	
	public int   getlength() {
		Node current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		
		System.out.println(count);
		return count ;
		
	}
	
	public void getMiddleElement() {
		int len=getlength();
		int count=len/2;
		int temp=0;
		Node current=head;
		while(current!=null && count!=temp) {
			temp++;
			current=current.next;
		}
		
		System.out.println(current.data);
	}
	
	public void getMiddlePointUsingTwoPointer() {
		Node slowPtr=head;
		Node fastPtr=head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
		}
		
		System.out.println("middle point"+slowPtr.data);
	}
	
	public void getCounts(int data) {
		int count=0;
		Node current =head;
		while(current!=null) {
			if(current.data==data) {
				count++;
			}
			current=current.next;
		}
		
		System.out.println("Total count ->"+data+"  is  ->"+count);
	}
	
	public void checkForPalindrome() {
		Node current=head;
		Node second=head;
		
		Stack<Integer> stack= new Stack<>();
		
		boolean flag=false;
		
		while(current!=null) {
			stack.push(current.data);
			current=current.next;
		}
		
		while(second!=null) {
			int i=stack.pop();
			if(second.data==i) {
				flag=true;
			}else {
				flag=false;
				break;
			}
			
			second=second.next;
		}
		
		if(flag) {
			System.out.println("yes");
		}else {
			System.out.println("no ");
		}
	}
	
	@SuppressWarnings("null")
	public void removeDuplicates() {
		Node current=head;
		while(current!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}
			current=current.next;
		}
		
	}
	
	public  void removeDuplicatesFromUmsorted() {
		Node current=head;
		Node temp=null;
		
		while(current!=null) {
			temp=current;
			
			while(temp.next!=null) {
				if(current.data==temp.next.data) {
					temp.next=temp.next.next;
				}else {
					temp=temp.next;
				}
			}
			
			current=current.next;
			
		}
	}
	

	public static void main(String[] args) {
//		Singlelinkdlist list = new Singlelinkdlist();
//		for(int i=0;i<5;i++) {
//			list.addToFirst(15);
//			}
//		for(int i=0;i<5;i++) {
//		list.addToFirst(i);
//		}
//		for(int i=0;i<5;i++) {
//			list.addToFirst(15);
//			}
//		
//		list.printList();
//		
//		list.deleteFromFirst();
//		
//		list.printList();
//		list.addToFront(10);
//		list.printList();
//		
//		list.addAfter(25, 2);
//		list.printList();
//		
//		list.addToLast(30);
//		list.printList();
//		
//		list.delete(25);
//		list.printList();
//		
////		list.deleteAfter(2, 3);
////		list.printList();
//		
//		list.getlength();
//		
//		list.getMiddleElement();
//		
//		list.getMiddlePointUsingTwoPointer();
//		
//		list.getCounts(15);
		
//		Singlelinkdlist plist = new Singlelinkdlist();
//		plist.addToFirst(1);
//		plist.addToFirst(2);
//		plist.addToFirst(3);
//		plist.addToFirst(4);
//		plist.addToFirst(3);
//		plist.addToFirst(2);
//		plist.addToFirst(1);
//		
//		plist.printList();
//		
//		plist.checkForPalindrome();
		
		
//		Singlelinkdlist rdlist = new Singlelinkdlist();
//		rdlist.addToFirst(11);
//		rdlist.addToFirst(11);
//		rdlist.addToFirst(21);
//		rdlist.addToFirst(43);
//		rdlist.addToFirst(43);
//		
//		rdlist.removeDuplicates();
//		
//		rdlist.printList();
//		
		Singlelinkdlist rdunsortedlist = new Singlelinkdlist();
		rdunsortedlist.addToFirst(10);
		rdunsortedlist.addToFirst(12);
		rdunsortedlist.addToFirst(11);
		rdunsortedlist.addToFirst(11);
		rdunsortedlist.addToFirst(12);
		rdunsortedlist.addToFirst(10);
		
		rdunsortedlist.printList();
		
		rdunsortedlist.removeDuplicatesFromUmsorted();
		
		rdunsortedlist.printList();
		
		
	
		
		
		
		

	}

}
