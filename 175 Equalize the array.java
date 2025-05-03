/*Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.

Example


Delete the  elements  and  leaving . If both twos plus either the  or the  are deleted, it takes  deletions to leave either  or . The minimum number of deletions is .

Function Description

Complete the equalizeArray function in the editor below.

equalizeArray has the following parameter(s):

int arr[n]: an array of integers
Returns

int: the minimum number of deletions required*/

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr[] = new int[n];
        boolean b[] = new boolean[n];
        
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        
        int max_occur = 0,key = 0;
        
        for(int i=0;i<n-1;i++){
            if(!b[i]){
                int count =1;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        b[j]=true;
                    }
                }
                
                if(count > max_occur){
                    max_occur = count;
                    key = arr[i];
                }
                
            }
        }
        int remove =0;
        for(int i:arr){
            if(i!=key) remove++;
        }
        
        System.out.print(remove);
        
        
        
        
    }
}
