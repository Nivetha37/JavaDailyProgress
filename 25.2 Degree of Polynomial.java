/*In mathematics, the degree of polynomials in one variable is the highest power of the variable in the algebraic expression with non-zero coefficient.

Chef has a polynomial in one variable x with N terms.
The polynomial looks like  A0⋅x0+A1⋅x1+…+AN−2⋅xN−2+AN−1⋅xN−1A where Ai−1Ai−1 denotes the coefficient of the ith term xi−1 for all (1≤i≤N).

Find the degree of the polynomial.
Note: It is guaranteed that there exists at least one term with non-zero coefficient.*/
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
        while (t--> 0) {
            int n = m.nextInt();
            int arr[] = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = m.nextInt();
                if (arr[i] != 0) ans = i;
            }
            System.out.println(ans);
        }

    }
}
