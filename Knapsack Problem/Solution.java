import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t =  sc.nextInt();
        while(t-->0){
            
            int N = sc.nextInt();
            int wt = sc.nextInt();
            int[] arr = new int[N] ;
            for(int i = 0 ; i < N ; i++){
                
                arr[i] = sc.nextInt();
                
            }
            
            int sol =  findMax(arr,wt);
            
            System.out.println(sol);
            
        }
        
   }     
        public static int findMax(int[] arr,int wt){
            
            int max = 0 ;
            int rows = arr.length;
            int matrixEntry ;
            
            
            int[][] matrix = new int[rows][wt+1] ;
            
            for(int i = 0 ; i < rows ;  i++){
                int oldWt = 0;
                for(int j = 0 ; j <= wt ; j++){
                    
                        
                    if(j < arr[i] ){
                        
                        if(i>0){
                            matrix[i][j] = matrix[i-1][j];
                        }
                       
                        
                        
                    }
                    else{
                        if(i>0  ){
                            
                            if(j%arr[i]==0 ){
                            
                            matrix[i][j] = Math.max(j,matrix[i-1][j] );
                             oldWt = j;
                            }
                            else{
                                
                               int entry =  Math.max(matrix[i][j-1],oldWt+matrix[i-1][j-arr[i]] ) ;
                                if(entry>wt){
                                    matrix[i][j] = matrix[i-1][j] ;
                                }
                                else{
                                    
                                    matrix[i][j] = entry ;
                                }
                                
                            }
                        } 
                        
                        
                        if(i==0){
                            if(j%arr[i]==0){
                                matrix[i][j] = j;
                            }
                            else{
                                matrix[i][j] = matrix[i][j-1]  ;
                            }
                        }
                        
                    }
                    
                    // System.out.print( matrix[i][j]);
                    if( matrix[i][j]>max){
                        
                        max = matrix[i][j] ;
                    }
                    
                }
               // System.out.println();
            }
            
            //max = matrix[rows-1][wt];
            
            return max ;
        }
        
       
    
}