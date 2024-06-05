/*
DAIICT college students want to attend an IPL match.

A total of N students from the college want to go while only M tickets are available for the match.
Determine how many students won't be able to book tickets.
  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if(n>m){
		        System.out.println(n-m);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
