package com.pradeep.stack;

public class StackusingArray {
	
	  int [] stack;
	  int top;
	  

	public StackusingArray(int capacity) {
	  stack = new int[capacity];
	}
	
	
	public void push(int num) {
		if(top==stack.length) {
			int [] newstack= new int[2*stack.length];
			System.arraycopy(stack, 0, newstack, 0, stack.length);
			stack=newstack;
		}
		
		stack[top++]=num;
	}
	
	
	public void pop() {
		if(isEmpty()) {
			 throw new StackOverflowError();
		}
		
		stack[--top]=0;
	}
	
	public boolean isEmpty() {
		return top==0;
	}

	
	public void printStack() {
		for(int i=top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	
	public int peek() {
		return stack[top-1];
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackusingArray staArray= new StackusingArray(5);
		
		for(int i=0;i<10;i++) {
			staArray.push(i);
		}
		
		staArray.printStack();
		
		System.out.println("----------------------");
		
		for(int i=0;i<5;i++) {
			staArray.pop();
		}
		
		staArray.printStack();
		
		System.out.println("peek"+staArray.peek());

	}

}
