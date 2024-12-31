/*Chef decided to go on a diet during the following N days (numbered 1 through N).
  Part of the diet plan is to eat K grams of protein during each day. 
  For each valid i, Chef wants to buy Ai grams of protein in the morning of the i-th day and then eat K grams of protein as part of his dinner. 
  If he has any protein remaining, he can store it and use it in later dinners. 
  Initially, Chef is storing 0 grams of protein.
  Determine whether Chef will have enough protein all the time during his diet.
  In case he will not have enough, find the first day on which Chef will be unable to eat K grams of protein.*/
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
            int k = m.nextInt();
            int rem = 0;
            int flag = 0;
            for (int i = 0; i < n; i++) {
                int a = m.nextInt();
                
                if (flag == 0) {
                    if (a + rem >= k) {
                        rem = a + rem - k;
                    }
                    else {
                        flag = i + 1;

                    }
                }
                
            }
            
            System.out.println(flag == 0 ? "YES" : "NO " + flag);
        }

    }
}
