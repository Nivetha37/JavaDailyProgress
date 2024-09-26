/*Chef is watching a football match.
  The current score is A:B, that is, team 1 has scored A goals and team 2 has scored B goals. 
  Chef wonders if it is possible for the score to become C:D at a later point in the game (i.e. team 1 has scored C goals and team 2 has scored D goals).
  Can you help Chef by answering his question?*/

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
		    
		    System.out.println(a>c || b>d?"IMPOSSIBLE":"POSSIBLE");
		}

	}
}
