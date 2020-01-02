package com.pradeep.doublelinkedlist;


public class EmloyeeDoubleLinkedList {
	
	EmployeeNode head;
	EmployeeNode tail;
	int size;
	
	public void  addToFront(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		node.setNext(head);
		
		if(head==null) {
			tail=node;
		}else {
			head.setPrevious(node);
		}
		head=node;
		size++;
		
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		if(tail==null) {
			head=node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail=node;
	}
	
	public void removeFromFront() {
		if(head.getNext()==null) {
			tail=null;
		}
		else {
			head.getNext().setPrevious(null);
		}
		head=head.getNext();
	}
	
//	public void removeFromEnd() {
//		if(tail.getPrevious()==null) {
//			head=null;
//		}else {
//			tail.getPrevious().setNext(null);
//		}
//		tail=tail.getPrevious();
//	}
	
	 public EmployeeNode removeFromEnd() {

	        EmployeeNode removedNode = tail;

	        if (tail.getPrevious() == null) {
	            head = null;
	        }
	        else {
	            tail.getPrevious().setNext(null);
	        }

	        tail = tail.getPrevious();
	        size--;
	        removedNode.setPrevious(null);
	        return removedNode;
	    }

	
	public void getSize() {
		System.out.println(size);
	}
	
	public void printList() {
		EmployeeNode current=head;
		System.out.print("Head ->");
		while(current!=null) {
			System.out.print(current);
			System.out.print("<=>");
			current=current.getNext();
		}
		System.out.print("null \n");
	}

}
