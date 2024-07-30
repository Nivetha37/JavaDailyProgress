/*Chef has his lunch only between 1 pm and 4 pm (both inclusive).
Given that the current time is X pm, find out whether it is lunchtime for Chef.*/

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
		    if(x>=1 && x<=4) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
