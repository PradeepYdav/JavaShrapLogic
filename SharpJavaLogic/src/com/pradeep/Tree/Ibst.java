package com.pradeep.Tree;

public class Ibst {
	
	TreeNode root;
	
	public void insert(int value) {
		if(root==null) {
			root= new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	
	
	public void traverse() {
		if(root!=null) {
			root.traverse();
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
	
	class TreeNode{
		int data;
		TreeNode leftChild;
		TreeNode rightChild;
		
		
		public TreeNode(int value) {
			this.data=value;
		}

		public void insert(int value) {
			if(value==data) {
				return;
			}
			
			if(value<data) {
				if(leftChild==null) {
					leftChild= new TreeNode(value);
				}else {
					leftChild.insert(value);
				}
			}else {
				if(rightChild==null) {
					rightChild= new TreeNode(value);
				}else {
					rightChild.insert(value);
				}
			}
		}
		
		public void traverse() {
			if(leftChild!=null) {
				leftChild.traverse();
			}
			System.out.print(data + " ,");
			if(rightChild!=null) {
				rightChild.traverse();
			}
		}
		
		public TreeNode get(int value) {
			if (value == data) {
				return this;
			}

			if (value < data) {
				if (leftChild != null) {
					return leftChild.get(value);
				}
			} else {
				if (rightChild != null) {
					return rightChild.get(value);
				}
			}

			return null;
		}
		
		public int min() {
			if(leftChild==null) {
				return data;
			}
			else {
				return leftChild.min();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ibst tree= new Ibst();
		tree.insert(25);
		tree.insert(20);
		tree.insert(15);
		tree.insert(27);
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);
		
		tree.traverse();
		
		System.out.println("\n");
		
		System.out.println(tree.get(20));
		System.out.println(tree.get(15));
		System.out.println(tree.get(36));
		
		System.out.println(tree.min());
		System.out.println(tree.max());
		

	}

}
