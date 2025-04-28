/*You will be given a list of integers, , and a single integer . You must create an array of length  from elements of  such that its unfairness is minimized. Call that array . Unfairness of an array is calculated as

Where:
- max denotes the largest integer in 
- min denotes the smallest integer in 

Example Pick any two elements, say .

Testing for all pairs, the solution  provides the minimum unfairness.

Note: Integers in  may not be unique.

Function Description

Complete the maxMin function in the editor below.
maxMin has the following parameter(s):

int k: the number of elements to select
int arr[n]:: an array of integers
Returns

int: the minimum possible unfairness*/

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int k = m.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        
        Arrays.sort(arr);
        
        int ans = Integer.MAX_VALUE;
        
        for(int i=0;i<=n-k;i++){
            int res = arr[k+i-1] - arr[i];
           ans = Math.min(res,ans);
           
        }
        
        System.out.println(ans);
    }
}
