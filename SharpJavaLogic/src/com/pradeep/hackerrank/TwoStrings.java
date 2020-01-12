package com.pradeep.hackerrank;
import java.util.*;

public class TwoStrings {

	public static void main(String[] args) {
		 Scanner sc= new Scanner (System.in);
         int tc= sc.nextInt();
         
         for(int k=0;k<tc;k++){
             String s1=sc.next();
             String s2=sc.next();
             
            char [] sa1=s1.toCharArray();
            char [] sa2=s2.toCharArray();
            
            Arrays.sort(sa1); 
            Arrays.sort(sa2); 
            
            String res1=new String(sa1);
            String res2=new String(sa2);
           
            if(res1.equals(res2)){
                System.out.println("YES"); 
            }else{
                 System.out.println("NO");
            }
                 
         }
      
	}

}
