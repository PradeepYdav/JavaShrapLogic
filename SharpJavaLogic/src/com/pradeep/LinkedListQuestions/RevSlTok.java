package com.pradeep.LinkedListQuestions;

import java.util.LinkedList;

public class RevSlTok {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
		
	}
	
	public void insert(int data) {
		Node node= new Node(data);
		node.next=head;
		head=node;
	}
	
	public void  printList() {
		Node current=head;
		System.out.print("Head->");
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("null \n");
	}

	private void reverse() {
		Node previous=null;
		Node current=head;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head=previous;
		
	}
	
	public Node reverseTillk(Node head,int k) {
		Node previous=null;
		Node current=head;
		Node next=null;
		int count=0;
		
		while(count<k && current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			count++;
		}
		
		if(next!=null) {
			head.next=reverseTillk(next, k);
		}
		
		return previous;
		
	}
	
	Node reverse(Node head, int k) 
    { 
       Node current = head; 
       Node next = null; 
       Node prev = null; 
         
       int count = 0; 
  
       /* Reverse first k nodes of linked list */
       while (count < k && current != null)  
       { 
           next = current.next; 
           current.next = prev; 
           prev = current; 
           current = next; 
           count++; 
       } 
  
       /* next is now a pointer to (k+1)th node  
          Recursively call for the list starting from current. 
          And make rest of the list as next of first node */
       if (next != null)  
          head.next = reverse(next, k); 
  
       // prev is now head of input list 
       return prev; 
    }                   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RevSlTok list= new RevSlTok();
		
		list.insert(6);
	    list.insert(4);
	    list.insert(8);
	    list.insert(3);
	    list.insert(5);
	    list.insert(7);
	    list.insert(9);
	    
	    list.printList();
	    
//	    list.reverse();
//	    
//	    list.printList();
	    
	    list.head =  list.reverseTillk(list.head, 3);
	    list.printList();
	    
//	    list.head = list.reverse(list.head, 3); 
//	    list.printList();
	    
	 

	}

}
