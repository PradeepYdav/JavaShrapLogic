package com.pradeep.recursion;

public class Fibonacci {
	
	static int fib(int num) {
		
		if(num==1 || num==2) {
			return num-1;
		}
		
		return fib(num-1) +fib(num-2);
	}
	
	public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		for(int i=1;i<=num;i++) {
			System.out.print(fib(i)+" ");
		}
		
//		int number=4;
//		for(int i=1; i<=number; i++){
//            System.out.print(fibonacci(i) +" ");
//        }
		

	}

}
