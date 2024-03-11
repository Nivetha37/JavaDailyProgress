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
        int z = 0;

        for (int i = 0; i < t; i++) {
            int x = m.nextInt();
            int y = x % 10;

            //x is greater than 10 rupees

            if (x > 9) {
                if (y < 5) {
                    z = x - y;
                }
                else {
                    z = x + (10 - y);
                }
            }

            //x is less than 10 rupees

            else {
                if (x >= 5) {
                    z = 10;
                }
                else {
                    z = 0;
                }

            }
            System.out.println(100 - z);

        }

    }
}ss