/*In a certain month, Chef earned X rupees while Chefina earned Y rupees such that Y>X.
Since they want to end up with exactly the same amount, they decide to donate the difference between their income to a charity.
Find the amount they donate in the month.*/
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
		    System.out.println(y-x);
		}

	}
}
