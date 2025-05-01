/*The median of a list of numbers is essentially its middle element after sorting. The same number of elements occur after it as before. Given a list of numbers with an odd number of elements, find the median?

Example

The sorted array . The middle element and the median is .

Function Description

Complete the findMedian function in the editor below.

findMedian has the following parameter(s):

int arr[n]: an unsorted array of integers
Returns

int: the median of the array*/

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        
        Arrays.sort(arr);
         System.out.println(arr[n/2]);
    }
}
