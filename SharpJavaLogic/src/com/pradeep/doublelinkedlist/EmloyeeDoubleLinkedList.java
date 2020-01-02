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
	}

}
