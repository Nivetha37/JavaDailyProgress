/*Given an integer N . Write a program to obtain the sum of the first and last digits of this number.*/

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
		    int first,last;
		    last = n%10;
		    while(n>9){
		        n=n/10;
		    }
		    first = n;
		    System.out.println(n+last);
		}

	}
}
