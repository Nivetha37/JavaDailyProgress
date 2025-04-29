/*The distance between two array values is the number of indices between them. Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, return .

Example

There are two matching pairs of values:  and . The indices of the 's are  and , so their distance is . The indices of the 's are  and , so their distance is . The minimum distance is .

Function Description

Complete the minimumDistances function in the editor below.

minimumDistances has the following parameter(s):

int a[n]: an array of integers
Returns

int: the minimum distance found or  if there are no matching elements*/

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        
        int min =Integer.MAX_VALUE;
        int flag = 0;
        for(int i=0;i<n-1;i++){
            int res = min;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    res =j-i;
                    flag = 1;
                    break; 
                }
            }
            min = Math.min(min,res);
        }
        
        System.out.print(flag == 0?-1:min);
    }
}
