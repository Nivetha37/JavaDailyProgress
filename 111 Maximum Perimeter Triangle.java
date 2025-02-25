/*Given an array of stick lengths, use  of them to construct a non-degenerate triangle with the maximum possible perimeter. Return an array of the lengths of its sides as  integers in non-decreasing order.

If there are several valid triangles having the maximum perimeter:

Choose the one with the longest maximum side.
If more than one has that maximum, choose from them the one with the longest minimum side.
If more than one has that maximum as well, print any one them.
If no non-degenerate triangle exists, return .*/
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        
       Arrays.sort(arr);
        long max =0;
        int flag =0;
        
        long a=0,b=0,c=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    
                    if(arr[i]+arr[j]>arr[k]){
                        long peri = arr[i]+arr[j]+arr[k];
                        max = Math.max(peri,max);
                        
                        if(max==peri){
                            a=arr[i];
                            b=arr[j];
                            c=arr[k];
                        }
                        flag =1;
                    }
                }
            }
        }
        
        System.out.println(flag==0?-1:a+" "+b+" "+c);
    }
}
