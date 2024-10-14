/*Chef is making a dish that consists of exactly two ingredients. 
  He has four ingredients A,B,C and D with tastiness a,b,c, and d respectively.
  He can use either A or B as the first ingredient and either C or D as the second ingredient.
  The tastiness of a dish is the sum of tastiness of its ingredients. 
  Find the maximum possible tastiness of the dish that the chef can prepare.*/

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
		    int d = m.nextInt();
		    
		    System.out.println(Math.max(a,b)+Math.max(c,d));
		}

	}
}
