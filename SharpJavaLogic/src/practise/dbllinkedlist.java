package practise;

public class dbllinkedlist {
	
	Node head;
	Node tail;
	
	class Node{
		int num;
		Node next;
		Node previous;
		
		Node(int num){
			this.num=num;
		}
		
		public String toString() {
			return Integer.toString(num);
		}
	}
	
	public void addToFront(int num) {
		Node node = new Node(num);
		if(head==null) {
			tail=node;
		}else {
			head.previous=node;
			node.next=head;
		}
		
		head=node;
	}
	
	
	public void addToBack(int num) {
		Node node= new Node(num);
		if
		(tail==null) {
			head=node;
		}else {
			tail.next=node;
			node.previous=tail;
		}
		tail=node;
	}
	
	public void printList() {
		Node current =head;
		System.out.print("Head-> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current=current.next;
		}
		System.out.print("null \n");
	}
	
	
	public void  removeFromfront() {
		
		if(head.next==null) {
			tail=null;
		}else {
			head.next.previous=null;
		}
		head=head.next;
		
		
	}
	
	public void removeFromEnd() {
		if(tail.previous==null) {
			head=null;
		}else {
			tail.previous.next=null;
		}
		tail=tail.previous;
	}
	
	public void  addBefore(int num,int numbefore) {
		Node current=head;
		
		while(current!=null) {
			if(current.num==numbefore) {
				Node node =new Node(num);
				node.previous=current.previous;
				node.next=current;
				
				current.previous=node;
				current.previous.next=node;
				
				return ;
			}
			current=current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dbllinkedlist list = new dbllinkedlist();
		for(int num=0;num<5;num++) {
			list.addToFront(num);
		}
		
		list.printList();
		
		for(int num=10;num<15;num++) {
			list.addToBack(num);
		}
		list.printList();
		
		list.removeFromfront();
		
		list.printList();
		
		list.removeFromEnd();
		
		list.printList();
		
		list.addBefore(5, 12);
		list.printList();
		
		
		

	}

}
