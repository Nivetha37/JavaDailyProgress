/*Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money. Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.

Note Each toy can be purchased only once.

Example


The budget is  units of currency. He can buy items that cost  for , or  for  units. The maximum is  items.

Function Description

Complete the function maximumToys in the editor below.

maximumToys has the following parameter(s):

int prices[n]: the toy prices
int k: Mark's budget
Returns

int: the maximum number of toys*/

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        long k = m.nextInt();
        int arr[] = new int[n];
        long tot = 0;
        
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
            tot+=arr[i];
        }
        
        if(tot<=k) System.out.print(n);
        
        else{
            Arrays.sort(arr);
            int sum =0,res=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum>k){
                res =i;
                break;
                }
        }
        System.out.print(res);
        }       
    }
}
