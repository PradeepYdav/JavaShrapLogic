package com.pradeep.doublelinkedlist;


public class App {
	
	public static void main(String[] args) {
		
		Employee pradeep= new Employee("pradeep", "yadav", 1);
		Employee jack= new Employee("jack", "yadav", 2);
		Employee mark= new Employee("mark", "yadav", 3);
		
		EmloyeeDoubleLinkedList linkedList= new EmloyeeDoubleLinkedList();
		linkedList.getSize();
		linkedList.addToFront(pradeep);
		linkedList.addToFront(jack);
		linkedList.addToFront(mark);
		
		linkedList.getSize();
		linkedList.printList();
		
		Employee john= new Employee("john", "yadav", 3);
		linkedList.addToEnd(john);
		linkedList.printList();
		
		linkedList.removeFromFront();
		linkedList.printList();
		
		linkedList.removeFromEnd();
		linkedList.printList();
		
		
		
		
	}

}
