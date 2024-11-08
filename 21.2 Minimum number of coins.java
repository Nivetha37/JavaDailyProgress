/*Chef has infinite coins in denominations of rupees 5 and rupees 10.

Find the minimum number of coins Chef needs, to pay exactly X rupees. 
If it is impossible to pay X rupees in denominations of rupees 5 and 10 only, print −1.*/
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
		    System.out.println(x%5!=0?-1:x%10==0?x/10:x/10+1);
		}
	}
}
