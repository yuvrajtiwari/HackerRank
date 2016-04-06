import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine() ;
       
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>() ;
           
        int i = 0 ;
        
        while(sc.hasNextInt()){
            
            int input = sc.nextInt();
            
            if(countMap.containsKey(input)){
                
                countMap.put(input,countMap.get(input)+1);
                
                
            }
            else{
                
                countMap.put(input,1) ;
                
            }
            
            
            
        }
        
        for(i=0 ; i < 100 ; i++){
            
            int val ;
            
            if(countMap.get(i) == null){
                
                val = 0 ;
            }
            else{
                
                val = countMap.get(i) ;
            }
            
            System.out.print( val + " ") ;
            
        }
        
       /* for(i=0 ; i< inputArr.length ; i++){
            
            System.out.println(countMap.get(inputArr[i]));
            
            
            
        }
        */
        
    }
}