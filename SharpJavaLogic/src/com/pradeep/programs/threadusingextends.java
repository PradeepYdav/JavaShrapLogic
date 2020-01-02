package com.pradeep.programs;

public class threadusingextends extends Thread {
	
	@Override
	public void run() {
		System.out.println("java is Calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadusingextends ob= new threadusingextends();
		ob.start();

	}

	

}
