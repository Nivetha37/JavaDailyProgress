/*
A blood drive aims to collect N number of blood donations.
The drive has collected X donations so far.
Find the remaining number of donations needed to reach the target.
  */
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
        while (t-- > 0) {
            int n = m.nextInt();
            int x = m.nextInt();
            System.out.println(n - x);
        }
    }
}
