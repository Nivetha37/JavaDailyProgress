/*Pooja would like to withdraw X $US from an ATM. 
  The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
  For each successful withdrawal the bank charges 0.50 $US.
  Calculate Pooja's account balance after an attempted transaction.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		double x = m.nextDouble();
		double y = m.nextDouble();
		if(x+0.50<=y)
		{
		if(x%5==0) System.out.println(y-(x+0.50));
		else System.out.println(y);   
		}
		else System.out.println(y);
	}
}
