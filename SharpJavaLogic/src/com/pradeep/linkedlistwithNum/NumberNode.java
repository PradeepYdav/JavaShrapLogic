package com.pradeep.linkedlistwithNum;

public class NumberNode {
	
	int num;
	NumberNode next;
	
	public NumberNode(int number) {
		this.num=number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return Integer.toString(num);
		//return "NumberNode [num=" + num + "]";
	}
	
	
	
	

}

class LinkedList{
	
	NumberNode head;
	
	public void addTofFront(int num) {
		NumberNode node= new NumberNode(num);
		node.next=head;
		head=node;
	}
	
	public void printList() {
		NumberNode current=head;
		System.out.print(" Head -> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print("  -> ");
			current=current.next;
			
		}
		System.out.print("null");
		
	}
	
}


