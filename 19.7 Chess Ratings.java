/*Alice has recently started playing Chess. Her current rating is X.
  She noticed that when she wins a game, her rating increases by 8 points.

Can you help Alice in finding out the minimum number of games she needs to win in order to make her rating greater than or equal to Y?*/
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
		    System.out.println(x>=y?0:(y-x)%8==0?(y-x)/8:(y-x)/8+1);
		}

	}
}
