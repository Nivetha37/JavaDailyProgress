/*There are 101 citizens in Chefland. 
It is election time in Chefland and 3 parties, A,B, and C are contesting the elections.
Party A receives XA votes, party B receives XB votes, and party C receives XC votes.
The constitution of Chefland requires a particular party to receive a clear majority to form the government.
A party is said to have a clear majority if it receives strictly greater than 50 votes.
If any party has a clear majority, print the winning party (A, B or C). 
Otherwise, print NOTA.*/
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
		    int a = m.nextInt();
		    int b = m.nextInt();
		    int c = m.nextInt();
		    System.out.println( a>50 ?"A":b>50?"B":c>50?"C":"NOTA");
		}

	}
}
