/*Chef has finally decided to complete all of his pending assignments.
There are X assignments where each assignment takes Y minutes to complete.
Find whether Chef would be able to complete all the assignments in Z days.*/

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
		    int z = m.nextInt();
		    if(x*y <= z*60*24 ) System.out.println("Yes");
		    else System.out.println("No");
		}

	}
}
