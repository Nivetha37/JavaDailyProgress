/*Chef is playing a videogame, and is getting close to the end. 
  He decides to finish the rest of the game in a single session.
  There are X levels remaining in the game, and each level takes Chef Y minutes to complete.
  To protect against eye strain, Chef also decides that every time he completes 3 levels, he will take a Z minute break from playing. 
  Note that there is no need to take this break if the game has been completed.
  How much time (in minutes) will it take Chef to complete the game?*/
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
		    int z = m.nextInt();
		    
		    System.out.println(x<=3?x*y:x%3!=0?(x/3)*z+(x*y):((x-3)/3)*z+(x*y));
		    
		}

	}
}
