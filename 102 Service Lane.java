/*A driver is driving on the freeway. 
The check engine light of his vehicle is on, and the driver wants to get service immediately. 
Luckily, a service lane runs parallel to the highway. It varies in width along its length.
Paradise Highway
You will be given an array of widths at points along the road (indices), then a list of the indices of entry and exit points. 
Considering each entry and exit point pair, calculate the maximum size vehicle that can travel that segment of the service lane safely.*/

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int t = m.nextInt();
        int arr[] = new int[n];
        for(int a=0;a<n;a++){
            arr[a] = m.nextInt();
        }
        while(t-->0){
            int i = m.nextInt();
            int j = m.nextInt();
            
           
            int min = Integer.MAX_VALUE;
            for(int a=i;a<=j;a++){
                min = Math.min(min,arr[a]);
                
            }
            
            System.out.println(min);
        }
        
        
        
    }
}
