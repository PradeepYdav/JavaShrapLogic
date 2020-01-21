package com.pradeep.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Bstprac {
	Node root;
	class Node {
		int key;
		Node left,right;
		
		Node(int key){
			this.key=key;
		}
		
		public String toString() {
			return Integer.toString(key);
		}
	}
	
	
	public void insert(int key) {
		root=insertRec(root,key);
	}
	
	private Node insertRec(Node root,int key) {
		
		if(root==null) {
			root=new Node(key);
			return root;
		}
		
		if(key<root.key) {
			root.left=insertRec(root.left, key);
		}else if(key>root.key) {
			root.right=insertRec(root.right, key);
		}
		return root;
	}
	
	// left root right
	public void inorderPrint() {
		System.out.println("inorder print--------->");
		inorderRec(root);
		System.out.println("inorder printend--------->\n");
	}
	// left root right
	public void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	
	}
	
	//root left right
	public void preOrderPrint() {
		System.out.println("preorder print--------->");
		preOrderprintRec(root);
	}
	//root left right
	private void preOrderprintRec(Node root) {
		if(root!=null) {
			System.out.print(root.key+" ");
			preOrderprintRec(root.left);
			preOrderprintRec(root.right);
			
		}
		
	}
	
	
	public void traverselevelOrder() {
		if(root==null) {
			return ;
		}
		
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		while(!nodes.isEmpty()) {
			Node node=nodes.remove();
			
			System.out.print(node.key+" ");
			
			if(node.left!=null) {
				nodes.add(node.left);
			}
			if(node.right!=null) {
				nodes.add(node.right);
			}
		}
		
	}
	
	
	public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<Node> nodes = new LinkedList<>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.remove();
	 
	        System.out.print(" " + node.key);
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right!= null) {
	            nodes.add(node.right);
	        }
	    }
	}
	
	public void postorderprint() {
		System.out.println("post order print");
		postOrderprintRec(root);
	}

	private void postOrderprintRec(Node root) {
		if(root!=null) {
			postOrderprintRec(root.left);
			postOrderprintRec(root.right);
			System.out.print(root.key+" ");
		}
		
	}

	public Node search(int key) {
		Node roots=searchRec(root,key);
		return roots;
	}

	private Node searchRec(Node root, int key) {
		if(root==null || root.key==key) {
			return root;
		}
		
		if(key<root.key) {
			return searchRec(root.left, key);
		}else if(key>root.key) {
			return searchRec(root.right, key);
		}
		return root;
	}

	public static void main(String[] args) {
	
		Bstprac tree= new Bstprac();
		
//		tree.insert(50); 
//        tree.insert(30); 
//        tree.insert(20); 
//        tree.insert(40); 
//        tree.insert(70); 
//        tree.insert(60); 
//        tree.insert(80); 
        
        
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        
    // tree.inorderPrint();
//		System.out.println(tree.search(20));
		
	//tree.preOrderPrint();
	//tree.postorderprint();
	
	  tree.traverselevelOrder();

	}

}
