/*Om has X rupees. He wants to gift a laptop worth N rupees to his girlfriend.
We know that Om is the technical secretary of IIIT-A and has access to the Gymkhana funds of IIIT-A. 
Currently there are M rupees in the fund and Om can use the fund as much as he wants.
Find whether Om can gift his girlfriend a new laptop.*/
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
		int n = m.nextInt();
		int M = m.nextInt();
		
		if(x+M >= n) System.out.println("YES");
		else System.out.println("NO");

	}
}
