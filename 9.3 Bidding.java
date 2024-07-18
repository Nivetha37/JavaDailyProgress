/*Alice, Bob and Charlie are bidding for an artifact at an auction.
Alice bids A rupees, Bob bids B rupees, and Charlie bids C rupees (where A, B, and C are distinct).
According to the rules of the auction, the person who bids the highest amount will win the auction.
Determine who will win the auction.*/
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
		    int A = m.nextInt();
		    int B = m.nextInt();
		    int C = m.nextInt();
		    if(A>B && A>C)System.out.println("Alice");
		    else if(A<B && B>C)System.out.println("Bob");
		    else System.out.println("Charlie");
		 }

	}
}
