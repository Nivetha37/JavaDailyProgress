/*Chef and some of his friends are planning to participate in a puzzle hunt event.
The rules of the puzzle hunt state:
"This hunt is intended for teams of 6 to 8 people."
Chef's team has N people in total. 
Are they eligible to participate?*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		if(n>=6 && n<=8) System.out.println("YES");
		else System.out.println("NO");
	}
}
