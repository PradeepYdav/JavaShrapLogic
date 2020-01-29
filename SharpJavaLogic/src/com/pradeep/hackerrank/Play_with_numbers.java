package com.pradeep.hackerrank;



import java.util.*;
import java.lang.Math; 

class Play_with_numbers {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        
        int inputcount=sc.nextInt();
        int inputcase=sc.nextInt();
        
        int [] numArray=new int[inputcount];
        
        for(int i=0;i<inputcount;i++){
            numArray[i]=sc.nextInt();
        }
        
        while(inputcase>0){
            int firstindex=sc.nextInt()-1;
            int secondIndex=sc.nextInt()-1;
            int diff=(secondIndex-firstindex)+1;
           int sum=0;
          
            for(int i=firstindex;i<secondIndex;i++){
            sum+=numArray[i];
         }
           
            //System.out.println(Math.floor(sum/diff));
            
            System.out.println(sum);
            inputcase--;
        }
        

    }
}
