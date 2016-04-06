import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int size = sc.nextInt() ;
       sc.nextLine();
       
       int[] arr = new int[size] ;
        
       for(int i = 0 ; i < size ; i++){
           
           arr[i] = sc.nextInt();
           
           
       } 
       /******Code for sorting and printing steps begins*,,...***********/
       int swap_count = 0 ; 
       for(int i = 1 ; i < size ; i++){
           
           int element = arr[i] ;
           int j = i ;
           
           while( j>0 && arr[j-1] > element){
               
               arr[j] = arr[j-1];
               j--;
               swap_count++;
           }
           arr[j] = element ;
          
       } 
        System.out.println(swap_count);
        
    }
}