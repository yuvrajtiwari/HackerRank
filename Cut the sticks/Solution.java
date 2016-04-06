import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
       int min = findMin(arr);
       printAndPerformCuts(arr, min);
        
    }
    
    public static void printAndPerformCuts(int[] arr,int min){
        
        
       
        int count = 0 ;
        
        int i = 0 ;
      // System.out.println("Min--- "+min);
        for(int j = 0 ; j < arr.length ; j++){
            
            if(arr[j]>0){
                count++;
            }
        }
        
        while(i < arr.length){
            
            arr[i] = arr[i] - min ;
            i++;
        }
        
        
            System.out.println(count);
            int newMin = findMin(arr);
       // System.out.println("newMin--- "+newMin);
            if(newMin > 0){
                printAndPerformCuts(arr,newMin);
            }
        
        
        
        
        
    }
    
    public static int findMin(int[] arr){
        
        int min =  Integer.MAX_VALUE ;
        int zeroCount = 0 ;
        
        int i = 0 ;
        while(i < arr.length){
        //    System.out.print(" "+arr[i]);
            if(arr[i] < min && arr[i]>0){
                min = arr[i];
                
            }
            else if(arr[i] <= 0){
                
                zeroCount ++ ;
                
             }
            i++;
        }
      //  System.out.println();
        if(zeroCount == arr.length){
            return 0 ;
        }
        
        return min ;
    }
}