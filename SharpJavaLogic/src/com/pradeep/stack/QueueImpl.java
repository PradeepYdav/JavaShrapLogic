package com.pradeep.stack;

import java.util.NoSuchElementException;

public class QueueImpl {
	
	int [] queue;
	int front;
	int back;
	
	public QueueImpl(int capacity) {
		queue= new int[capacity];
	}
	
	
	public void add(int num) {
		if(back==queue.length) {
			int [] newq= new int[2 *queue.length];
			System.arraycopy(queue, 0, newq, 0, queue.length);
			queue=newq;
		}
		queue[back]=num;
		back++;
	}
	
	public void remove() {
		if(getSize()==0) {
			throw new NoSuchElementException();
		}
		
		queue[front]=0;
		front++;
		
	}
	
	public int getSize() {
		return back-front;
	}
	
	public void printQueue() {
		for(int i=front;i<back;i++) {
			System.out.println(queue[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImpl queueImpl= new QueueImpl(5);
		
		for(int i=0;i<5;i++) {
			queueImpl.add(i);
		}
		
		queueImpl.printQueue();
		
		queueImpl.remove();
		
		System.out.println("-------------------");
		queueImpl.printQueue();
		
		

	}

}
