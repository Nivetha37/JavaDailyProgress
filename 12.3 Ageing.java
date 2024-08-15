/*Chef's current age is 20 years, while Chefina's current age is 10 years.
Determine Chefina's age when Chef will be X years old.
Note: Assume that Chef and Chefina were born on same day and same month (just different year).*/
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
		    System.out.println(x-10);
		}

	}
}
