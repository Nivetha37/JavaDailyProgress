/*A geyser has a capacity of X litres of water and a bucket has a capacity of Y litres of water.
One person requires exactly 2 buckets of water to take a bath.
Find the maximum number of people that can take bath using water from one completely filled geyser..*/
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
		    System.out.println(x/(2*y));
		}
	}
}
