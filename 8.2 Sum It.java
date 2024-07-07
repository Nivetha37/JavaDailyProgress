/*Bob received an assignment from his school: he has two numbers A and B, and he has to find the sum of these two numbers.
Alice, being a good friend of Bob, told him that the answer to this question is C.
Bob doesn't completely trust Alice and asked you to tell him if the answer given by Alice is correct or not.
If the answer is correct print "YES", otherwise print "NO" (without quotes).*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t = m.nextInt();
		while(t-->0){
		    int a = m.nextInt();
		    int b = m.nextInt();
		    int c = m.nextInt();
		    if(a+b == c) System.out.println("Yes");
		    else System.out.println("No");
		}

	}
}
