/*A problem setter is called an expert if at least 50% of their problems are approved by Chef.
 Munchy submitted X problems for approval.
  If Y problems out of those were approved, find whether Munchy is an expert or not.*/

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
		    float x = m.nextInt();
		    float y = m.nextInt();
		    
		    System.out.println(x/2 <=y ? "YES":"NO");
		}

	}
}
