/*There is a cricket match going on between two teams A and B.
Team B is batting second and got a target of X runs.
Currently, team B has scored Y runs.
Determine how many more runs Team B should score to win the match.*/
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
		    System.out.println(x-y);
		}

	}
}
