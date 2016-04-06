import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int chocs = n/c ;
            int wrappers = chocs ;
            
            
           // System.out.print(chocs+ "+ wrappers ");
            while(wrappers> 0 && wrappers/m > 0 ){
                
                int newChocks = wrappers/m ;
                wrappers = wrappers%m + newChocks ;
                chocs = chocs + newChocks ;
                
            }
            System.out.println(chocs);
        }
    }
}
