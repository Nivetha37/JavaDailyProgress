/*An airline operates X aircraft every day.
  Each aircraft can carry up to 100 passengers.
One day, N passengers would like to travel to the same destination.
  What is the minimum number of new planes that the airline must buy to carry all N passengers?*/
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
		    int n = m.nextInt();
		    System.out.println(n/100<x?0:n%100==0?n/100-x:(n/100-x)+1);
		}

	}
}
