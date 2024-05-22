/*
Chef aims to be the richest person in Chefland by his new restaurant franchise.
Currently, his assets are worth A billion dollars and have no liabilities. He aims to increase his assets by X billion dollars per year.
Also, all the richest people in Chefland are not planning to grow and maintain their current worth.
To be the richest person in Chefland, he needs to be worth at least B billion dollars. 
How many years will it take Chef to reach his goal if his value increases by X billion dollars each year?
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
		    int a = m.nextInt();
		    int b = m.nextInt();
		    int x = m.nextInt();
		    System.out.println((b-a)/x);
		}

	}
}
