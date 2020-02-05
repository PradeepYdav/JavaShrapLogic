package com.pradeep.geeksForgeeksListTree;

public class BST {
	Node root;
	class Node{
		int key;
		Node left;
		Node right;
		
		Node(int key){
			this.key=key;
		}
	}
	
	public void insert(int key) {
		root=inserRec(root,key);
	}

	private Node inserRec(Node root,int key) {
		
		if(root==null) {
			root= new Node(key);
			return root;
		}
		
		if(key<root.key) {
			root.left=inserRec(root.left, key);
		}else if(key>root.key) {
			root.right=inserRec(root.right, key);
		}
		
		return root;
	}
	
	public void prinInorder() {
		inorderRec(root);
	}

	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree= new BST();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        tree.prinInorder();
		

	}

}
