/*You're given an integer N. Write a program to calculate the sum of all the digits of N.*/

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
		    int sum = 0;
		    int r;
		    int n = m.nextInt();
		    while(n>0){
		        r=n%10;
		        sum+=r;
		        n=n/10;   
		    }
		    System.out.println(sum);
		}
	}
}
