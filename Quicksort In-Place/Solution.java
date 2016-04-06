import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        sc.nextLine() ;
        
        int[] arr = new int[size] ;
        
        for(int i = 0 ; i< size ; i++){
            
            arr[i] = sc.nextInt();
            
        }
        
        quicksort(arr,0,arr.length-1);
        
        
    }
    
    
    public static void quicksort(int[] arr, int start, int end){
        
        
        if(start >= end){
            
            return ;
            
        }
        else{
            
            int partition = partition(arr,start,end);
            printArray(arr);
            quicksort(arr,start,partition - 1) ;
            quicksort(arr,partition + 1, end) ;
            
            
            
        }
        
        
    }
    
    public static int partition(int arr[],int start,int end){
        
        int pivot = arr[end] , temp = 0  ;
         
        int partition = start ;
        
        for(int i = start ; i < end ; i++){
            
            if(arr[i] < pivot){
                
                temp = arr[partition] ;
                arr[partition] = arr[i] ;
                arr[i] = temp ;
                partition++ ;
                
            }
            
        }
        
        temp = arr[partition] ;
        arr[partition] = arr[end] ;
        arr[end] = temp ;
         
        return partition ;
        
    }
    
      public static void printArray(int[] arr){
          
          
          for(int i : arr){
              
              System.out.print(i+ " ") ;
              
          }
          
          System.out.println("");
          
      }
    
    
}