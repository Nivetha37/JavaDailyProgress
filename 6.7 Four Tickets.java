/*Four friends want to attend a concert.
  Each ticket costs X rupees.
  They have decided to go to the concert if and only if the total cost of the tickets does not exceed 1000 rupees.
  Determine whether they will be going to the concert or not.*/
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
		    if(4*x <=1000) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
