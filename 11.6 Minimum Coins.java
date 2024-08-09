/*There are only 2 type of denominations in Chefland:
Coins worth 1 rupee each Notes worth 10 rupees eachChef wants to pay his friend exactly X rupees. 
What is the minimum number of coins Chef needs to pay exactly X rupees?*/
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
		    System.out.println(x%10);
		}

	}
}
