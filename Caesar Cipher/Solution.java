import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        
        char[] arr = s.toCharArray();
         int j = 0 ;
        for(int i=0; i < arr.length ; i++){
            if(Character.isAlphabetic(arr[i])){
                if(arr[i]>=65 && arr[i] <= 90 ){
                 j   = ((int)arr[i] - 65 + k) % 26 ;
                    j = j + 65;
                }
                else if(arr[i]>=97 && arr[i]<=122){
                    
                    j = ((int)arr[i] - 97 + k) % 26 ;
                    j = j + 97;
                    
                }
                
               
                arr[i] = (char)(j) ;
            }
        }
        printArray(arr);
        
    }
    
    public static void printArray(char[] arr){
        
        for(int i= 0 ; i < arr.length ; i++){
            
            System.out.print(arr[i]);
            
        }
        
        System.out.println();
    }
}
