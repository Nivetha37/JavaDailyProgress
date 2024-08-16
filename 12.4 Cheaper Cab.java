/*Chef has to travel to another place. For this, he can avail any one of two cab services.
The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?*/
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
		    if(x<y) System.out.println("FIRST");
		    else if(x==y) System.out.println("ANY");
		    else System.out.println("SECOND");
		}

	}
}
