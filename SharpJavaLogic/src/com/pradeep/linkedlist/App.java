package com.pradeep.linkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee pradeep= new Employee("pradeep", "yadav", 1);
		Employee jack= new Employee("jack", "yadav", 2);
		Employee mark= new Employee("mark", "yadav", 3);
		
		EmployeeLinkedList list=new EmployeeLinkedList();
		list.addToFront(pradeep);
		list.addToFront(jack);
		list.addToFront(mark);
		
		list.printList();

	}

}
