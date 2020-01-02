package com.pradeep.programs;

public class removeGivenCharFromStr {
	
	static void remove(String words,char unwanted) {
		
		String str="";
		for(char c:words.toCharArray()) {
			if(c!=unwanted) {
				str=str+c;
			}
		}
		
		System.out.println(str);
	}

	public static void main(String[] args) {
		remove("aaaaa", 'a');
	}

}
