package com.pradeep.BinarySearchtreeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorImage {
	
	Node root;
	
	class Node{
		int key;
		Node left;
		Node right;
		
		Node(int key){
			this.key=key;
		}
		
		public String toString() {
			return Integer.toString(key);
		}
	}
	
	public void add(int key) {
		root=addRec(root,key);
	}

	private Node addRec(Node root, int key) {
		if(root==null) {
			root= new Node(key);
			return root;
		}
		
		if(key<root.key) {
			root.left=addRec(root.left, key);
		}else if(key>root.key) {
			root.right=addRec(root.right, key);
		}
		
		
		return root;
	}
	
	public void inorder() {
		inorderRec(root);
	}

	private void inorderRec(Node root) {
		// TODO Auto-generated method stub
		Node current=root;
		if(current!=null) {
			inorderRec(current.left);
			System.out.print(current+" ");
			inorderRec(current.right);
		}
		
	}
	
	public void mirror() {
		root=mirrorRec(root);
	}

	private Node mirrorRec(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return root;
		}
		
		Node left=mirrorRec(root.left);
		Node right=mirrorRec(root.right);
		
		root.left=right;
		root.right=left;
		return root ;
	}
	
	public void printDfs() {
		if (root==null) {
			return ;
		}
		
	Queue<Node> nodes= new LinkedList<Node>();
	nodes.add(root);
	
	while(!nodes.isEmpty()) {
		Node node= nodes.remove();
		
		System.out.print(node+" ");
		if(node.left!=null) {
			nodes.add(node.left);
		}
		if(node.right!=null) {
			nodes.add(node.right);
		}
	}
		
		
	}
	
	public int getLevel(int key) {
		int level=0;
		int value=getrec(root,key, level);
		
		return value;
	}


	private int getrec(Node root, int key, int level) {
		
		if(root==null || root.key==key) {
			return level;
		}
	
		
		if(key<root.key) {
			return getrec(root.left,key,level+1);
		}
		else if(key>root.key) {
			return getrec(root.right,key,level+1);
		}
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MirrorImage bt=  new MirrorImage();
		bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    
	    bt.inorder();
	    System.out.println("\n");
	   // bt.mirror();
	    
//	    bt.inorder();
//	    System.out.println("\n");
//	    
//	    bt.printDfs();
	    
	    System.out.println(bt.getLevel(8));
	    
	    int [] array= new int[5];

	}

}
