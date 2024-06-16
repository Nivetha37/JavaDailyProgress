/*Apple considers any iPhone with a battery health of 80% or above, to be in optimal condition.
Given that your iPhone has X% battery health, find whether it is in optimal condition.*/
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
		    float x = m.nextInt();
		    if(x>=80.00) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
