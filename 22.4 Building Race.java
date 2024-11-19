/*Two friends Chef and Chefina are currently on floors A and B respectively.
They hear an announcement that prizes are being distributed on the ground floor and so decide to reach the ground floor as soon as possible.
Chef can climb down X floors per minute while Chefina can climb down Y floors per minute. 
Determine who will reach the ground floor first (ie. floor number 0). 
In case both reach the ground floor together, print Both.*/
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
		    float a = m.nextFloat();
		    float b = m.nextFloat();
		    float x = m.nextFloat();
		    float y = m.nextFloat();
		    System.out.println(a/x>b/y?"Chefina":a/x==b/y?"Both":"Chef");
		}

	}
}
