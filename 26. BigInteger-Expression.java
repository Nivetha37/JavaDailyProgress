import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* 
   1. testcase 20000000000000000 is of type BigInteger(bigger than long )

   2. get num as string convert it to BigInteger by importing java.math.BigInteger

   3. BigInteger doesnot support + * use .add(),.multiply()
*/


class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();

        for (int i = 0; i < t; i++) {
            String num1 = m.next();
            String num2 = m.next();

            BigInteger x = new BigInteger(num1);
            BigInteger y = new BigInteger(num2);
            BigInteger a = BigInteger.valueOf(4);

            BigInteger exp1 = x.pow(4).add(a.multiply(y.pow(2)));
            BigInteger exp2 = a.multiply(x.pow(2).multiply(y));

            if (exp1.equals(exp2)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}