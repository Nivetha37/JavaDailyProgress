/*There are two -element arrays of integers,  and . Permute them into some  and  such that the relation  holds for all  where .

There will be  queries consisting of , , and . For each query, return YES if some permutation ,  satisfying the relation exists. Otherwise, return NO.*/
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int q = m.nextInt();
        while(q-->0){
            int  n = m.nextInt();
            int k = m.nextInt();
            int arr[] = new int[n];
            Integer arr2[] = new Integer[n];
            
            
            for(int i=0;i<n;i++){
                arr[i] = m.nextInt();
            }
            
            for(int i=0;i<n;i++){
                arr2[i] = m.nextInt();
            }
            
            Arrays.sort(arr);
            
            Arrays.sort(arr2,Collections.reverseOrder());
            
            int flag =0;
            
            
            for(int i=0;i<n;i++){
                if(arr[i]+arr2[i]<k) flag=1;
            }
            
            System.out.println(flag==1?"NO":"YES");
            
        }
    }
}
