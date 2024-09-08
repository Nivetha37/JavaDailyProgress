// task 1: to find largest and second largest

//task 2: to add two distinct numbers in array such that their sum is maximum

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            //find the largest and second largest and sum it up 
            int max = 0;
            int max2 = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max2 = max;
                    max = a[i];
                }
                else if (a[i] > max2 && a[i] != max) {
                    max2 = a[i];
                }

            }
            System.out.println(max + max2);
        }
    }
}





/*
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
            System.out.println(arr[0] + arr[1]);
        }
    }
}*/
