/*Chef wants to host a party with a total of N people.
However, the party hall has a capacity of X people. 
Find whether Chef can host the party.*/
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
		    if(n<=x) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
