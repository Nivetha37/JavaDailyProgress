/*Chef wants to gift C chocolates to Botswal on his birthday.
  However, he has only X chocolates with him.
  The cost of 1 chocolate is Y rupees.
  Find the minimum money in rupees Chef needs to spend so that he can gift C chocolates to Botswal.*/
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
		    int c = m.nextInt();
		    int x = m.nextInt();
		    int y = m.nextInt();
		    System.out.println(y*(c-x));
		}

	}
}
