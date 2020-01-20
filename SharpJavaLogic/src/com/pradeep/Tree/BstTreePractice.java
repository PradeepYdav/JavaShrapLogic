package com.pradeep.Tree;

public class BstTreePractice {
	Node root;
	
	class Node{
		int key;
		Node left,right;
		
		Node (int key ){
			this.key=key;
		}
		
		public String toString() {
			return Integer.toString(key);
		}
	}
	
	BstTreePractice(){
		root= null;
	}
	
	 void  insert(int key) {
		 root=insertRec(root,key);
	 }
	 
	 Node insertRec(Node root,int key ) {
		 if(root==null) {
			 root= new Node(key);
			 return root;
		 }
		 
		 if(key<root.key) {
			 root.left=insertRec(root.left, key);
		 }else if(key>root.key) {
			 root.right=insertRec(root.right, key);
		 }
		 
		 return root;
	 }
	 
	 public void inorder() {
		 inorderRec(root);
	 }
	 
	 public Node search(int key ) {
		 Node keys=searchRec(root,key);
		return keys;
	 }
	
	
	

	  Node searchRec(Node root, int key) {
		if(root==null || root.key==key) {
			return root;
		}
		
		if(key<root.key) {
			return searchRec(root.left, key);
		}else if(key>root.key) {
			return searchRec(root.right, key);
		}
	
		return null;
	}

	void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
		
	}
	
	public void delete(int key) {
		root=deleteRec(root,key);
	}
	
	 Node deleteRec(Node root, int key) {
		
		 if(root==null) {
			 return root;
		 }
		 
		 if(key<root.key) {
			 root.left=deleteRec(root.left, key);
		 }
		 else if(key<root.key) {
			 root.right=deleteRec(root.right, key);
		 }
		 else {
			 
			 if(root.left==null) {
				 return root.right;
			 }else if(root.right==null) {
				 return root.left;
			 }
			 
			 root.key=minvalue(root.right);
			 
			 root.right=deleteRec(root.right, root.key);
			 
		 }
		 
		return root;
	}


	private int minvalue(Node root) {
		int minvalue=root.key;
		// TODO Auto-generated method stub
		while(root.left!=null) {
			minvalue=root.left.key;
			root=root.left;
		}
		return minvalue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BstTreePractice tree= new BstTreePractice();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        tree.inorder();
        
       // System.out.println(tree.search(100));
//        tree.delete(20);
//        System.out.println("-------------------");
//        tree.inorder();
//        
//        tree.delete(30);
//        System.out.println("-------------------");
//        tree.inorder();
//        
        tree.delete(80);
        System.out.println("-------------------");
        tree.inorder();
        
       
	}

}
