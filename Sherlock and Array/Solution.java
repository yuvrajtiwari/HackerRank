import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while(T-->0){
            
           
            
            int N = sc.nextInt();
           
            if(N==1){
                System.out.println("YES");
                sc.nextInt();
                
                continue;
            }
            
            int[] arr = new int[N];
            
            for(int i = 0 ; i < N ; i++){
                
                arr[i] = sc.nextInt();
                
            
            }
            
            boolean ans = checkArray(arr,N);
                
            if(ans){
                    System.out.println("YES");
                }
            else{
                    System.out.println("NO");
                }
                
        }
    }
    
    
    static boolean checkArray(int[] arr, int N){
        boolean ans = false ;
        
        long sum = 0;
        long leftSum = 0 ;
        long rightSum = 0;
        
        for(int i = 0 ; i < N ; i++){
            
            
            sum = sum + arr[i] ;
            
        }
        
        
        
        rightSum = sum ;
        
        for(int i = 0 ; i < N ; i++){ //  check first and last elemensts in this loop
                
                rightSum = rightSum - arr[i] ;
            
                if(leftSum == rightSum){
                    
                    return true ;
                    
                }
                leftSum = leftSum + arr[i] ;
                        
            }
        
        
        
        
        return ans ;
    } 
    
    
}