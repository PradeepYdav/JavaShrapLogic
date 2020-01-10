package com.pradeep.hackerrank;


import java.util.*;

class anaargm {
    public static void main(String args[] ) throws Exception {
       
       // Scanner s = new Scanner(System.in);
       // int tc = s.nextInt();                
            // Writing output to STDOUT
        
        int tc=1;
        
        for(int i=0;i<tc;i++){
            
//            String str1 = s.nextLine(); 
//        
//            String str2 = s.nextLine(); 
            
            String str1 ="cde"; 
            
            String str2 ="abc"; 
            
            char [] str1a=str1.toCharArray();
            char [] str2a=str2.toCharArray();
            
            
            int l1=str1a.length;
            int l2=str2a.length;
            int count=0;
            for(int j=0;j<l1;j++){
                for(int k=0;k<l2;k++){
                    if(str1a[j]==str2a[k]){
                        count++;
                        break;
                    }
                }
            }
        
            
            
            System.out.println(l1+l2-(2*count));
        }
            
       

    }
}

