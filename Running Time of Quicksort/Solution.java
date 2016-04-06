import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
    
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar1 = new int[s];
       int[] ar2 = new int[s]; 
       for(int i=0;i<s;i++){
            ar1[i]=in.nextInt();
            ar2[i] = ar1[i] ;           
       }
       int swapsInsertSort = insertionSort(ar1);    
       int swapQuickSort = quickSort(ar2,0,ar2.length-1);             
           
       System.out.println(swapsInsertSort-swapQuickSort);
      
        
   }    
        
        
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
   
        
  /************************InserstionSort Code*************************************/     
    public static int insertionSort(int[] ar)
    {       
        int count = 0 ;
        for(int i = 1; i < ar.length ; i++ ){
            
            int element = ar[i];
            int j = i ;
                while(j > 0 && ar[j-1] > element ){
                    
                    ar[j] = ar[j-1] ;
                    count++ ;
                    j--;
                }
            ar[j] = element ;
             
        }
        return count ;
    }  
   /************************InserstionSort Code Ends*************************************/ 
        
   /*******************************QuickSort Code***************************************/      
        
        public static int quickSort(int[] arr, int start, int end){
        
        
        if(start >= end){
            
            return 0 ;
            
        }
        else{
           
            int[] partitionParams =  partition(arr,start,end);
                                  
            int swapCount = partitionParams[1] ;
            swapCount= swapCount+quickSort(arr,start,partitionParams[0] - 1) ;
            swapCount= swapCount+quickSort(arr,partitionParams[0] + 1, end) ;
            
            return swapCount;
            
        }
        
        
    }
    
    public static int[] partition(int arr[],int start,int end){
        
        int pivot = arr[end] , temp = 0  ;
         
        int partition = start ;
        int swapCount = 0 ;
        for(int i = start ; i < end ; i++){
            
            if(arr[i] < pivot){
                
                temp = arr[partition] ;
                arr[partition] = arr[i] ;
                arr[i] = temp ;
                partition++ ;
                swapCount++ ;
            }
            
        }
        
        temp = arr[partition] ;
        arr[partition] = arr[end] ;
        arr[end] = temp ;
        swapCount++ ; 
        int[] partitionParams = new int[2];
        partitionParams[0] = partition ;
        partitionParams[1] = swapCount;
        return partitionParams ;
        
    } 
        
        
        
  /*****************************QuickSort Code Ends*************************************/      
        
        
   }       
  
