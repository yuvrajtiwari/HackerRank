import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        int num=0;
        int[] arr;
        while(testCase>0)
            {
            num=sc.nextInt();
            if(num>1){
            arr=new int[num];
            for(int i=0;i<num;i++)
                {
                arr[i]=sc.nextInt();
            } 
            System.out.println(contigousSum(arr,num)+" "+nonContigousSum(arr,num));
            }
            else
                {
                int x=sc.nextInt();
                System.out.println(x+" "+x);
            } 
            testCase--; 
        }     
    }
    public static int contigousSum(int[] a,int size)
        {
        int max_so_far = a[0];
        int curr_max = a[0];
        
        for (int i = 1; i < size; i++)
        {
        curr_max = Math.max(a[i], curr_max+a[i]);
        max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
    public static int nonContigousSum(int[] a,int size)
        {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]>=0)
                sum+=a[i];
        }
        if(sum!=0)
            return sum;
        else{
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                if(a[i]>=max)
                    max=a[i];
             }
            return max;
        }
     }
    
}