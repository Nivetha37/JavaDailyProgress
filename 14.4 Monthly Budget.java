/*Akshat has X rupees to spend in the current month. His daily expenditure is Y rupees, i.e., he spends Y rupees each day.
Given that the current month has 
30 days, find out if Akshat has enough money to meet his daily expenditures for this month.*/
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
		    if(y*30 <= x) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
