/*
The working hours of Chef’s kitchen are from X pm to Y pm (1≤X<Y≤12).
Find the number of hours Chef works.
*/
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
		    int x = m.nextInt();
		    int y = m.nextInt();
		    System.out.println(y-x);
		}

	}
}
