/* Chef wants to conduct a lecture for which he needs to set up an online meeting of exactly X minutes.
The meeting platform supports a meeting of maximum 30 minutes without subscription and a meeting of unlimited duration with subscription.
Determine whether Chef needs to take a subscription or not for setting up the meet.*/

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
		    if(x>30) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
