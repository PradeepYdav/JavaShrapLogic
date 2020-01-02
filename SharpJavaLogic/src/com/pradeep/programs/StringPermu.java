package com.pradeep.programs;

public class StringPermu {
	
	static void permu(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			String ros=str.substring(0,i) +str.substring(i+1);	
			
			permu(ros,c+ans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			permu("abc","");
	}

}
