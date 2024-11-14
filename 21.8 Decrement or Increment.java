/*Write a program to obtain a number N and increment its value by 1 if the number is divisible by 4 otherwise decrement its value by 1.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int n  = m.nextInt();
		System.out.println(n%4==0?n+1:n-1);

	}
}
