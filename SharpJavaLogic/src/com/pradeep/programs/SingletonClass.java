package com.pradeep.programs;

public class SingletonClass {
	
	static SingletonClass singletonClass=null;
	
	private SingletonClass () {
		System.out.println("hi");
	}
	
	static SingletonClass getInstnace() {
		if (singletonClass==null) {
			System.out.println("making new instance");
			 singletonClass= new SingletonClass();
		}else {
			System.out.println("same instance");
			//return singletonClass;
		}
		System.out.println(singletonClass.toString());
		return singletonClass;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getInstnace();
		getInstnace();
		getInstnace();
		SingletonClass sing= new SingletonClass();
		sing.getInstnace();

	}

}
