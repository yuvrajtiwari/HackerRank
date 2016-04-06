import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int queries =  sc.nextInt() ;
        Stack<Integer> stack = new Stack<Integer>() ;
        Stack<Integer> maxStack = new Stack<Integer>() ;
        int stackSize = 0;
        int maxStackSize = 0;
        for(int i = 0 ;  i < queries ; i++){
            int command =  sc.nextInt() ;
            if(command == 1){
               int num = sc.nextInt() ;
                if(stackSize==0){
                   stack.push(num);
                   stackSize++;
                   if(maxStackSize==0) {
                   maxStack.push(num);
                   maxStackSize++;     
                   }
                }
                else if(maxStackSize > 0){
                    
                     if( num >= maxStack.peek()){
                        maxStack.push(num);   
                         maxStackSize++;
                    }
                    stack.push(num);
                    stackSize++;  
                }
            }
            else if(command == 2){
                if(stackSize > 0){     
                    int delNum = stack.pop() ;
                    stackSize--;
                    if(maxStackSize > 0){ 
                         if(maxStack.peek() == delNum){        
                             maxStack.pop();
                             maxStackSize--;
                         } 
                   }
                }
                
            }
            else if(command==3){
              System.out.println(maxStack.peek());
                
            }
            
        }
    }
    
}