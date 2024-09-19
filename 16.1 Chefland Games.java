/*In Chefland, a tennis game involves 4 referees.
  Each referee has to point out whether he considers the ball to be inside limits or outside limits. 
  The ball is considered to be IN if and only if all the referees agree that it was inside limits.
  Given the decision of the 4 referees, help Chef determine whether the ball is considered inside limits or not.*/

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
		    System.out.println((a+b+c+d == 0)? "IN":"OUT");
		}

	}
}
