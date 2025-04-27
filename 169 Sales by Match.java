/*There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example
There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
Function Description
Complete the sockMerchant function in the editor below.
sockMerchant has the following parameter(s):
int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns int: the number of pairs*/

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        
        boolean b [] = new boolean[n];
        int count = 0;
        
        for(int i=0;i<n-1;i++){
            if(!b[i]){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        b[j] = true;
                        count+=1;
                        break;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
