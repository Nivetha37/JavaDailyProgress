/* -There are N items in a shop.Chef wants to buy all the N items.
-  There is also a discount coupon that costs X rupees and reduces the cost of every item by Y rupees.
-  If the price of an item was initially ≤Y, it becomes free, i.e, costs 0.
-  Determine whether Chef should buy the discount coupon or not.
-  Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon is strictly less than the price he pays without buying the discount coupon.
  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];
            int sum = 0;
            int bfr_discpn = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                bfr_discpn += a[i];
                if (a[i] > y) {
                    a[i] = a[i] - y;
                    sum = sum + a[i];
                }

            }
            
            int atr_disCpn = x + sum;
            
            if (bfr_discpn > atr_disCpn) {
                System.out.println("COUPON");
            }
            else {
                System.out.println("NO COUPON");
            }
        }
    }
}
