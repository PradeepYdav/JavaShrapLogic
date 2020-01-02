package com.pradeep.java_8_features;

interface A{
	void show();
}

class XYZ implements A{

	@Override
	public void show() {
		System.out.println("Hello world");
		
	}
	
}

public class lamdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// normal as 1.7 till 
		A obj= new XYZ();
		obj.show();
		
		//now see how inner class work
		
		A inobje=new A() {
			public void show() {
				System.out.println("hello in inner class");
			}
		};
		
		inobje.show();
		
		// uiing labda expression
		
		A ulamdaexpress= ()->System.out.println("hello in lamda express class");
			
		
		ulamdaexpress.show();

	}

}
