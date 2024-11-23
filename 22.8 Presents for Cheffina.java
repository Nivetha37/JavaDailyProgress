/*Chef has fallen in love with Cheffina, and wants to buy N gifts for her.
On reaching the gift shop, Chef got to know the following two things:
The cost of each gift is 1 coin.
On the purchase of every 4th gift, Chef gets the 5th gift free of cost.
What is the minimum number of coins that Chef will require in order to come out of the shop carrying N gifts?*/
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
		    System.out.println(n-n/5);
		}

	}
}
