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
            int A = m.nextInt();
            int B = m.nextInt();
            int C = m.nextInt();

            if ((A + B) % 2 != 0) {
                System.out.println("YES");
            }
            else if ((A + C) % 2 != 0) {
                System.out.println("YES");
            }
            else if ((B + C) % 2 != 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}