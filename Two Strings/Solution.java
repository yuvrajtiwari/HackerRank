import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
        
       int t = Integer.parseInt(sc.nextLine());

       while(t-->0){
           
           String s1 = sc.nextLine();
           String s2 = sc.nextLine();
           
           LinkedHashSet<Character> set = new LinkedHashSet<Character>();
           
          for(Character c : s1.toCharArray()){
              
              set.add(c) ;
              
          }
           boolean contains = false ;
           
           for(Character c : s2.toCharArray()){
              
              if(set.contains(c)){
                  System.out.println("YES");
                  contains = true ;
                  break;
              }
               
             }
           
           if(!contains){
                  System.out.println("NO");
              }
              
        }
    
    }
    
}