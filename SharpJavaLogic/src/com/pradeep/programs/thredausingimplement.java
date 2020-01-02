package com.pradeep.programs;

public class thredausingimplement implements Runnable {

	@Override
	public void run() {
		System.out.println("java ois xkan");
		
	}
	
	public static void main(String[] args) {

		thredausingimplement ob= new thredausingimplement();
		Thread data= new Thread(ob);
		data.start();
	}
	
	

}
