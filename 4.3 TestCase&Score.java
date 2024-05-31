/*
Determine the Score, Chef appeared for a placement test.
There is a problem worth X points.
Chef finds out that the problem has exactly 10 test cases.
It is known that each test case is worth the same number of points.
Chef passes N test cases among them. Determine the score Chef will get.
  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner m = new Scanner(System.in);
		int t = m.nextInt();
		while(t-->0){
		    int x = m.nextInt();
		    int n = m.nextInt();
		    System.out.println(n*x/10);
		}
	}
}
