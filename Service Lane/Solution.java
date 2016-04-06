import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
        
    
       
            
            int passableVehicle = findPassableVehicle(width,i,j);
            System.out.println(passableVehicle);
            
            
        }
    
 
    }
    
    public static int findPassableVehicle(int[] width, int i , int j ){
        
        int minVehicle = 3 ;
        
        for(int x = i; x <= j ; x++){
            
            if(width[x]<minVehicle){
                
                minVehicle = width[x];
                if(minVehicle==1){
                    break;
                }
            }
            
            
            
        }
        
        return minVehicle ;
        
        
    }
}
