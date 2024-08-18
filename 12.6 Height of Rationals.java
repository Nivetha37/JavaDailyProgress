/*In a recent breakthrough in mathematics, the proof utilized a concept called Height.

Consider a fraction a/b. Its Height is defined as the maximum of its numerator and denominator. 
So, for example, the Height of 3/19 would be 19, and the Height of 27/4 would be 27.
Given a and b, find the Height of a/b.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int a = m.nextInt();
		int b = m.nextInt();
		System.out.println(Math.max(a,b));

	}
}
