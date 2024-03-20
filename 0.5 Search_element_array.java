import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int x = m.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = m.nextInt();
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] == x) {
                System.out.println("YES");
                count++;
                break;
            }

        }
        if (count == 0) {
            System.out.println("NO");
        }


    }
}