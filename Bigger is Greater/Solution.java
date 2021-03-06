import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try{
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
            int t = Integer.parseInt(br.readLine());
       
        
            for(int i = 0; i < t ; i++){
                     
                String input = br.readLine() ;
                                    
                printAnswer(input);
                        
            }
            
        }
        catch (Exception e){
         
            e.printStackTrace();
        
        }
        
    }
    
    
    
    public static void printAnswer(String input){
        
        char[] arr = input.toCharArray() ;
        int size = arr.length ;
        
        
        int i = size - 1 ;
        int j = size - 1 ;
        
       
        
        //1.Find largest index i such that array[i − 1] < array[i].
        
        while( i > 0 && arr[i-1] >= arr[i]){
            
            i--;
                           
        }
        
        if(i == 0){
            
            
                 // either bbbbb or highest permutation possible
               
                System.out.println("no answer");
                return ;
                
                
        }
       
        
        // 2.Find largest index j such that j ≥ i and array[j] > array[i − 1].
       
        
        while(j > i-1 && arr[j] <= arr[i-1] ){ // we will not reduce j and exit if we found a larger num
            
            j--;
            
        }
        
        //Swap array[j] and array[i − 1].
        
        char temp = arr[j] ;
        arr[j] = arr[i-1] ;
        arr[i-1] = temp ;

    
        j = size - 1 ;
        
        
        //Reverse the suffix starting at array[i].

        while( i < j ){
         //   System.out.println("reversing substring");
            temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j-- ;
            
        }
       
       System.out.println(new String(arr)); 
       //printArray(arr) ;
    }
    
    public static void printArray(char[] arr ){
        
        for(char  c : arr){
            
            System.out.print(c) ;
            
        }
        System.out.println(" ");
    }
}