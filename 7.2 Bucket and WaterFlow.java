/*Alice has a bucket of water initially having W litres of water in it. 
  The maximum capacity of the bucket is X liters.
  Alice turned on the tap and the water starts flowing into the bucket at a rate of Y litres/hour. 
  She left the tap running for exactly Z hours. 
  Determine whether the bucket has been overflown, filled exactly, or is still left unfilled.*/
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
		    int w = m.nextInt();
		    int x = m.nextInt();
		    int y = m.nextInt();
		    int z = m.nextInt();
		    if(x < w+z*y) System.out.println("overFlow");
		    else if(x == w+z*y) System.out.println("filled");
		    else System.out.println("Unfilled");
		    
		}

	}
}
