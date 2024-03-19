import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        for (int i = 0; i < t; i++) {
            int n = m.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = m.nextInt();
            }
            int res = MakeEleEqual(arr, n);
            System.out.println(res);
        }

    }
    public static int MakeEleEqual(int arr[], int n) {
        int gcd = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            gcd = gcd(gcd, arr[i]);
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != gcd) {
                count++;
            }
        }
        return count;
    }
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}