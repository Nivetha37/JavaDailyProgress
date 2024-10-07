/*In a coding contest, there are two types of problems:
Easy problems, which are worth 1 point each
Hard problems, which are worth 2 points each
To qualify for the next round, a contestant must score at least X points. 
Chef solved A Easy problems and B Hard problems.
Will Chef qualify or not?*/
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
		    int a = m.nextInt();
		    int b = m.nextInt();
		    System.out.println(b*2+a >=x?"Qualify":"NotQualify");
		}

	}
}
