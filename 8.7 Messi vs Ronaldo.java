/*In Chefland, a football player gets 2 points for each goal and 1 point for each assist.
Messi has A goals and B assists this season, whereas Ronaldo has X goals and Y assists.
Find out the player with more points this season.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int a = m.nextInt();
		int b = m.nextInt();
		int x = m.nextInt();
		int y = m.nextInt();
		
		int messi_score = 2*a+1*b;
		int ronaldo_score = 2*x+1*y;
		
		if(messi_score > ronaldo_score) System.out.println("Messi");
		else if(messi_score < ronaldo_score) System.out.println("Ronaldo");
		else System.out.println("Equal");

	}
}
