/*Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .

Example



Three pairs meet the criteria:  and .

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array 
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs*/

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int k = m.nextInt();
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        
        int count=0;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%k==0) count++;
            }
        }
        
        System.out.println(count);
        
    }
}
