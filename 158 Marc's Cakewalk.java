/*Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to expend those calories. If Marc has eaten  cupcakes so far, after eating a cupcake with  calories he must walk at least  miles to maintain his weight.

Example

If he eats the cupcakes in the order shown, the miles he will need to walk are . This is not the minimum, though, so we need to test other orders of consumption. In this case, our minimum miles is calculated as .

Given the individual calorie counts for each of the cupcakes, determine the minimum number of miles Marc must walk to maintain his weight. Note that he can eat the cupcakes in any order.*/
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr[] = new int[n];
        long miles =0;
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=n-1;i>=0;i--){
            miles+=(Math.pow(2,j)*arr[i]);
            j++;
        }
        System.out.println(miles);
    }
}
