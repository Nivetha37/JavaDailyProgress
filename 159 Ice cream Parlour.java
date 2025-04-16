/*Two friends like to pool their money and go to the ice cream parlor. They always choose two distinct flavors and they spend all of their money.

Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.

Example.  

The two flavors that cost  and  meet the criteria. Using -based indexing, they are at indices  and .*/

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            boolean b[] = new boolean[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]>=m) b[i]=true;
            } 
            
            int f1 = 0,f2=0,cost=0;
            
            for(int i=0;i<n-1;i++){
                if(!b[i]){
                    for(int j=i+1;j<n;j++){
                        if(!b[j]){
                            int amt = arr[i]+arr[j];
                            if(amt<=m && cost<amt){
                                cost = amt;
                                f1 = i+1;
                                f2=j+1;
                            }
                        }
                    }
                }    
            }
            
            System.out.println(f1+" "+f2);
        }
    }
}
