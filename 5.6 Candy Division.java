/*There are three friends and a total of N candies.
There will be a fight amongst the friends if all of them do not get the same number of candies.
Chef wants to divide all the candies such that there is no fight.
Find whether such distribution is possible.*/
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
		    int n = m.nextInt();
		    if(n%3==0) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
