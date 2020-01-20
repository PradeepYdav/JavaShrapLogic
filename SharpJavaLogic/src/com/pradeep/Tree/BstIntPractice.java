package com.pradeep.Tree;


public class BstIntPractice {
	Node root;
	class Node{
		int key;
		Node left,right;
		
		Node(int key){
			this.key=key;
		}
		
		public String toString() {
			return Integer.toString(key);
		}
	}
	
	BstIntPractice(){
		root=null;
	}
	
	public void insert(int key) {
		root=insertRec(root,key);
	}
	

	public Node insertRec(Node root, int key) {
		if(root==null) {
			root= new Node(key);
			return root;
		}
		
		if(key<root.key) {
			root.left=insertRec(root.left, key);
		}
		else if(key>root.key) {
			root.right=insertRec(root.right, key);
		}
		
		return root;
		
	}
	
	public void inorderPrint() {
		inorderRec(root);
	}
	
	void  inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	
	public Node search(int key) {
		 Node keys=searchRec(root,key);
		return keys;
	}
	
	private Node searchRec(Node root, int key) {
		if(root==null  || root.key==key) {
			return root;
		}
		
		if(key<root.key) {
			return searchRec(root.left, key);
		}else if(key>root.key){
			return searchRec(root.right, key);
		}
		
		return null;
	}
	
	public void delete(int key) {
		deleteRec(root,key);
	}
	
	private Node deleteRec(Node root,int key) {
		if(root==null) {
			return root;
		}
		
		if(key<root.key) {
			root.left=deleteRec(root.left, key);
		}
		else if(key>root.key) {
			root.right=deleteRec(root.right, key);
		}
		
		else {
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			
			root.key=minvalue(root.right);
			root.right=deleteRec(root.right, root.key);
			
			
		}
		
		
		
		return root;
	}

	

	private int minvalue(Node root) {
		// TODO Auto-generated method stub
		int min=root.key;
		while(root.left!=null) {
			min=root.left.key;
			root=root.left;
		}
		return min;
	}
	
	public int minValueintree() {
		Node current=root;
		while(current.left!=null) {
			current=current.left;
		}
		return current.key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BstIntPractice tree= new BstIntPractice();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        tree.inorderPrint();
        
        System.out.println("------------------");
        
    //    System.out.println(tree.search(100));
        
        tree.delete(20);
        tree.inorderPrint();
        
        System.out.println(tree.minValueintree());
        
		
		

	}

}
