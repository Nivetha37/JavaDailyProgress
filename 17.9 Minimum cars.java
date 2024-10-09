/*A single car can accommodate at most 4 people.
N friends want to go to a restaurant for a party. 
Find the minimum number of cars required to accommodate all the friends.*/
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
		    System.out.println(n%4 == 0?n/4:n/4+1);
		}

	}
}
