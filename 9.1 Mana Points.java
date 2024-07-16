/*Chef is playing a mobile game. 
  In the game, Chef's character Chefario can perform special attacks.
  However, one special attack costs X mana points to Chefario.
  If Chefario currently has Y mana points, determine the maximum number of special attacks he can perform.*/

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
		    int x = m.nextInt();
		    int y = m.nextInt();
		    System.out.println(y/x);
		}

	}
}
