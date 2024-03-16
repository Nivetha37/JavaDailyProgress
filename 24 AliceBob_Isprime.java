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
            int a = m.nextInt();
            int b = m.nextInt();

            int sum = a + b;
            if (IsPrime(sum) == true) {
                System.out.println("Alice");
            }
            else {
                System.out.println("BOB");
            }

        }

    }
    public static boolean IsPrime(int sum) {
        if (sum <= 1) {
            return false;
        }
        for (int i = 2; i <= sum / 2; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
}