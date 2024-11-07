/* Chef is a very big fan of Eren Yeager.

In the last season of Attack on Titan, there were N episodes numbered from 1 to N.
Each even indexed episode was A minutes long and each odd indexed episode was B minutes long.

Calculate the total duration (in minutes) of the last season.*/

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
		    int a = m.nextInt();
		    int b = m.nextInt();
		    System.out.println(n>1? n%2==0?n/2*(a+b):(n/2*a)+(n/2+1)*b:b);
		}

	}
}
