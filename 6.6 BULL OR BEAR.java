/*
Chef is on his way to become the new big bull of the stock market but is a bit weak at calculating whether he made a profit or a loss on his deal.
Given that Chef bought the stock at value X and sold it at value Y. Help him calculate whether he made a profit, loss, or was it a neutral deal.*/
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
		    if(x<y) System.out.println("PROFIT");
		    else if(x>y) System.out.println("LOSS");
		    else System.out.println("NEUTRAL");
		}

	}
}
