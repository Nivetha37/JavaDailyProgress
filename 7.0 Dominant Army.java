/* 
In the medieval age, there were 3 kingdoms A,B, and C. 
The army of these kingdom had 𝑁𝐴, NB, and NC soldiers respectively.

You are given that an army with X soldiers can defeat an army with Y soldiers only if X>Y.
An army is said to be dominant if it can defeat both the other armies combined. 
For example, kingdom C's army will be dominant only if 𝑁𝐶>𝑁𝐴+𝑁𝐵 NC>NA+NB.

Determine whether any of the armies is dominant or not.*/

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
		    if(a>b+c || b>c+a || c>a+b) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
