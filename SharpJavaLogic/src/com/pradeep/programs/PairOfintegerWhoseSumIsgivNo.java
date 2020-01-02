package com.pradeep.programs;

public class PairOfintegerWhoseSumIsgivNo {
	
	
	static void pairofWhosesumisno(int [] numbers,int sum) {
		
		for(int i=0;i<numbers.length;i++) {
			int first=numbers[i];
			
			for(int j=i+1;j<numbers.length;j++) {
				
				int second=numbers[j];
				if((first+second)==sum) {
					System.out.println("pair is {"+first+","+second+"}");
				}
			}
		}
		
//		
//		for(int i=0;i<numbers.length;i++) {
//			
//			if(i!=numbers.length) {
//			if(numbers[i]+numbers[i+1]==sum) {
//				System.out.println("pair is {"+numbers[i]+","+numbers[i+1]+"}");
//			}
//			}
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        pairofWhosesumisno(numbersWithDuplicates,7);

	}

}
