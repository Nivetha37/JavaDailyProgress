/*You are given two integers N and K.
You may perform the following operation any number of times (including zero): 
change N to N−K, i.e. subtract K from N.
Find the smallest non-negative integer value of N you can obtain this way.*/
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
		    int n = m.nextInt();
		    int k = m.nextInt();
		    System.out.println(k==0?n:n%k);
		}

	}
}
