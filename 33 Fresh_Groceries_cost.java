/* -There are n items in a grocery shop.
  -each item has a freshness value b[i] and cost a[i].
  -the minimum freshness value is x.
  -if freshness value is greatern than or equal to x then chef buys.
  -Find the total cost.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int cost=0;
            
            for (int i = 0; i < n; i++) {
                //freshness value of each item
                a[i] = scanner.nextInt();
            }
            
            for(int i=0;i<n;i++){
                //cost value of each item
                b[i] = scanner.nextInt();
            }
            
            for(int i=0;i <n;i++){
                if(a[i]>=x){
                    cost=cost+b[i];
                }
            }
           
            System.out.println(cost);
            
        }
    }
}
