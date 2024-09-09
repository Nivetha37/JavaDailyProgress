/*You are given 3 numbers A,B, and C.
Determine whether the average of A and B is strictly greater than C or not?

NOTE: Average of A and B is defined as (A+B)/2. 
      For example, average of 5 and 9 is 7, average of 5 and 8 is 6.5.*/

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
		    float a = m.nextInt();
		    float b = m.nextInt();
		    float c = m.nextInt();
		    if((a+b)/2 > c) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
