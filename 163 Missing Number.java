/*Given two arrays of integers, find which elements in the second array are missing from the first array.
Example
The  array is the orginal list. The numbers missing are .
Notes
If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
Return the missing numbers sorted ascending.
Only include a missing number once, even if it is missing multiple times.
The difference between the maximum and minimum numbers in the original list is less than or equal to .*/

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[]= new int[n];
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc .nextInt();
        
        int arr2[]= new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
         boolean b[]= new boolean[m];
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(arr[i]==arr2[j] && !b[j]){
                     b[j]=true;
                     break;
                 }
             }
         }
         List<Integer> ls = new ArrayList<>();
         for(int i=0;i<m;i++){
             if(i==0 && !b[i]) ls.add(arr2[i]);
             
             if(i>0){
                 if(!(ls.contains(arr2[i])) && !b[i]) ls.add(arr2[i]);
             }
         }
         
         for(int i:ls){
             System.out.print(i+" ");
         }
    }
}
