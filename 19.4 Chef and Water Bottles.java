/*Chef has N empty bottles where each bottle has a capacity of X litres.
There is a water tank in Chefland having K litres of water.
Chef wants to fill the empty bottles using the water in the tank.
Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.*/
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
		    int x = m.nextInt();
		    int k = m.nextInt();
		    System.out.println(n*x<k?n:k/x);
		}

	}
}
