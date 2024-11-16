/*Chef is struggling to pass a certain college course.
The test has a total of N questions, each question carries 3 marks for a correct answer and −1 for an incorrect answer. 
Chef is a risk-averse person so he decided to attempt all the questions. 
It is known that Chef got X questions correct and the rest of them incorrect.
For Chef to pass the course he must score at least P marks.
Will Chef be able to pass the exam or not?*/
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
            int x = m.nextInt();
            int p = m.nextInt();
            System.out.println(p <= (4 *x - n) ? "PASS" : "FAIL");
        }

    }
}
