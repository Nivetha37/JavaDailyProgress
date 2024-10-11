/*In a test, there are N problems, each carrying X marks.
In each problem, Chef either received X marks or 0 marks.
Determine whether is it possible for Chef to achieve exactly Y marks.*/

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
            int y = m.nextInt();

            System.out.println((y%x==0 && y%x<=n)? "YES" : "NO");

        }
    }
}
