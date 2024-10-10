/*Chef hosts a party for his birthday. 
There are N people at the party. 
All these N people decide to play Jenga.
There are X Jenga tiles available.
In one round, all the players pick 1 tile each and place it in the tower.
The game is valid if:
- All the players have a tile in each round;
- All the tiles are used at the end.
Given N and X, find whether the game is valid.*/

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
		    if(n<=x && x%n==0) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
