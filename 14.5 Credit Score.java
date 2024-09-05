/*To access CRED programs, one needs to have a credit score of 750 or more.
Given that the present credit score is X, determine if one can access CRED programs or not.
If it is possible to access CRED programs, output YES, otherwise output NO.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		
		int x = m.nextInt();
		if(x>=750) System.out.println("YES");
		else System.out.println("NO");

	}
}
