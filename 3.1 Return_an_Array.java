import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=m.nextInt();
        }
        for(int i = n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
