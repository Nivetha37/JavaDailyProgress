/*
You and your friend are playing a game with hoops. 
There are N hoops (where N is odd) in a row.
You jump into hoop 1, and your friend jumps into hoop N. 
Then you jump into hoop 2, and after that, your friend jumps into hoop N−1, and so on.
The process ends when someone cannot make the next jump because the hoop is occupied by the other person. 
Find the last hoop that will be jumped into.
  */

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
		    System.out.println(n/2+1);
		}

	}
}
