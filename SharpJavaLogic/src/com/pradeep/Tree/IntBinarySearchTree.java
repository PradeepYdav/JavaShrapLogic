package com.pradeep.Tree;

public class IntBinarySearchTree {
	
	TreeNode root;
	
	class TreeNode{
		public int data;
		public TreeNode leftchild;
		public TreeNode rightChild;
		
		TreeNode(int value){
			this.data=value;
		}
		
		public void insert(int value) {
			if(value==data) {
				return;
			}
			
			if(value<data) {
				if(leftchild==null) {
					leftchild= new TreeNode(value);
				}else {
					leftchild.insert(value);
				}
			}else {
				if(rightChild==null) {
					rightChild= new TreeNode(value);
				}else {
					rightChild.insert(value);
				}
			}
		}
		
		public void traverseInOrder() {
			if(leftchild!=null) {
				leftchild.traverseInOrder();
			}
			System.out.print(data+",");
			
			if(rightChild!=null) {
				rightChild.traverseInOrder();
			}
		}
		
		public TreeNode get(int value) {
			if (value == data) {
				return this;
			}

			if (value < data) {
				if (leftchild != null) {
					return leftchild.get(value);
				}
			} else {
				if (rightChild != null) {
					return rightChild.get(value);
				}
			}
			
			return null;
		}
		
		public int min() {
			if(leftchild==null) {
				return data;
			}else {
				return leftchild.min();
			}
		}
		
		public int max() {
			if(rightChild==null) {
				return data;
			}else {
				return rightChild.max();
			}
		}
		
		public String toString() {
			return Integer.toString(data);
		}
		
	}
	
	public void insert(int value) {
		if(root==null) {
			root=new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	
	public void traverse() {
		if(root!=null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if(root!=null) {
			return root.get(value);
		}
		
		return null;
	}
	
	public int min() {
		if(root==null) {
			return Integer.MIN_VALUE;
		}else {
			return root.min();
		}
	}
	
	public int max() {
		if(root==null) {
			return Integer.MAX_VALUE;
		}else {
			return root.max();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinarySearchTree intBinarySearchTree= new IntBinarySearchTree();
		
		intBinarySearchTree.insert(25);
		intBinarySearchTree.insert(20);
		intBinarySearchTree.insert(15);
		intBinarySearchTree.insert(27);
		intBinarySearchTree.insert(30);
		intBinarySearchTree.insert(29);
		intBinarySearchTree.insert(26);
		intBinarySearchTree.insert(22);
		intBinarySearchTree.insert(32);
		
		intBinarySearchTree.traverse();
		
		System.out.println("\n");
		
		System.out.println(intBinarySearchTree.get(20));
		System.out.println(intBinarySearchTree.get(32));
		System.out.println(intBinarySearchTree.get(55));
		
		System.out.println("\n");
		System.out.println(intBinarySearchTree.min());
		System.out.println(intBinarySearchTree.max());
	}

}
