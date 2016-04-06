import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static BigInteger[] terms ;

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in) ;
        int A = sc.nextInt() ;
        int B = sc.nextInt() ;
        int N = sc.nextInt() ;
        
        terms = new BigInteger[N] ;
        terms[0] = BigInteger.valueOf(A) ;
        terms[1] = BigInteger.valueOf(B) ;
        for(int i = 2 ; i < N ; i++){
            
           terms[i] = square(terms[i-1]).add(terms[i-2]) ; 
            
        }
        
        
       
        System.out.println(terms[N-1]);
        
        
    }
     /*
    public static BigInteger find(int N,int A, int B){
        
        if(N<=0){
            
            return BigInteger.valueOf(0);
        }
        
        
        if(N == 1){
            
            return BigInteger.valueOf( A ) ;
            
        }
        else if(N == 2){
            
            return BigInteger.valueOf( B ) ;
        }
        
        if(terms[N-1] == null){       
        BigInteger Tn = square(find(N-1,A,B)).add(find(N-2,A,B)) ;
        terms[N-1] = Tn ;
        }
        return terms[N-1] ;
        
        
    } 
    */
    public static BigInteger square(BigInteger n){
        
        n = n.multiply(n) ;
        
        return n;
    }
    
}