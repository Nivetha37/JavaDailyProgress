/*It is the World Cup Finals.
Chef only finds a match interesting if the skill difference of the competing teams is less than or equal to D.
Given that the skills of the teams competing in the final are X and Y respectively, determine whether Chef will find the game interesting or not.*/
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
		    int d = m.nextInt();
		    System.out.println(Math.abs(x-y)<=d?"YES":"NO");
		}

	}
}
