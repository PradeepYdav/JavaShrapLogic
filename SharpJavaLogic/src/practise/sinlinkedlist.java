package practise;

public class sinlinkedlist {

	Node head;
	
	class Node{
		int num;
		Node next;
		
		Node(int num){
			this.num=num;
		}
		
		public String toString() {
			return Integer.toString(num);
		}
	}
	
	public void addToFront(int num) {
		Node newnode = new Node(num);
		newnode.next=head;
		
		head=newnode;
		
	}
	
	public void addBefore(int num ,int afternum) {
		Node current =head;
		while(current!=null) {
			if(current.num==afternum) {
				Node node = new Node(num);
				node.next=current.next;
				current.next=node;
				return;
			}
			current=current.next;
		}
	}
	
	public  void removeFromFront() {
		head=head.next;
	}
	
	public void printList() {
		Node current =head;
		System.out.print("Head ->");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" -> ");
			current=current.next;
		}
		System.out.print("null \n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sinlinkedlist list = new sinlinkedlist();
		for(int num=1;num<6;num++)
			list.addToFront(num);
		
		list.printList();
		
		list.addBefore(5, 3);
		list.printList();
		
		list.removeFromFront();
		list.printList();

	}

}
