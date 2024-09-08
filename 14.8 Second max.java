/*Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.*/

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
        while (n-- > 0) {
            int a = m.nextInt();
            int b = m.nextInt();
            int c = m.nextInt();

            int[] arr = {a,b,c};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
