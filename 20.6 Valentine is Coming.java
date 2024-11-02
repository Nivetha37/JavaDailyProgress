/*Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.

Chef has a total of X rupees and one chocolate costs Y rupees. 
What is the maximum number of chocolates Chef can buy?*/
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
		    System.out.println(x < y?0:x/y);
		}

	}
}
