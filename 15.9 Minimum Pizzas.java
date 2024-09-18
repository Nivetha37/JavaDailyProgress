/*Each pizza consists of 4 slices. 
  There are N friends and each friend needs exactly X slices.
  Find the minimum number of pizzas they should order to satisfy their appetite.
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
		    int x = m.nextInt();
		    
		    System.out.println((n*x%4==0)? n*x/4 : n*x/4+1);
		}
	}
}
